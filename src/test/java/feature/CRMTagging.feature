Feature: Login to free CRM

@RegressionTest @SmokeTest
Scenario: Login with credentials
Given User is on Login Page
Then user logs in with correct credentials

@E2ETest
Scenario: Navigate to Contact Page
Given User is on Home Page
Then User Navigates to Contacts Page

@SmokeTest
Scenario: Navigate to Deals Page
Given User is on Home Page
Then User Navigates to Deals Page

@E2ETest @RegressionTest
Scenario: Search a case
Given This is search case

@SmokeTest
Scenario: Search a contact
Given This is search conatct test case

@E2ETest
Scenario: Search a call
Given This is search call case

@E2ETest
Scenario: Search a name
Given This is search name case

@SmokeTest
Scenario:  Search a address
Given This is search address case

@E2ETest
Scenario: Search a description
Given This is search descriptio case

@SmokeTest
Scenario: Sear@RegressionTestch a case
Given This is search case

