# neo4j-demo

## 1. neo4j的连接

1.1 使用 spring boot 连接 neo4j <br/><br/>
build.gradle 配置:
```
compile: 'org.springframework.boot:spring-boot-starter-data-neo4j'       
```
application.properties 配置：
```
spring.data.neo4j.uri= bolt:// 127.0.0.1:31101
spring.data.neo4j.username= username
spring.data.neo4j.password= password
```
