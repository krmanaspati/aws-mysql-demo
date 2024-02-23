FROM openjdk:8
EXPOSE  8080
COPY target/demo-mysql-aws.jar demo-mysql-aws.jar
ENTRYPOINT ["java","-jar","/demo-mysql-aws.jar"]