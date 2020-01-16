Feature: Login functinality
Scenario Outline:Checking functionality with valid data
Given Go to the web page
When user Enter Loaded "<username>" and "<Password>"
Then User clicks on Login Button

Examples:
| username | Password |
| user1@gmail.com | Pass |
| user2@gmail.com | Pass |
| Admin | admin123 |