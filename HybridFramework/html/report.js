$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4680675400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Simple Hard coded Scenario"
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
  "location": "Login.user_on_login_page_and_verify_login_page_title()"
});
formatter.result({
  "duration": 83306200,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enter_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "duration": 992298400,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_is_on_Home_page_of_user()"
});
formatter.result({
  "duration": 9222000,
  "status": "passed"
});
formatter.after({
  "duration": 657712700,
  "status": "passed"
});
});