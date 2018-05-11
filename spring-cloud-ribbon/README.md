spring-cloud-ribbon
===================

Para executar este exemplo:
- Fazer um mvn clean install sobre o parent pom
- Executar 3 instancias do serviço say-hello:
  - java -jar say-hello\target\say-hello-1.0.0-SNAPSHOT.jar
  - java -jar -Dserver.port=9092 say-hello\target\say-hello-1.0.0-SNAPSHOT.jar
  - java -jar -Dserver.port=9999 say-hello\target\say-hello-1.0.0-SNAPSHOT.jar
- Executar o serviço user:
  - java -jar user\target\user-1.0.0-SNAPSHOT.jar
- Aceder ao endereço: http://localhost:8888/hi?name=João
  - As respostas virão alternadamente de cada uma das 3 instancias de say-hello