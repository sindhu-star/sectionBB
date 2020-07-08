Feature: Registration process
@Scenario1
Scenario Outline: User registration process scenario

Given user on home page
Then click on Skiplogin button
Then Registration page is displayed and validate title
Then enter the firstname as "<Firstname>" and the lastname as "<Lastname>" 
Then enter the address as "<Address>" and the email as "<email>"
Then enter the phonenumber as "<Phone>"
Then click on the gender checkbox "FeMale"
Then click on the Hobbies checkbox "Cricket"
Then select the country dropdown as "India"
Then enter the password as "<password>" and confirm password as "<Cpassword>"
Then click on submitbutton
Examples:
   |Firstname|Lastname|Address|email            |Phone     |password|Cpassword|
   |sindhu   |S       |Salem  |test123@gmail.com|7894561230|@test123|@test123 |
  
  @Scenario2
 Scenario: Registration
 
 Given user on home page
Then click on Skiplogin button
Then Registration page is displayed and validate title
Then enter the firstname as "Jeeva" and the lastname as "S" 
Then enter the address as "Coimbatore" and the email as "aabcd12@gmail.com"
Then enter the phonenumber as "9874563210"
Then click on the gender checkbox "Male"
Then click on the Hobbies checkbox "Cricket"
Then select the language as "English"
Then select the Skill as "C"
Then select the country dropdown as "India"
Then enter the password as "test123" and confirm password as "test123"
Then click on submitbutton
   