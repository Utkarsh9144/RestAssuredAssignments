Feature: Foreign Exchange Reference Rate

@tag1
Scenario: Validating response code and using log() method
Given API for foreign  exchange.
When posted with correct information. 
Then validate response for request using log method

@tag2
Scenario: Validating response code and using log() method
Given API for foreign exchange with incorrect URI
When posted with incorrect information. 
Then validate response code for request using log method