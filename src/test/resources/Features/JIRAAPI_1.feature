Feature: To validate the JIRA api requests

  #Scenario Outline: Verify the create Issue
    #Given To add the create issue payload "<summary>" and "<description>"
    #When User should call the post http request for create the issue
    #Then To validate the response code it should be 201
    #And To validate the self from resposebody that contains "mynthraa"
#
    #Examples: 
      #| summary             | description                       |
      #| Login not working   | user cannot able to login         |
      #| Forword not working | user cannot navigate to next page |

  Scenario Outline: Verify the update Issue
    Given To add the update issue payload "<summary>" and "<description>"
    When User should call the put http request for update the issue
    Then To validate the update response code it should be 204

    Examples: 
      | summary            | description            |
      | Update the summary | Update the description |

  Scenario: Verify the all issues
    Given To add the base uri for get
    When User should call the get http request for get the issues
    Then To validate the get response code it should be 200
    And User verify the total issues it should be 10

  Scenario: Verify the delete issue
    Given To add the base uri for delete
    When User should call the delete http request for get the issues
    Then To validate the response code for get it should be 204
