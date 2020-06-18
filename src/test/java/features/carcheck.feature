Feature: Test the cartaxcheck for given input files

Scenario: Test the car tax check site for the given file

	Given the list of car registration numbers
	When registration number is submitted
#	Then the relevant car details are obtained
	And the car details match the details from the file
	