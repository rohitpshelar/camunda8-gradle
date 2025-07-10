# camunda8-gradle

1. Step 1 : https://camunda.com/fr/get-started/
   1. Click New Cluster  > click API > Create new Client
   2. After creating Client you will get Cluster URL, ID and SECRET 


2. Step 2 : Create app via https://start.spring.io/
   1. Test it with http://localhost:8080/actuator
   2. Add implementation 'io.camunda.spring:spring-boot-starter-camunda:8.5.19' to build
   3. Open Camunda Moduler EXE, click deployment and  Add Cluster URL, ID and SECRET, in Camunda Moduler EXE from (Step 1.2)
