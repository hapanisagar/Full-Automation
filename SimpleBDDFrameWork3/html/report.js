$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User able to open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter Url",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_able_to_open_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.enter_Url()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "# Simple hard coded Scenario"
    }
  ],
  "line": 9,
  "name": "Nopcommerce Valid Login Test",
  "description": "",
  "id": "nopcommerce-login;nopcommerce-valid-login-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User click on login Link",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User on login page and  verify login page titleWhen User enter username and password and click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User is on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_click_on_login_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_on_login_page_and_verify_login_page_titleWhen_User_enter_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_is_on_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});