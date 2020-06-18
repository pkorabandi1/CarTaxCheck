$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("carcheck.feature");
formatter.feature({
  "line": 1,
  "name": "Test the cartaxcheck for given input files",
  "description": "",
  "id": "test-the-cartaxcheck-for-given-input-files",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test the car tax check site for the given file",
  "description": "",
  "id": "test-the-cartaxcheck-for-given-input-files;test-the-car-tax-check-site-for-the-given-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the list of car registration numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "registration number is submitted",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the relevant car details are obtained",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the car details match the details from the file",
  "keyword": "And "
});
formatter.match({
  "location": "CarCheck.the_list_of_car_registration_numbers()"
});
formatter.result({
  "duration": 243344500,
  "status": "passed"
});
formatter.match({
  "location": "CarCheck.registration_number_is_submitted()"
});
formatter.result({
  "duration": 2487000,
  "status": "passed"
});
formatter.match({
  "location": "CarCheck.the_relevant_car_details_are_obtained()"
});
formatter.result({
  "duration": 26782281700,
  "status": "passed"
});
formatter.match({
  "location": "CarCheck.the_car_details_match_the_details_from_the_file()"
});
formatter.result({
  "duration": 23156737100,
  "status": "passed"
});
});