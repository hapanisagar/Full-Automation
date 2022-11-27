Feature: Facebook Register

  //Background:
    //Given User able to open browser
    //And Enter url
    @Register
    Scenario: Facebook valid Registration test
      When User click on Create new account link
      Then User on register page and verify register page title
      Then Enter first name and surname
      Then Enter email id
      Then Enter new password
      Then Enter date of birth
      Then Select gender as male
      Then Click on Sign up button
      Then user able to register succesfully.
      Then User close the Browser

