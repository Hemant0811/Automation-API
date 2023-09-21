Feature: Google Place Functionality

Scenario Outline:: create new place on the google map
Given user prepare a request with Payload "<name>" "<phoneNumber>" "<Address>"
Given user send the "POST" request
Then user get status code "200"
Then validate "status" value is "OK"
Then validate "scope" value is "APP"
And  verify Place_Id created maps to "<name>"

Examples: 
|name|phoneNumber|Address|
|Ramesh|9899797809|Delhi|
|Mohit|9090876876|UttarPradesh|