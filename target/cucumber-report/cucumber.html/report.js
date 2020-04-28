$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/letskodeit/learn/resources/featurefiles/letskodeit.feature");
formatter.feature({
  "line": 1,
  "name": "Sign up feature",
  "description": "\r\nAs a user I want to sign up and log out",
  "id": "sign-up-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16268753600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should sign up successfully",
  "description": "",
  "id": "sign-up-feature;user-should-sign-up-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter full name \"Tony Wilson\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter random email address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter Confirm password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select check box for terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 465041000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tony Wilson",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterFullName(String)"
});
formatter.result({
  "duration": 5001543700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterRandomEmailAddress()"
});
formatter.result({
  "duration": 424246400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 223648600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 26
    }
  ],
  "location": "MyStepdefs.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 266828100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCheckBoxForTermsAndConditions()"
});
formatter.result({
  "duration": 198869500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 24875011300,
  "status": "passed"
});
formatter.after({
  "duration": 3594289200,
  "status": "passed"
});
formatter.before({
  "duration": 14591466400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#    Then    I sign up successfully"
    }
  ],
  "line": 16,
  "name": "User should log out successfully",
  "description": "",
  "id": "sign-up-feature;user-should-log-out-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I enter full name \"Tony Wilson\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I enter random email address",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter Confirm password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select check box for terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on sign up button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#    Then    I sign up successfully"
    }
  ],
  "line": 25,
  "name": "I click on gravatar",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on log out",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I am on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 454278400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tony Wilson",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterFullName(String)"
});
formatter.result({
  "duration": 6093194900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterRandomEmailAddress()"
});
formatter.result({
  "duration": 473476500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 249548000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 26
    }
  ],
  "location": "MyStepdefs.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 301163400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCheckBoxForTermsAndConditions()"
});
formatter.result({
  "duration": 256162600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 24662490400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnGravatar()"
});
formatter.result({
  "duration": 222035500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogOut()"
});
formatter.result({
  "duration": 22630586200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 222293900,
  "status": "passed"
});
formatter.after({
  "duration": 889061000,
  "status": "passed"
});
formatter.uri("src/test/java/com/letskodeit/learn/resources/featurefiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in and Practice",
  "description": "\r\nAs User should Log in and select course successfully",
  "id": "log-in-and-practice",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19661011300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I want to log in successfully",
  "description": "",
  "id": "log-in-and-practice;i-want-to-log-in-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter email \"ram111@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on log in Button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 287427000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 215284200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ram111@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 7267576800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 176959600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLogInButton()"
});
formatter.result({
  "duration": 26794916600,
  "status": "passed"
});
formatter.after({
  "duration": 854612400,
  "status": "passed"
});
formatter.before({
  "duration": 12866607800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#    Then    I log in successfully"
    }
  ],
  "line": 13,
  "name": "I want navigate to practice page successfully",
  "description": "",
  "id": "log-in-and-practice;i-want-navigate-to-practice-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on practice link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I am on practice page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 302161100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnPracticeLink()"
});
formatter.result({
  "duration": 345628100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmOnPracticePage()"
});
formatter.result({
  "duration": 1774733700,
  "status": "passed"
});
formatter.after({
  "duration": 1925962900,
  "status": "passed"
});
});