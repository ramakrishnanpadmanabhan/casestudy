Feature: Registration in TestMeApp
 
Scenario: Register with new credentials
 
Given user opens the chrome browser  
And   enters the url 
Given enter the username as "ramakrishnan1998"  
When  enter the first name as "rama"  
When  enter the second name as "krishnan"  
When  enter the password as "accenture"  
When  confirm the password as "accenture"  
When  check the gender box 
When  enter the email id as "ramacriz1998@gmail.com"  
When  enter the mobile number as "8754794315"  
When  enter the dob 
When  enter the address  
When  enter the answer 
And   user clicks register button  
Then  verify registration 
