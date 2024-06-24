Feature: Test Reqres user api’s with rest assured library and cucumber framework

@ResponseCodeTest200
Scenario: Reqres GET API test(Response Code 200)

Given the valid endpoint to fetch users v2
When the request is send to server
Then status code is 200