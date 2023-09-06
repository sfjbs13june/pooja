
## Simple calculator app

### Build application

    mvn clean install

### Run Application
    mvn spring-boot:run

### Create docker image

    mvn install dockerfile:build

### Run docker image

    docker run -p 8080:8080 pooja123/security-pooja-app:1.0.0