Feature: Test Sign Up functonality

@regression
Scenario: Verify login to the application with User1
Given User is on login page
When User enter "Pranay" and "Subh@819"
When Click login button
Then User gets logged in