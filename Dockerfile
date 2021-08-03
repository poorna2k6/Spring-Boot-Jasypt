FROM openjdk:8-jre-alpine
ADD src/main/resources/SpringbootPwdEncryptionUsingJasypt-0.0.1-SNAPSHOT.jar springBootPwdEncJasypt.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "springBootPwdEncJasypt.jar"]
EXPOSE 8087