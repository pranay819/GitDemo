Feature: Test login functionality

Background:
Given User open the browser
When User hit the link in browser
Then application login page gets displayed

@regression @smoke
Scenario: Verify user able to login with valid username and paswword
Given User is on login page
When User enter username and password
When Click login button
Then User gets logged in

@smoke
Scenario: Verify user is not able to logged in 
Given User is on login page
When User enter invalid username and password
When Click login button
Then Error message gets displayed

@regression
Scenario: Verify login to the application with User1
Given User is on login page
When User enter "Pranay" and "Subh@819"
When Click login button
Then User gets logged in

@100
Scenario: Verify login to the application with User2
Given User is on login page
When User enter "Sonu" and "Sonu@819"
When Click login button
Then User gets logged in

Scenario: Verify login to the application with User3
Given User is on login page
When User enter "Sanu" and "Sanu@819"
When Click login button
Then User gets logged in

Scenario Outline: Verify login functionality with multiple users
Given User is on login page
When User enter username <Username> and password <Password>
When Click login button
Then User gets logged in

Examples:
|Username|Password|
|pranay|123|
|sanu|456|
|sonu|789|

Scenario: Verify user sign up functionality
Given User is on login page
When User enter below details on sign up page
|pranay|nikam|pranay819@gmail.com|29/05/1989|pune|
|sonu|nikam|pranay819@gmail.com|29/05/1989|pune|
When Click login button
Then User gets logged in

