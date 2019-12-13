Feature: Free CRM Contact Deals Feature 

Scenario: Create deals Test scenario 
	Given User is already on login page 
	Then user enters username and password 
		| username				 | password	 |	 	
		| sayali151995@gmail.com | Sayali@24 |
	And user clicks on login button 
	When user moves to deal page
	Then user enters deals details and saves 
		| title		| amount | description | 
		| testdeal1 | 1000	 | sdfghjdsAFa |
		| testdeal1 | 2000	 | qwertyuiopp |
		
	Then closes the browser 
	
	
		 	