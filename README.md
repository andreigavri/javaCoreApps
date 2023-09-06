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
- The student should have a 7-digit unique ID, with the first letter being their first name first letter and last letter being the last name first letter
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
  - showinfo()
