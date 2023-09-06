# Java Core Applications

### Email Application
This application should perform the following tasks:

- Generate an email with the following syntax: `firstname.lastname@department.company.com`.
- Determine the department (sales, development, accounting), leaving it blank if none.
- Generate a random string for a password.
- Provide set methods to change the password, set the mailbox capacity, and define an alternate email address.
- Offer get methods to display the name, email, and mailbox capacity.

### Student Database Application
Your application should do the following:

- Ask the user how many new students will be added to the database
- The user should be prompted to enter the name and year for each student
- The student should have a 7-digit unique ID, with the first letter being their first name, first letter and last letter being the last name first letter
- A student can enroll in the following courses:
`History 101`
`Mathematics 101`
`English 101`
`Chemistry 101`
`Computer Science 101`
- Each course costs $600 to enroll
- The student should be able to view their balance and pay the tuition
- To see the status of the student, we should see their name, ID, courses enrolled, and balance

### Bank Application
You are a back-end developer and need to create an application to handle new customer bank account requests.
Your application should do the following:

- Read a .csv file of names, social security numbers, account type, and initial deposit
- Use a proper data structure to hold all these accounts
- Both savings and checking accounts share the following properties:
  - deposit()
  - withdraw
  - transfer()
  - showInfo()
  - 11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)
 

- Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
- Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN
- Both accounts will use an interface that determines the base interest rate.
- Savings accounts will use .25 points less than the base rate Checking accounts will use 15% of the base rate
- The showInfo method should reveal relevant account information as well as information specific to the Checking account or Savings account.
