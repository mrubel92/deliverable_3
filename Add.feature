Feature: Add
As a user
I want a string add function
So that I can see what 2 concatenated strings look like

Scenario: concatinate 2 strings
Given the object's string is "Hello"
When "World" is concatenated to the string
Then "HelloWorld" should be the new object string

Scenario: Only type in the first string
Given the object's string is "Hello"
When "" is concatenated to the string
Then "Hello" should be the new object string

Scenario: Only type in second string
Given the object's string is ""
When "World" is concatenated to the string
Then "World" should be the new object string

Scenario: Type in 2 empty strings
Given the object's string is ""
When "" is concatenated to the string
Then "" should be the new object string