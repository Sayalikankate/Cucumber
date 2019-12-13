Feature: Free CRM Contact creation Feature 

Scenario Outline: Create contact Test scenario
	Given User is already on login page 
	When title of login page is Free CRM 
	Then user enters "<username>" and "<password>" 
	And user clicks on login button 
	When user clicks on contacts link
	Then user clicks on new contacts link
	Then user enters details "<firstname>" and "<lastname>" and "<email>"
	Then user clicks on save button 
	Then closes the browser
	
	Examples: 
		| username 				 | password  | firstname | lastname | email |
		| sayali151995@gmail.com | Sayali@24 | Tom		 | jj		| ASE	   |		
		| sayali151995@gmail.com | Sayali@24 | Peter	 | dsf 		| SE	   |
		 	