# SpringDataJDBCDemo
SpringBoot 2.0에서 Spring-Data-JDBC 라이브러리를 사용하여 데이터베이스에 접근하는 샘플 코드

## Maven
```xml
<!-- spring-data-jdbc -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jdbc</artifactId>
</dependency
<!-- hsqldb -->
<dependency>
    <groupId>org.hsqldb</groupId>
    <artifactId>hsqldb</artifactId>
    <version>2.4.1</version>
    <scope>test</scope>
 </dependency>
<!-- mysql -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>
```

## Spring-Data-JDBC 설정
* 패키지 위치 : src/main/java/com.springdata.jdbc.demo
* entity/UserInfo.java
* repository/UserInfoRepository.java

## 테스트
* 패키지 위치 : test/java/com.springdata.jdbc.demoSpringdatajdbcApplicationTests.java

## HSQL / mySQL 

### HSQL
* 임베디드 데이터베이스로 테스트용도로 사용
* 실행 시에 스프링부트가 resources/schema.sql 에 정의된 쿼리를 자동으로 실행하여 초기화한다.
* application.yml 설정 변경 : `spring.profiles.active: hsql`

### mySQL
* docker 설치 후 resources/docker-compose.yml 을 통해서 가상 mysql 실행가능.
* mysql에서 직접 mysql.sql 쿼리를 실행하여야 한다.
* application.yml 설정 변경 : `spring.profiles.active: mysql`
