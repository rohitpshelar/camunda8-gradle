# camunda8-gradle
https://camunda.com/

Camunda 8 can be implement in two ways : 
   1. Saas Based (Software as a Service)  - it means Cloud
   
      1. Step 1 : https://camunda.com/fr/get-started/
         1. Click New Cluster  > click API > Create new Client
         2. After creating Client you will get Cluster URL, ID and SECRET 
   
      2. Step 2 : Create app via https://start.spring.io/
         1. Test it with http://localhost:8080/actuator
         2. Add implementation 'io.camunda.spring:spring-boot-starter-camunda:8.5.19' to build 
         3. Open Camunda Moduler EXE, click deployment and  Add Cluster URL, ID and SECRET, in Camunda Moduler EXE from [See line 8](https://github.com/rohitpshelar/camunda8-gradle/blob/main/README.md#L8)


   2. Self Managed (Docker Compose & Kubernetes)
      1. Install Docker
         1. Download from -  https://docs.docker.com/desktop/setup/install/windows-install/ (Around 500mb)
         2. Install exe file and complete process
         3. select latest version from https://github.com/camunda/camunda-distributions/tree/main/docker-compose/versions and download >  folder
         4. Open Folder and open CMD and run below command - docker-compose -f docker-compose-core.yaml up -d
         5. Verify by clicks in Docker > Operate/tasklist/connectors with below Default Credentials:
            - Username : demo
            - Password : demo
      

   3. TASK
      1. USER-TASK : [sample.bpmn](src/main/resources/sample.bpmn) just contain USER-TASK and i was able to deploy via camundamoduler.exe and java code,
      2. SERVICE-TASK : [service-task-session.bpmn](src/main/resources/service-task-session.bpmn) contains both USER-TASk and SERVICE-TASK (here you need to provide job type, i used productorder for which i created class [ProductOrder.java](src/main/java/com/example/camunda8_gradle/worker/ProductOrder.java) )
      then i was able to start new instance via camundamoduler.exe and i was able to complete task then [ProductOrder.java](src/main/java/com/example/camunda8_gradle/worker/ProductOrder.java) method got executed automatically.
      

   4. Variables (Ref - [ProductOrder.java](src/main/java/com/example/camunda8_gradle/worker/ProductOrder.java) )
      1. Method which send data to camunda should have return type 
      2. Method which reads data should use @Variable 