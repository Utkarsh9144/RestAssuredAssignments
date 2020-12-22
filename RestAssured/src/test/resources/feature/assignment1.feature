Feature: Foreign Exchange Reference Rate

@tag1
Scenario: Get the latest foreign exchange reference rates
Given API for foreign exchange
When posted with correct information
Then validate positive response code received

@tag2
Scenario: Validate response code of correct symbols
Given API for foreign exchange with symbols
When Posted with correct symbol
Then Validate positive response for given symbol

@tag3
Scenario: Status code for Latest Foreign Exchange Rates with Base
Given API for foreign exchange with base
When Api with base
Then Validate positive response for given base

@tag4
Scenario: Status code for Latest Foreign Exchange Rates with Symbols and base
Given API for foreign exchange with Symbols and base
When Posted with correct Symbol and base
Then Validate positive response for given Sysmbol and base

