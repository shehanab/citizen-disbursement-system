# Employee-Disbursement-System mini project

### Test Project

Change the file locations in the properties according to following instructions...

- File to be processed should be placed in a folder called input
- Files that is already processed will be moved in to the folder called processed
- Files with errors will be moved to a folder called error

### You can view all the employee details in the db with the following get request

http://localhost:8080/api/employees

### You can view all the employee details with less than given salary in the db with the following get request. 
- Salary Range to be filtered can be passed via query parameters

http://localhost:8080/api/employees?fromSalary?=0&toSalary=4000
