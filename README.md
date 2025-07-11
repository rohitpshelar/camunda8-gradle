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
         3. go to for instruction https://github.com/techbuzzblogs/camunda/tree/main/camunda-platform-8.0.0 and download >  docker-compose-core.yaml, I have added it in project
         4. Open  docker-compose-core.yaml Folder and open CMD  and run below command - docker-compose -f docker-compose-core.yaml up -d
         5. Verify by clicks in Docker > Operate/tasklist/connectors with below Default Credentials:
            - Username : demo
            - Password - demo