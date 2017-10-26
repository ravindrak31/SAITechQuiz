Feature: TestLogin
	In order to test login
	As a user
	I want to create a user created.
 
  Scenario:  Login into SAI Global website
   Given the user is on the 'SAI Global website' home page
	When the user enters his details to create login
	Then ensure the user account is created
	And user is able to login