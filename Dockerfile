FROM debian

RUN mkdir /usr/local/tomcat

WORKDIR /usr/local/tomcat
RUN apt-get update
RUN apt-get -y install default-jre
COPY build/apache-tomcat-9.0.58.tar.gz .
RUN tar xf apache*.tar.gz
RUN mv apache-tomcat-9.0.58/* /usr/local/tomcat/.

WORKDIR /usr/local/tomcat/lib
COPY build/keycloak-oidc-tomcat-adapter-16.1.1.tar.gz .
RUN tar xf keycloak-oidc-tomcat-adapter-16.1.1.tar.gz

WORKDIR /usr/local/tomcat/webapps
COPY build/api-rest-vol.war .

EXPOSE 8080

CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
