Feature: JIRA API validation
Scenario: To verify the create issue
Given The user add the create issue payload
When User should call the post http request for create the issue
Then To validate the response code it should be 201
And To validate the self from resposebody that contains "mynthraa"