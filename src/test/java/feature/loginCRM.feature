Feature: Free CRM Login Feature

  Scenario Outline: Login Test Scenario
    Given User is already on login page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    And user clicks on login button
  And is already on home page
  When user clicks on contacts link
  Then user clicks on new contacts link
  Then user enters first and last name
  Then user clicks on save button
  Then verify if new contact is created
  
  Examples:
  	| username 				 | password  |
  	| sayali151995@gmail.com | Sayali@24 | 
  	| tom 					 | 123       | 	
  	| tstst					 | 987		 | 	 	