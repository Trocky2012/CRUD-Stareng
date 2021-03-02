/*
-- TEST REQUESTS FOR A CRUD (CREATE, RETRIEVE, UPDATE AND DELETE) --


-- ON POSTMAN:*/



/*---  CREATE  ---*/
POST-> Body -> raw(JSON): http://localhost:8080/users
{
"name": "Gui Ribas",
"email": "gui@gmail.com",
"phone": "545454545",
"password": "12345678"
} 



/*---  RETRIEVE  ---*/
GET -> http://localhost:8080/users
GET -> http://localhost:8080/users/1
GET -> http://localhost:8080/users/2
GET -> http://localhost:8080/users/3



/*---  UPDATE  ---*/
PUT -> Body -> raw(JSON): http://localhost:8080/users/1
{
"name": "Thiago Cavalheiro",
"email": "thiagocavalheiro@email.com",
"phone": "555555555"
}



/*---  DELETE  ---*/
DELETE -> http://localhost:8080/users/2