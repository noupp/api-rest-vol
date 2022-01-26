# Step 1
FROM tomcat:9.0-jdk11

ENV TOMCAT_HOME = "/usr/local/tomcat"

# tomcat
COPY target/api-rest-vol.war $TOMCAT_HOME/webapps/

# keycloak
WORKDIR $TOMCAT_HOME/lib
COPY target/keycloak-oidc-tomcat-adapter-16.1.1.tar.gz .
RUN tar xf keycloak-oidc-tomcat-adapter-16.1.1.tar.gz

EXPOSE 8080
