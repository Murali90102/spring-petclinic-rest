FROM tomcat:9.0

COPY target/spring-petclinic-rest-3.0.2.war /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]