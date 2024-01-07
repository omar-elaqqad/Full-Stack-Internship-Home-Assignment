## DNA Engineering Full-Stack Assignment
Build a CSV Parser.

## Table of content
- [Prerequisites](#prerequisites)
- [Before We begin](#before-we-begin)
- [Assignment](#assignment)
- [What we expect](#what-we-expect)
- [Bonus points](#bonus-points)
- [My Approach](#my-approach)

## Prerequisites
- Java 17
- Node Js v20.10.0

## Before we begin
- In this assignment, you will be asked to write, and test your code.
- Make sure you respect clean code guidelines.
- Read the assignment carefully.

## Description
You are invited to create a CSV parser using Java/Spring Boot, and build UI to display results using Next.js/React.

## Assignment

### Backend (CSV Parser)

#### Tasks

- Write a service in Java that will read and process the attached CSV(comma separated values) file at `data/employees.csv`.

- This service should read, extract and process data in a suitable data structure.

- Process this data to return the list of employees and a summary indicating the average salary for each job title.

### Frontend

#### Tasks
Implement a simple user interface that will allow the user to upload the file and display the results of your processing.

#### Interfaces

Respect the following design flow:

![Frontend interfaces](./static/interfaces.png)

- **Interface-1**: Contain an upload button.
- **Interface-2**: The Process button is added when you choose a file.
- **Interface-3**: 2 Tables showing the processing results.

**Table 1**: Employee information, displays a paginated list of employees.

**Table 2**: Jobs summary, displays for each job title, the average salary for employees.

## What we expect
- Write a concise, easy to understand code.
- Use good practices.
- Write unit tests for your java code.
- Append to this README your approach and provide instructions to run your project.

## Bonus points
- Implement your own CSV file parser instead of using a library.
- Use design patterns.
### My Approach
## Backend:
- verified the necessary dependencies for spring.
- Created a service (EmployeeService) with the anotation @Service to read and process the Employee CSV file.
- Implemented controller endpoints to handle file uploads (/api/employees/upload), retrieve employees (/api/employees//getEmployees), , and job summaries  (/api/employees/upload/getJobSummary) with the anotation @RestController.
- Enabled CORS using the @CrossOrigin annotation in the controller to allow cross-origin requests from the frontend.
## Frontend
- installing the necessary packages such as axios.
- Created a FileUpload Component (FileUploader.js) to handle file uploads and i used axios to make requests to the backend.
- Created an Upload Page (pages/upload) that uses the FileUploader component and Displayed an alert when a file is uploaded.
- Created an Employees Component (Employees.js) to display employee data and average salary per job title in a table with pagination. i used axios to fetch employee data and job summay from the backend.
-  Created a Process Page (pages/process) that uses the Employees Component and display the table of employees with pagination and the job summary.
-  i added some styles to enhance the user interface.
## Testing 
-i tested the connetion between the backend and frontend.
## App
- home page:![image](https://github.com/omar-elaqqad/Full-Stack-Internship-Home-Assignment/assets/80116765/b2476db3-8a78-4410-bf71-463aea3d5cea)
- Upload Page : ![image](https://github.com/omar-elaqqad/Full-Stack-Internship-Home-Assignment/assets/80116765/e5a4cf26-36b0-4117-8f7e-20997e10bb80)
- Process Page :




