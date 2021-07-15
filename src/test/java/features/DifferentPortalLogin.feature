Feature: Verify login to the different portal

@WebTest
Scenario: Verify user able to login with valid username and paswword
Given User is on login page
When User enter username and password
When Click login button
Then User gets logged in

@MobileTest
Scenario: Verify user is not able to logged in 
Given User is on login page
When User enter invalid username and password
When Click login button
Then Error message gets displayed
