FROM openjdk:11
ADD target/sorteo_api.war sorteo_api.war
EXPOSE 8080
ENTRYPOINT [ "java","-jar","sorteo_api.war" ]
