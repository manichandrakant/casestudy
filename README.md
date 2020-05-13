# casestudy

This project consists of three sub-projects which are individual microservices
a. product has api's to save, retrieve a product, retrieve product name and price given product id, update product price given product id
b. product-data has api's to save and retrieve product name
c. product-price has api's to save and retrieve product price

Spring Boot is used for rest api and for each microservice

Stpes to bring up microservice. The below works if you have maven installed and MAVEN_HOME or M2_HOME environment variable is set.

1. Go to product folder. Do **mvn clean install**. Do **mvn spring-boot:run**
2. Go to product-data folder. Do **mvn clean install**. Do **mvn spring-boot:run**
3. Go to product-price folder. Do **mvn clean install**. Do **mvn spring-boot:run**
All the three microservices will start.

If maven is not installed, we can use the maven wrapper command, build and start the microservices.
For Building: mvnw clean install
For Starting: mvnw spring-boot:run 

Steps to Create Data and check functionality.
Open a git-bash terminal and use the following commands to create some data.

PRODUCT:
    Create Products
    curl -X PUT localhost:8080/products -H 'Content-type:application/json' -d '{"rating": 4.5, "type": "Electronics"}'
    curl -X PUT localhost:8080/products -H 'Content-type:application/json' -d '{"rating": 3.2, "type": "Furniture"}'
    Get All Products
    curl -v localhost:8080/products

PRODUCT-DATA:
    Create Product Data for Product 1
    curl -X PUT localhost:8081/productdata -H 'Content-type:application/json' -d '{"pid": 1, "name": "Redmi MiTV 55"}'
    Create Product Data for Product 2
    curl -X PUT localhost:8081/productdata -H 'Content-type:application/json' -d '{"pid": 2, "name": "Royaloak 5-Seater Sofa Leatherite"}'
    Get all Products Data
    curl -v localhost:8081/productdata
    Get Product Data for Product 1
    curl -v localhost:8081/productdata/1
    Get Product Data for Product 2
    curl -v localhost:8081/productdata/2
    
PRODUCT-PRICE:
    Create Product Price for Product 1
    curl -X PUT localhost:8082/productprice -H 'Content-type:application/json' -d '{"pid": 1, "price": 49999.99}'
    Create Product Price for Product 2
    curl -X PUT localhost:8082/productprice -H 'Content-type:application/json' -d '{"pid": 2, "price": 121399.99}'
    Get all Products Prices
    curl -v localhost:8082/productprice
    Get Product Price for Product 1
    curl -v localhost:8082/productprice/1
    Get Product Price for Product 2
    curl -v localhost:8082/productprice/2
    
Once the data is created, the scenarios below can be executed.
Scenario 1: Api which retrieves product name from product-data microservice and product price from product-price microservice.
            Combines the data and gives one consolidated response at /products/{id} (GET)
    Get Details of Product 1
    curl -v localhost:8080/products/1
    Get Details of Product 2
    curl -v localhost:8080/products/2
    
Scenario 2: Api which updates product price and gives one consolidated response at /products/{id} (POST)
    curl -X POST localhost:8080/products/2 -H 'Content-type:application/json' -d '{"id":2,"rating":3.2,"type":"Furniture","name":"Royaloak 5-Seater Sofa Leatherite","price":221399.99}'
Scenario 2 can also be validated by going to product-price microservice and using the below curl command.
    curl -v localhost:8082/productprice/2
This will give the updated price of product 2

For this whole exerise, in-memory H2 database is used. So the data of the corresponding microservices will not be retained if any of the microservices is stopped.

Improvements in the code
The below improvements can be made in the code.
1) Using of logging
2) Using of comments
3) Security (Using https)
4) Api Versioning
5) Api Security (Using OAuth 2 or Basic Authentication)
6) Unit test cases
