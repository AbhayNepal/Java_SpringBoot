# Java_SpringBoot
## Two entities are defined i.e Role and User table
    
## You can use postman to access those tables with following urls
    1. Post localhost:8080/User to add user, which takes username, email ,password and role(id,name) in json format
    2.Post localhost:8080/Role to add a role, which takes id,name in json format
    3.Get localhost:8080/User or /Role to retreive all users and roles in database
    4.Get localhost:8080/User/{id} or /Role/{id} to retreive respective user or role
    5.Post localhost:8080/User/{id} or /Role/{id} to delete a data from database
    6.Put localhost:8080/User or /Role for updating a user or role in database

## Role based Authorization and Authentication
    1. The url /rest/auth/process is defined to demonstrate role based authentication
    2. User with Admin role can only access the /process request.
    3. User need to enter a valid username and password combination inside the login form which match the username and password combination inside the database.

##  todo
    - you cannot logout after logging in, you need to restart the server for a second login.
    - logout feature.

