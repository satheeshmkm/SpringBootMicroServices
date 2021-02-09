# Project Details


### Dependencies Added
* MySQL Driver
* JDBC API

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>

### Annotations used
* @Autowired
* @Repository

### Classes used
* JdbcTemplate


root user with password as Mukkam83ck
mysql -u root  -p
- show databases;
- create database test;
- use test;
- CREATE TABLE emp    (id INT(10), NAME VARCHAR(50), salay INT(10), department  INT(10), PRIMARY KEY (id )); 