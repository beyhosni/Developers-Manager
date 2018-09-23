Developer-Manager REST API : 
This repository provides example of Restful API building with springboot framework.
It describe the relation between developers and the programmingLanguages.

Features
RESTful routing
Models with proper relationships
Controllers/Models etc with proper separation of concerns

Developement-Environnement:
eclipse STS
Spring-boot,java8,maven 3.5.3, H2(database)
postman


How to Run the project:
1-Go to root path project : mvn update
2-build project: mvn clean install
3- Go to target folder and run project : java -jar developpers-manager-0.0.1-SNAPSHOT.jar


RestAPi URL:
******************
Creation-Developer:
http://localhost:8081/developer/add
Post-Request-example: body
{
 "isInternalMember": true,
 "surName": "bey",
 "phoneNumber": "0656727566",
 "name": "hosni",
 "email": "hosni@gmail.com"
}


**********************************************************************
modify the developer informations:http://localhost:8081/developer/edit
update-request-example:body
{
 "isInternalMember": false,
 "surName": "bey",
 "phoneNumber": "0656727566",
 "name": "hosni",
 "email": "hosnibey@gmail.com"
}
****************************
Creation-Programming Language:
http:http://localhost:8081/programmingLanguage/add
Post-Request-example: body
{
 "name":"java"
 "version":"8"
}


******************************************************************************************************************************
Associate programming-language to a developer:http://localhost:8081/attributeLanguageToDeveloper?developerId=2&progLanguageId=1
post-param-request-example:


********************************************
get Developer with there programmingLanguage:
get-request-example: http://localhost:8081/developer/findDevelopersByProgrammingLanguage/java




