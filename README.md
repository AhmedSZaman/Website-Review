# RMIT SEPT 2021 Major Project

# Group Day-Time

## Members
* James Donnelly    s3748552
* Dawin Lee         s3693346
* Sean Michael Wong s3786110
* Ahmed Sher Zaman  s3813842

## Records

* Github repository :https://github.com/James-Donnelly/SEPT_Project
* jira Board : https://sept-s2-2021-project.atlassian.net/

	
## Code documentation - Release 0.1.0 - date
* feature 1
* feature 2
* feature 3
  

To run the application locally : 
1) cd into each and every microservice (ms_booking, ms_availability, ms_profiles, ms_service) and run :
2) ./mvnw package && java -jar target/ms_[microservice]-0.0.1-SNAPSHOT.jar
3) cd into FrontEnd/myfirstapp
4) run "npm install"
5) run "npm start"

To run backend:
1) make sure java is installed (was not installed for me (sean) by default in wsl ubuntu. If java is installed go to step 3
2) if java is not installed, install java. I just did `sudo apt-get install openjdk-8-jre`
3) cd into the microservice directory, e.g. `./SEPTProject/BackEnd/loginmicroservices` and run `sudo chmod +x ./mvnw`
4) run the program using the given command. e.g. `./mvnw package && java -jar target/ms_login-0.0.1-SNAPSHOT.jar` (The text to sub in for the [microservice] part of the command string can be found from the name of the java class of the microservice. e.g. `SEPT_Project/BackEnd/loginmicroservices/src/main/java/com/rmit/sept/bk_loginservices/ms_login.java`
