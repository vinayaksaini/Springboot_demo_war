FROM openjdk:12-alpine
COPY target/*war /demo.war
RUN sh -c 'touch /usr/local/tomcat/webapps/demo.war'
ENTRYPOINT ["sh", "-c", ""]