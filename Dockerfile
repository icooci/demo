#
# Dockerfile for Spring Boot Demo
#

FROM openjdk:8-jre-alpine
LABEL maintainer="ICOOCI.ST.J <icooci@cloud.io>"

COPY target/demo-0.1.jar demo.jar
ENTRYPOINT ["java", "-jar", "demo.jar"]
