Feature: Test Sign Up functonality

@regression
Scenario: Verify login to the application with User1
Given User is on login page
When User enter "Pranay1" and "Subh@819"
When Click login button
Then User gets logged in


@regression
Scenario: Verify login to the application with User1
Given User is on login page
When User enter "Pranay2" and "Subh@819"
When Click login button
Then User gets logged in