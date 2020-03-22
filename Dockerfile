FROM openjdk:8
ADD target/docker_java.jar docker_java.jar
CMD ["java", "-jar" , "docker_java.jar"]