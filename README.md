# neo4j-demo

## connection

* 使用 spring boot 连接 neo4j
>
gradle 配置:
```
compile: 'org.springframework.boot:spring-boot-starter-data-neo4j'       
```
>
application 配置：
```
spring:
  data:
    neo4j:
      url:
      username:
      password:  
```