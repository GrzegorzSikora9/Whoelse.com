Feature: As a user I want to choose a start time of a movie

  Background:
    Given User is logged in
        * One of available cinemas is selected


    Scenario: User select a start movie time
      Given First on top off repertoire movie is opened
       When User click on the earliest possible hour
       Then Page with confirmation of start hour should be displayed







