# Employee-Disbursement-System mini project

### Assumptions

- When there is a new set of employee details available, it will be placed in the input folder
  in the CSV format to be entered in to the DB.
- New employee details will be saved to the database via a daily batch job


### Limitations

- Currently the CSV files will be processed upon receiving the api request to fetch data from the DB due to 
  time constraint and this should be done via a daily scheduled job


### REST API Descriptions

#### Get all employee details in the db with the following get request

http://localhost:8080/api/employees


#### Get all the employee details with a given salary range in the db with the following get request 

- Salary Range to be filtered can be passed via query parameters

http://localhost:8080/api/employees?fromSalary=0&toSalary=4000


### How to run the application

Change the following details in the application.properties accordingly...

- Files to be processed should be placed in a folder called input 
  and provide folder path in the "file.location.input" property
- Files that are already processed will be moved in to a folder called processed 
  and provide folder path in the "file.location.processed" property
- Files with errors will be moved to a folder called error 
  and provide error folder path in the "file.location.error" property


### Test Results

- You can find the developer testing report in the root folder of the project