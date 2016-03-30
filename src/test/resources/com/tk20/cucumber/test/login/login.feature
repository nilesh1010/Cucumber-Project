Feature: login into tk20 aapplication

In order to access the tk20 application
I will need to login as Admin

@login
Scenario Outline: Login into tk20 aapplication

Given I go to "URL" on "<Browser>"
And I enter "loginusername" as "<Username>"
And I enter "loginpassword" as "<Password>"
And I click on "loginButton"
Then Login should be "<Expected_Result>"

 Examples:
|Browser     | Username            			| Password 	   | Expected_Result |
| Mozilla    |rhill                         | d3bug@pp     | success         |
| Chrome     |tk20                          | d3bug@pp     | success         |
| Mozilla    |tk20                          | d3bug@pp     | success         |
| Chrome     |rhill                          | d3bug@pp     | success         |



 
