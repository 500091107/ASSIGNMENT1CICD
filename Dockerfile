FROM openjdk:8
EXPOSE 8080
ADD target/upes.devopshons.assignment1.jar upes.devopshons.assignment1.jar
ENTRYPOINT ["java" ,"-jar","/upes.devopshons.assignment1.jar" ]
