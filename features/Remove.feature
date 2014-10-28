Feature: Remove
As a user
I want a string remove function
So that I can see what a string can look like without its last n characters

Scenario: Remove the last 3 characters
Given the object's string is "Hello"
When I remove 3 characters
Then "He" should be the new object string

Scenario: Remove all the characters
Given the object's string is "Hello"
When I remove 5 characters
Then "" should be the new object string

Scenario: Remove no characters
Given the object's string is "Hello"
When I remove 0 characters
Then "Hello" should be the new object string

Scenario: Remove too many characters
Given the object's string is "Hello"
When I remove 6 characters
Then "ERROR" should be the new object string
