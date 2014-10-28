Feature: Reverse
As a user
I want to use the reverse string function
So that I can see what my string looks like backward

Scenario: Enter a string of all one case
Given the object's string is "HELLO"
When the object string is reversed
Then "OLLEH" should be the new object string

Scenario: Enter a string of more than one case
Given the object's string is "World"
When the object string is reversed
Then "dlroW" should be the new object string

Scenario: Enter a palindrome
Given the object's string is "racecar"
When the object string is reversed
Then "racecar" should be the new object string

Scenario: Enter an empty string
Given the object's string is ""
When the object string is reversed
Then "" should be the new object string

Scenario: Enter a string of length 1
Given the object's string is "I"
When the object string is reversed
Then "I" should be the new object string
