$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5436773000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Simple hard coded Scenario"
    }
  ],
  "line": 5,
  "name": "Nopcommerce Valid Login Test",
  "description": "",
  "id": "nopcommerce-login;nopcommerce-valid-login-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User on login page and  verify login page title",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter username and password and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on Home page of user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.user_on_login_page_and_verify_login_page_title()"
});
formatter.result({
  "duration": 95373900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_enter_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "duration": 969101000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_is_on_Home_page_of_user()"
});
formatter.result({
  "duration": 24900,
  "status": "passed"
});
});