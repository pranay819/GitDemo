Feature: Search the vegetable and verify the results

@SeleniumTest
Scenario: Verify searching vegetables and validate result
Given User is on greenkart page
When User search "Brinjal" vegetable
Then "Brinjal" vegetables gets displayed
