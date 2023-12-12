$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Icici.feature");
formatter.feature({
  "name": "To validate the login functionlity of icici bank application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the login functionality with invalid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and maximize the windows",
  "keyword": "Given "
});
formatter.match({
  "location": "Icici.to_launch_the_chrome_browser_and_maximize_the_windows()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of Icici application",
  "keyword": "When "
});
formatter.match({
  "location": "Icici.to_launch_url_of_Icici_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the arrow",
  "keyword": "And "
});
formatter.match({
  "location": "Icici.to_click_the_arrow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass email in username field",
  "keyword": "And "
});
formatter.match({
  "location": "Icici.to_pass_email_in_username_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Icici.to_pass_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Icici.to_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Icici.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});