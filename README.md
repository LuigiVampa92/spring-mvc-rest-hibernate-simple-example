# Overview
This is a simple example of rest application accepting and answering json serialized objects

It uses Spring 4.3.2 (core, webmvc, data), Hibernate 4.3.2 as ORM, Jackson 2 for json mapping and liquibase 3.5 for database migrations.
It was designed to run on Tomcat(8) and use PostgreSQL(9.4) as DB.

# Deployment
You have to set connection to database by changing url, user and password in springmvc.properties.
By default project will try connect localhost at standart port 5432, database "postgres", username "postgres", password "postgres".
You can download postgreql server, install it and create that database, or you can set connection to any existing postgres database of your choice.
