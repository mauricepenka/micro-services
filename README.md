# micro-services
communication entre les micro services REST

java -jar payara-micro-5.191.jar --noCluster --port 8280 --deploy CrudPersistence.war



java -jar payara-micro-5.191.jar --noCluster --port 8180 --deploy CrudController.war

java -jar payara-micro-5.191.jar --noCluster --deploy weather-service.war

mvn spring-boot:run
