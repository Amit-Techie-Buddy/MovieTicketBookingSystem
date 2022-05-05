# MovieTicketBookingSystem
REST APIs for B2B and B2C Movie Ticket Booking

 
Project overview:
XYZ Company REST APIs for B2B and B2C


Tech stack
Spring boot
Restful API
CORS
Spring data with mongoDB repositories
Spring security
MongoDB
Testing : JUnit/Mockito/
Java 11

API docs /v1/api

Customer
GET /customers : queries all customer
GET /customers/id: queries the customer wiht mongo object id
POST /customers : save customer record json
DELETE customers/id: delete the customer by mongo object id
GET : customers/search/findByEmail?email=xyz@gmail.com: find customer by customer id

How to run Locally

mvn spring-boot:run

Docker:

docker-compose up
Attach bash to the running Mongo container
docker exec -i -t springboot-mongo /bin/bash

Swagger API docs
Open Swagger API doc : localhost:8080/swagger-ui.html

Basic commands to run with mongoDB
show dbs
use dbbasename
show collections
db.movie.find()
