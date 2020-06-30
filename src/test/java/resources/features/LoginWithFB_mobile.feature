Feature: User want to login to account on mobile application for the first time

  Background:
     Given User is logged in FB application on mobile

  Scenario: User log in to mobile application via Facebook

      Given Multikino Application is opened
       When User tap on Facebook icon on start screen
        And User accept all Regulations
       Then User should be successfully logged in
        And Redirected to list of cinemas


