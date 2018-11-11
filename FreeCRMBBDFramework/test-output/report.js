$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/FreeCRMBBDFramework/src/main/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the Login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 11596603966,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_login_page_is_freeCRM()"
});
formatter.result({
  "duration": 78031914,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1307268197,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4854025499,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 91643691,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cCRMPRO[1]\u003e but was:\u003cCRMPRO[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinitions.LoginStepDefinition.user_is_on_home_page(LoginStepDefinition.java:53)\r\n\tat ✽.Then user is on home page(C:/FreeCRMBBDFramework/src/main/java/features/Login.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 11,
  "name": "user is able to create new contact",
  "description": "",
  "id": "free-crm-login-feature;user-is-able-to-create-new-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is already on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user mouse over on contacts",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on new contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters firstname and lastname",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "verify contact created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});