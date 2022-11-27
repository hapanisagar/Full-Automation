$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Simple Hard coded Scenario"
    }
  ],
  "line": 5,
  "name": "Nopcommerce Login Test",
  "description": "",
  "id": "nopcommerce-login;nopcommerce-login-test",
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
  "name": "User is on login page and verify the Login page Title",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter Username and Password and click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User is on Homepage of User",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_on_login_page_and_verify_the_Login_page_Title()"
});
formatter.result({
  "duration": 4739595000,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_Enter_Username_and_Password_and_click_on_Login()"
});
formatter.result({
  "duration": 920792600,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_is_on_Homepage_of_User()"
});
formatter.result({
  "duration": 17700,
  "status": "passed"
});
});