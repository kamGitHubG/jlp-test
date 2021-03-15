## Project Information

The project has been develop as part of the test.   The functionality involves calling an jlp product external api and then transforming the external api data to specified mapping, and returning the response in the form of mapped product data.

### IMPLEMENTATION

The project has been implemented as Spring boot web Rest API.   A 

The endpoints for performing above tasks are as follows -

`http://localhost:8080/reducedProducts`

`http://localhost:8080/reducedProducts?labelType=ShowWasThenNow`

`http://localhost:8080/reducedProducts?labelType=ShowPercDscount`


### Example CURL commands

 - Call the api with default labels -
`curl --location --request GET 'http://localhost:8080/reducedProducts'`

 #### Above commands can also be executed via GUI tools like POSTMAN and SOAP UI.  jlp-test.postman_collection.json is included in the project base directory that can directly be imported in PostMan.

### Other details

 - Technology stack is Java 8, Spring Boot 2.4.2, Maven, JUnit, Cucumber.
 - To build and test the application run following command from project base directory 
 `mvn clean install`
 - To run the application run following command from project base directory -`mvn spring-boot:run`
OR
`java -jar target/jlp-test-0.0.1-SNAPSHOT.jar`
  
 - Functional test cases have been implemented using Spring Boot Test and Cucumber framework.
