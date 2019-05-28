# neo4j-demo

## 1. neo4j的连接

1.1 使用 spring boot 连接 neo4j <br/><br/>
build.gradle 配置:
```
compile: 'org.springframework.boot:spring-boot-starter-data-neo4j'       
```
application.yml 配置：
```
spring:
  data:
    neo4j:
      url:
      username:
      password:  
```
