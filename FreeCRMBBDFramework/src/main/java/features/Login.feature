Feature: Free CRM login feature

Scenario: Free CRM Login Test scenario

Given user is already on Login page
When title of the Login page is Free CRM 
Then user enters username and password 
And user clicks on login button
Then user is on home page

Scenario: user is able to create new contact

Given user is already on home page
When user mouse over on contacts
Then user clicks on new contacts
Then user enters firstname and lastname
Then user clicks on save button 
Then verify contact created

