Feature: Free CRM app test 


@First	
Scenario Outline: Create contact Test scenario 
	When user clicks on contacts link 
	Then user clicks on new contacts link 
	Then user enters details "<firstname>" and "<lastname>" and "<email>" 
	Then user clicks on save button of details page 
	
	Examples: 
		| firstname | lastname | email |
		| Tom		| jj	   | ASE   |		
		| Peter	 	| dsf 	   | SE	   |
@Second	
Scenario: Create deals Test scenario  
	Then user enters deals details 
		| testdeal | amount | description | 
		
		
		
