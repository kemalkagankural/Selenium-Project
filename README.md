# Selenium Project

# Test Case Description

This repo was created for Selenium Web Testing.Within the project, 2 test scenarios were written using Java Selenium and Page Object Model.In addition, BDD approach has been applied in this project. The BDD approach ensures that the test automation is easily understandable by using a common language that can be understood by all units.Test scenarios and runners are included under "test”.At the same time, Selenium Grid and Docker were used in this project. Selenium Grid is a system that allows testing in different browsers in parallel.

<p align="center" width="100%">
    <img width="100%" alt="Selenium Grid Mimarisi" src="https://miro.medium.com/max/884/1*rpC1U4ZaA4e3m6rL_acpwQ.png"> 
This image  is taken from  the address that "https://medium.com/devopsturkiye/selenium-grid-nedir-d325a19db2bd".  
</p>

Created docker-compose.a selenium grid hub is started with a yaml file and the created tests are run in this environment. The docker-compose file created for this project runs at localhost:4444. The remote browser addresses contained in the java file are set according to this address. Also ı describe Browser options,so you can change the configuration.

## Requirements Before Installation

- Java
- Maven
- Selenium-java
- Webdrivermanager
- Docker

## Test Steps

- Go to home page
- Search for a product
- Add product to cart
- Go to cart and check if the product is added

## Second Test Steps

- Go to home page
- Go to best seller page
- Select a category in best seller categories
- Add most sold product to cart in selected category
- Go to cart and check if the product is added

## Installation Steps

1- The Bash screen opens.
`

2- Selenium Project repo is copied to the local device.

`git clone https://github.com/kemalkagankural/Selenium-Project.git`

3- Then docker compose is executed.

`docker-compose -f docker-compose-v3.yml up `

4- Then the test files are run.

`mvn clean test `

Not: To see what is happening inside the container, head to localhost (password is secret).

