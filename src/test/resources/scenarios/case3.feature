Feature: to search a particular product Headphone

#Scenario Outline: login and search headphones

Scenario:

Given the user launches the testmeapp
Then logins in with the credentials
Then searches for the product
Then adds the product to the cart
Then the user then checksout the product
When payment is being done
Then the product is purchased sucessfully 
