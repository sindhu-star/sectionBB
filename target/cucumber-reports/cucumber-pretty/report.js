$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Registration process",
  "description": "",
  "id": "registration-process",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 21,
  "name": "Registration",
  "description": "",
  "id": "registration-process;registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "click on Skiplogin button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Registration page is displayed and validate title",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "enter the firstname as \"Jeeva\" and the lastname as \"S\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "enter the address as \"Coimbatore\" and the email as \"aabcd12@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "enter the phonenumber as \"9874563210\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "click on the gender checkbox \"Male\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click on the Hobbies checkbox \"Cricket\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "select the language as \"English\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "select the Skill as \"C\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "select the country dropdown as \"India\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "enter the password as \"test123\" and confirm password as \"test123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click on submitbutton",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepefination.urllaunch()"
});
formatter.result({
  "duration": 25426290100,
  "status": "passed"
});
formatter.match({
  "location": "Stepefination.skiplogin()"
});
formatter.result({
  "duration": 5086094200,
  "status": "passed"
});
formatter.match({
  "location": "Stepefination.titleverification()"
});
formatter.result({
  "duration": 11959200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jeeva",
      "offset": 24
    },
    {
      "val": "S",
      "offset": 52
    }
  ],
  "location": "Stepefination.Entername(String,String)"
});
formatter.result({
  "duration": 2573813900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Coimbatore",
      "offset": 22
    },
    {
      "val": "aabcd12@gmail.com",
      "offset": 52
    }
  ],
  "location": "Stepefination.address(String,String)"
});
formatter.result({
  "duration": 667017100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9874563210",
      "offset": 26
    }
  ],
  "location": "Stepefination.phonenumber(String)"
});
formatter.result({
  "duration": 733816800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 30
    }
  ],
  "location": "Stepefination.gender(String)"
});
formatter.result({
  "duration": 135038500,
  "error_message": "org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been \"select\" but was \"input\"\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027JEEVA\u0027, ip: \u0027192.168.43.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:48)\r\n\tat pom.registration.gender(registration.java:56)\r\n\tat stepdefination.Stepefination.gender(Stepefination.java:62)\r\n\tat ✽.Then click on the gender checkbox \"Male\"(test.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cricket",
      "offset": 31
    }
  ],
  "location": "Stepefination.hobby(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 24
    }
  ],
  "location": "Stepefination.language(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "C",
      "offset": 21
    }
  ],
  "location": "Stepefination.skill(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 32
    }
  ],
  "location": "Stepefination.country(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 23
    },
    {
      "val": "test123",
      "offset": 57
    }
  ],
  "location": "Stepefination.password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepefination.submit()"
});
formatter.result({
  "status": "skipped"
});
});