# Version simple

1) build
gradle bootJar 

2) run
java -jar build/libs/EjemploMicroservicio-0.1.0.jar --server.port=8090


# Con myBatis y Oracle DB
# Siguiendo tutorial en https://medium.com/@edudeveloper6390/spring-boot-swagger-gradle-3fd83fcc28e1

Previo a Version simple:

1) Descargar ojdbc8.jar

2) mvn install:install-file -Dfile=ojdbc8.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=18.3 -Dpackaging=jar

