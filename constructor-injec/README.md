mvn exec:java -Dexec.mainClass=com.spring.app.Driver

java -jar -Dapple.awt.UIElement="true" target/constructorinjection-0.0.1-SNAPSHOT.jar -h

```pom.xml
<project xmlns="http://maven.apache.org/POM/4.0.0" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
    http://maven.apache.org/xsd/maven-4.0.0.xsd"
>
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.springcore</groupId>
  <artifactId>constructorinjection</artifactId>
  <version>0.0.1-SNAPSHOT</version>

  <dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.3.23</version>
    </dependency>
  </dependencies>

  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
  </properties>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.3.0</version>
        <!-- <artifactId>maven-compiler-plugin</artifactId>
        <version>3.10.1</version> -->
        <configuration>
          <source>17</source>
          <target>17</target>
          <archive>
            <manifest>
              <mainClass>com.spring.app.Driver</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>

```
