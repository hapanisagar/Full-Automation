$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Register",
  "description": "\r\n//Background:\r\n  //Given User able to open browser\r\n  //And Enter url",
  "id": "facebook-register",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5450906500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Facebook valid Registration test",
  "description": "",
  "id": "facebook-register;facebook-valid-registration-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User click on Create new account link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User on register page and verify register page title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter first name and surname",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter email id",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter new password",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter date of birth",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select gender as male",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on Sign up button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user able to register succesfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.user_click_on_Create_new_account_link()"
});
formatter.result({
  "duration": 119429700,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinations.Register.user_click_on_Create_new_account_link(Register.java:14)\r\n\tat ✽.When User click on Create new account link(src/test/resources/Features/Register.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Register.user_on_register_page_and_verify_register_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.enter_first_name_and_surname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.enter_email_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.enter_new_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.enter_date_of_birth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.select_gender_as_male()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.click_on_Sign_up_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.user_able_to_register_succesfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.user_close_the_Browser()"
});
formatter.result({
  "status": "skipped"
});
});