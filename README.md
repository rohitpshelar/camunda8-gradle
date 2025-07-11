# camunda8-gradle
https://camunda.com/
Camunda * can be implement in two ways : 
1. Saas Based (Software as a Service)  - it means Cloud

   1. Step 1 : https://camunda.com/fr/get-started/
      1. Click New Cluster  > click API > Create new Client
      2. After creating Client you will get Cluster URL, ID and SECRET 

   2. Step 2 : Create app via https://start.spring.io/
      1. Test it with http://localhost:8080/actuator
      2. Add implementation 'io.camunda.spring:spring-boot-starter-camunda:8.5.19' to build [See line 9](https://github.com/rohitpshelar/camunda8-gradle/blob/main/README.md)
      3. Open Camunda Moduler EXE, click deployment and  Add Cluster URL, ID and SECRET, in Camunda Moduler EXE from [Go to 1.1.3](#point1.1.3)
