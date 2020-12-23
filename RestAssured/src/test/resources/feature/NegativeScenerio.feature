Feature: Negative Response code of  uri using assertions

@tag1
Scenario: Get the latest foreign exchange reference rates with incorrect information
Given API for foreign exchange.
When posted with incorrect information
Then validate negative response code received

@tag2
Scenario: Validate response code of incorrect symbols 
Given API for foreign exchange with symbols.
When posted with incorrect symbols
Then validate negative response code for symbols

@tag3
Scenario: Status code for Latest Foreign Exchange Rates with Base
Given API for foreign exchange with base.
When API with incorrect base
Then validate negative code for base

@tag4
Scenario: Status code for Latest Foreign Exchange Rates with Symbols and base
Given API for foreign exchange with symbols and base.
When posted with incorrect symbol and base
Then validate negative response code for symbol and base