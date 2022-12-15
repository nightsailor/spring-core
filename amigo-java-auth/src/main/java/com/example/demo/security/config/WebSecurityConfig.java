package com.example.demo.security.config;

import java.beans.JavaBean;

import com.example.demo.appuser.AppUserService;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

// import lombok.AllArgsConstructor; 1

@Configuration
// @AllArgsConstructor 1
@EnableWebSecurity
public class WebSecurityConfig // extends WebSecurityConfigurerAdapter {
{
  private final AppUserService appUserService;
  private final BCryptPasswordEncoder bCryptPasswordEncoder;

  public WebSecurityConfig(AppUserService appUserService, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.appUserService = appUserService;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  /*
   * @Override
   * protected void configure(HttpSecurity http) throws Exception {
   * http
   * .csrf().disable()
   * .authorizeRequests()
   * .antMatchers("api/v* /registration/**")
   * .permitAll()
   * .anyRequest()
   * .authenticated().and()
   * .formLogin();
   * }
   * 
   * @Override
   * protected void configure(AuthenticationManagerBuilder auth) throws Exception{
   * auth.authenticationProvider(daoAuthenticationProvider());
   * }
   */

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .csrf().disable()
        .authorizeRequests()
        .requestMatchers("api/v*/registration/**")
        .permitAll()
        .anyRequest()
        .authenticated().and()
        .formLogin();

    return http.build();
  }

  @Bean
  public AuthenticationManager authManager(HttpSecurity http) throws Exception {
    AuthenticationManagerBuilder authenticationManagerBuilder = http
        .getSharedObject(AuthenticationManagerBuilder.class);
    authenticationManagerBuilder.authenticationProvider(daoAuthenticationProvider());
    return authenticationManagerBuilder.build();
  }

  @Bean
  public DaoAuthenticationProvider daoAuthenticationProvider() {
    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

    provider.setPasswordEncoder(bCryptPasswordEncoder);
    provider.setUserDetailsService(appUserService);
    return provider;
  }

}
