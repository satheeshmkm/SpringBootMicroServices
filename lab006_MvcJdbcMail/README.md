# Project Details
Date:20201209

### Dependencies Added
* Spring Web
* Validation
* Java Mail Sender
* JDBC API
* MySQL Driver

* JASPER
* JSTL

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-mail</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
		</dependency>
		<dependency>
			<groupId>jstl</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>

### Annotations used
* @Controller
* @GetMapping
       @GetMapping("/index")

### Classes used
* ModelAndView

### application.properties
* server.port
* server.servlet.context-path
* spring.mvc.view.prefix
* spring.mvc.view.suffix

### DB setup
root user with password as Mukkam83ck
mysql -u root  -p
- show databases;
- create database test;
- use test;
- CREATE TABLE customer_tab ( email VARCHAR(50), firstName VARCHAR(30), lastName VARCHAR(30), password VARCHAR(30), gender VARCHAR(10), age INT(10), contactNumber VARCHAR(15), dateOfBirth DATETIME, country VARCHAR(30) PRIMARY KEY (email)); 
- SHOW TABLES;
- DESC customer_tab;

### Running the application
http://localhost:2121/crm/index