@sendKeys

Feature: Create a new account

Scenario Outline: Create account for amazon
Given I am on home page
When i click on sign in button
And i click on create a new amazon account
And i enter user name as "<user name>"
And i enter email address as "<email address>"
And i enter password as "<password>"
And i enter re-password as "<re-enter password>"
And i click sign in button
Then i can sign up successfully

Examples:

|user name         | email address                | password               | re-enter password           |
|testest908        | test456tes@gmail.com         | ABCDEFG1234            | ABCDEFG1234                 |
|russell10         | mynameisrussell@yahoo.com    | qU5FhghNV              | qU5FhghNV                   |
|vinod123          | somewherevinod@aol.com       | Oi_dYTqQ               | Oi_dYTqQ                    |  

