# makersharks
Create user registration and user details fetch endpoints

# Tools and technology
1. Java 11
2. Spring Boot
3. H2 Database
4. Hibernate

# For Running the application
1. Goto the class MakersharksApplication.class That is located inside the package "com.aniket.makersharks" 
2. Run the main method
3. Application will up and running on port localhost:8080
4. Test the API using the below curl details

# Register API

curl --location 'localhost:8080/api/user/register' \
--header 'Content-Type: application/json' \
--data-raw '{
"username": "aniket",
"email" : "aniket@gmail.com",
"password": "aniket"
}'

# Fetch API 

curl --location 'localhost:8080/api/user/fetch?username=aniket'
# Login Details of H2 DB
URL : http://localhost:8080/h2-console/

Then on the console add the following details

* **Driver Class**: org.h2.Driver
* **JDBC URL:** jdbc:h2:mem:makersharks
* **User Name:**	aniket
* **Password:** aniket@123

Then click on **Connect Button** to see the DB and tables etc.