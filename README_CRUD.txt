/*
-- TEST REQUESTS FOR A CRUD (CREATE, RETRIEVE, UPDATE AND DELETE) --

--------------------------------------------------------------------

-- ON POSTMAN:*/

--------------------------------------------------------------------
/*---  CREATE - USER  ---*/
POST-> Body -> raw(JSON): http://localhost:8080/users
{
"name": "Gui Ribas",
"email": "gui@gmail.com",
"phone": "545454545",
"password": "12345678"
} 
--------------------------------------------------------------------
/*---  CREATE - POST  ---*/
{
    "timestamp": "2021-08-15T14:30:00Z",
    "type": "DEFAULT",
    "title": "NEW POST",
    "comment": "Teste",
    "imageUrl": "null.com",
    "user": {
        "id": 1,
        "name": "Thiago Trolle",
        "email": "thiago@email.com",
        "phone": "(51)988888888",
        "password": "123456"
    }
}
--------------------------------------------------------------------
/*---  RETRIEVE - USER ---*/
GET -> http://localhost:8080/users
GET -> http://localhost:8080/users/1
GET -> http://localhost:8080/users/2
--------------------------------------------------------------------
/*---  RETRIEVE - POST ---*/
GET -> http://localhost:8080/posts
GET -> http://localhost:8080/posts/1
GET -> http://localhost:8080/posts/2
--------------------------------------------------------------------
/*---  UPDATE - USER ---*/
PUT -> Body -> raw(JSON): http://localhost:8080/users/1
{
  "name": "Thiago Cavalheiro",
  "email": "thiagocavalheiro@email.com",
  "phone": "555555555"
}
--------------------------------------------------------------------
/*---  UPDATE - POST---*/
{
  "timestamp": "2021-08-20T10:30:00Z",
  "title": "UPDATE POST",
  "comment": "UPDATE Teste"
}
--------------------------------------------------------------------
/*---  DELETE - USER  ---*/
DELETE -> http://localhost:8080/users/2
--------------------------------------------------------------------
/*---  DELETE - POST  ---*/
DELETE -> http://localhost:8080/posts/1
--------------------------------------------------------------------
