@addcomment
Feature: As a user I want to add comment to movie

  Background:
    Given Home page of Multikino is opened
      And  User is logged in
      And Page with first available movie from repertoire is opened

  Scenario Outline: User add comment to movie
        Given Button comment is clicked
         When User enter "<comment>" comment
          And User clicks on publish button
         Then Comment "<comment>" should be added and visible

    Examples:
    |       comment            |
    | This is very nice movie. |
    | I like it 123!@# a movie!|




