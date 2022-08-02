1.docker pull mongo:latest

2.docker run -d -p 27017:27017 --name kctiraj44mongodb mongo:latest

spring:
data:
mongodb:
database: Book
host: kctirajmongodb
port: 27017

3.docker build -t springboot-mongodb:1.0 .

4. docker run -p 8080:8080 --name springboot-mongodb --link kctiraj44mongodb:mongo -d springboot-mongodb:1.0

5.inside resource : docker-compose up

