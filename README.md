# Camunda 8 Gradle Integration

![Camunda](https://img.shields.io/badge/Camunda-8-orange?logo=camunda&logoColor=white)

This project demonstrates how to integrate Camunda 8 with a Spring Boot application using Gradle. It covers both SaaS and self-managed deployments, task handling, variables, and connectors.

## Table of Contents
- [Deployment Options](#deployment-options)
    - [SaaS (Cloud) Deployment](#saas-cloud-deployment)
    - [Self-Managed Deployment](#self-managed-deployment)
- [Task Types](#task-types)
    - [User Task](#user-task)
    - [Service Task](#service-task)
- [Variables Handling](#variables-handling)
- [Connectors](#connectors)
    - [Inbound Connectors](#inbound-connectors)
    - [Outbound Connectors](#outbound-connectors)

## Deployment Options

### SaaS (Cloud) Deployment

1. **Set up Camunda Cloud**
    - Go to [Camunda Get Started](https://camunda.com/fr/get-started/)
    - Login at [Camunda Cloud Login](https://weblogin.cloud.camunda.io/)
    - Create a new cluster and generate API credentials (Client ID and Secret)

2. **Create Spring Boot Application**
    - Use [Spring Initializr](https://start.spring.io/)
    - Add Camunda dependency:
      ```gradle
      implementation 'io.camunda.spring:spring-boot-starter-camunda:8.5.19'
      ```
    - Test with: `http://localhost:8080/actuator`
    - Configure Camunda Module with your cluster credentials

### Self-Managed Deployment

1. **Install Docker**
    - Download from [Docker Desktop for Windows](https://docs.docker.com/desktop/setup/install/windows-install/) (~500MB)
    - Complete the installation process

2. **Set up Camunda**
    - Choose a version from [Camunda Distributions](https://github.com/camunda/camunda-distributions/tree/main/docker-compose/versions)
    - Run:
      ```bash
      docker-compose -f docker-compose-core.yaml up -d
      ```
    - Access components with default credentials:
        - Username: `demo`
        - Password: `demo`

## Task Types

### User Task
- Sample BPMN: [`sample.bpmn`](src/main/resources/sample.bpmn)
- Deployable via Camunda Modeler or programmatically

### Service Task
- Sample BPMN: [`service-task-session.bpmn`](src/main/resources/service-task-session.bpmn)
- Requires job type definition
- Implementation: [`ProductOrder.java`](src/main/java/com/example/camunda8_gradle/worker/ProductOrder.java)
- Automatically executes when task is completed

## Variables Handling
- Methods sending data to Camunda must have return types
- Methods reading data should use `@Variable` annotation
- Example in [`ProductOrder.java`](src/main/java/com/example/camunda8_gradle/worker/ProductOrder.java)

## Connectors

### Inbound Connectors (External System → Camunda)
- **Webhook Implementation**: [`webhook-inbound-connector.bpmn`](src/main/resources/webhook-inbound-connector.bpmn)
- Tested with Postman: [`Camunda8-Gradle.postman_collection.json`](Camunda8-Gradle.postman_collection.json)

##### URL Formats:
- **SaaS**:  
  `http(s)://<camunda.client.cloud.region>.connectors.camunda.io/<..cloud.cluster-id>/inbound/<bpmn::webhook ID>`
- **Local**:  
  `http://localhost:8085/inbound/<bpmn::webhook ID>`

### Outbound Connectors (Camunda → External System)


---

For more information, visit the [official Camunda website](https://camunda.com/).