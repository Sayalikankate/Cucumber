$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sayali.sunil.kankate/eclipse-workspace/FreeCRM_1/src/test/java/feature/taggedhooks.feature");
formatter.feature({
  "name": "we are testing tags",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This is first scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "first scene",
  "keyword": "Given "
});
formatter.match({
  "location": "taggedhooks.first_scene()"
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
formatter.scenario({
  "name": "This is first scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Second"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "second scene",
  "keyword": "Given "
});
formatter.match({
  "location": "taggedhooks.second_scene()"
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