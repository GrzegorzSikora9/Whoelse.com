$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addComment.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to add comment to movie",
  "description": "",
  "id": "as-a-user-i-want-to-add-comment-to-movie",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@addcomment"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "User add comment to movie",
  "description": "",
  "id": "as-a-user-i-want-to-add-comment-to-movie;user-add-comment-to-movie",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Button comment is clicked",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter \"\u003ccomment\u003e\" comment",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on publish button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Comment \"\u003ccomment\u003e\" should be added and visible",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-add-comment-to-movie;user-add-comment-to-movie;",
  "rows": [
    {
      "cells": [
        "comment"
      ],
      "line": 16,
      "id": "as-a-user-i-want-to-add-comment-to-movie;user-add-comment-to-movie;;1"
    },
    {
      "cells": [
        "This is very nice movie."
      ],
      "line": 17,
      "id": "as-a-user-i-want-to-add-comment-to-movie;user-add-comment-to-movie;;2"
    },
    {
      "cells": [
        "I like it 123!@# a movie!"
      ],
      "line": 18,
      "id": "as-a-user-i-want-to-add-comment-to-movie;user-add-comment-to-movie;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5659621100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Home page of Multikino is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is logged in",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Page with first available movie from repertoire is opened",
  "keyword": "And "
});
formatter.match({
  "location": "addComment_steps.home_page_of_Multikino_is_opened()"
});
formatter.result({
  "duration": 8089109000,
  "status": "passed"
});
formatter.match({
  "location": "addComment_steps.user_is_logged_in()"
});
formatter.result({
  "duration": 1463597100,
  "status": "passed"
});
formatter.match({
  "location": "addComment_steps.page_with_first_available_movie_from_repertoire_is_opened()"
});
formatter.result({
  "duration": 3010510700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User add comment to movie",
  "description": "",
  "id": "as-a-user-i-want-to-add-comment-to-movie;user-add-comment-to-movie;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@addcomment"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Button comment is clicked",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter \"This is very nice movie.\" comment",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on publish button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Comment \"This is very nice movie.\" should be added and visible",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "addComment_steps.button_comment_is_clicked()"
});
formatter.result({
  "duration": 331074300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is very nice movie.",
      "offset": 12
    }
  ],
  "location": "addComment_steps.user_enter_comment(String)"
});
formatter.result({
  "duration": 230105300,
  "status": "passed"
});
formatter.match({
  "location": "addComment_steps.user_clicks_on_publish_button()"
});
formatter.result({
  "duration": 50600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is very nice movie.",
      "offset": 9
    }
  ],
  "location": "addComment_steps.comment_should_be_added_and_visible(String)"
});
formatter.result({
  "duration": 11340500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ml-comment-box__comment-list__content\u0027]//p[contains(text(),\u0027Bardzo fajny film! Polecam gorąco! \u0027)]\"}\n  (Session info: chrome\u003d83.0.4103.106)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-GGHTBG7\u0027, ip: \u0027192.168.0.11\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.106, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\grzeg\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51109}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: ignore, webauthn:virtualAuthenticators: true}\nSession ID: 6cb15a1bfc4d0c9e781c99aaa4e2ec63\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ml-comment-box__comment-list__content\u0027]//p[contains(text(),\u0027Bardzo fajny film! Polecam gorąco! \u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat pageObjects.AddComment_Page.comment_should_be_added_and_visible(AddComment_Page.java:77)\r\n\tat stepDefinitions.addComment_steps.comment_should_be_added_and_visible(addComment_steps.java:41)\r\n\tat ✽.Then Comment \"This is very nice movie.\" should be added and visible(addComment.feature:13)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1552372200,
  "status": "passed"
});
formatter.before({
  "duration": 5249384700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Home page of Multikino is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is logged in",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Page with first available movie from repertoire is opened",
  "keyword": "And "
});
formatter.match({
  "location": "addComment_steps.home_page_of_Multikino_is_opened()"
});
formatter.result({
  "duration": 7738951100,
  "status": "passed"
});
formatter.match({
  "location": "addComment_steps.user_is_logged_in()"
});
formatter.result({
  "duration": 1442206600,
  "status": "passed"
});
formatter.match({
  "location": "addComment_steps.page_with_first_available_movie_from_repertoire_is_opened()"
});
formatter.result({
  "duration": 2602312000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User add comment to movie",
  "description": "",
  "id": "as-a-user-i-want-to-add-comment-to-movie;user-add-comment-to-movie;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@addcomment"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Button comment is clicked",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter \"I like it 123!@# a movie!\" comment",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on publish button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Comment \"I like it 123!@# a movie!\" should be added and visible",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "addComment_steps.button_comment_is_clicked()"
});
formatter.result({
  "duration": 268892800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I like it 123!@# a movie!",
      "offset": 12
    }
  ],
  "location": "addComment_steps.user_enter_comment(String)"
});
formatter.result({
  "duration": 298899200,
  "status": "passed"
});
formatter.match({
  "location": "addComment_steps.user_clicks_on_publish_button()"
});
formatter.result({
  "duration": 46500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I like it 123!@# a movie!",
      "offset": 9
    }
  ],
  "location": "addComment_steps.comment_should_be_added_and_visible(String)"
});
formatter.result({
  "duration": 13985000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ml-comment-box__comment-list__content\u0027]//p[contains(text(),\u0027Bardzo fajny film! Polecam gorąco! \u0027)]\"}\n  (Session info: chrome\u003d83.0.4103.106)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-GGHTBG7\u0027, ip: \u0027192.168.0.11\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.106, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\grzeg\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:65205}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: ignore, webauthn:virtualAuthenticators: true}\nSession ID: 0a6247ba16402907c7e28f7265b085f6\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ml-comment-box__comment-list__content\u0027]//p[contains(text(),\u0027Bardzo fajny film! Polecam gorąco! \u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat pageObjects.AddComment_Page.comment_should_be_added_and_visible(AddComment_Page.java:77)\r\n\tat stepDefinitions.addComment_steps.comment_should_be_added_and_visible(addComment_steps.java:41)\r\n\tat ✽.Then Comment \"I like it 123!@# a movie!\" should be added and visible(addComment.feature:13)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1562917400,
  "status": "passed"
});
});