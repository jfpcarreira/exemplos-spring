spring-cloud-ribbon
===================

Para executar este exemplo:
- Fazer um mvn clean install sobre o parent pom
- Executar 3 instancias do servi�o say-hello:
  - java -jar say-hello\target\say-hello-1.0.0-SNAPSHOT.jar
  - java -jar -Dserver.port=9092 say-hello\target\say-hello-1.0.0-SNAPSHOT.jar
  - java -jar -Dserver.port=9999 say-hello\target\say-hello-1.0.0-SNAPSHOT.jar
- Executar o servi�o user:
  - java -jar user\target\user-1.0.0-SNAPSHOT.jar
- Aceder ao endere�o: http://localhost:8888/hi?name=Jo�o
  - As respostas vir�o alternadamente de cada uma das 3 instancias de say-hello