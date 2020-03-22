FROM openjdk:8
ADD target/test_java.jar test_java.jar
CMD ["java", "-jar" , "test_java.jar"]