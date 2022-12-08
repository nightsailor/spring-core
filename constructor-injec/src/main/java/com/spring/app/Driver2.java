package com.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        MemberShip memberShip = context.getBean("memberShipObj", MemberShip.class);
        System.out.println(memberShip);
    }
}