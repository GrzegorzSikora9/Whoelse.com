@RegisterNewUser

Feature: As a user I want to register my account on website

  Scenario Outline: User register account on website using Email

    Given User navigate to Multikino Website
    When  User navigate to KONTO dropdownmenu in topMenu
    And   click on REJESTRACJA button
    Then  User click on Email button in side bar menu
    When  User enter existing email "<email>"
    And   enter password "<password>"
    And   User click on checkbox with accepting regulations
    Then  User click Dalej button
    When  User write Name "<Name>" and Surname "<Surname>"
    And   write phone number "<number>"
    And   User click on checkbox that he/she over sixteen
    Then  User click on Dalej button
    When  User click on first checkbox that he give all permissions
    And   User click on Zarejestruj button
    Then  Email with confirmation of registration should be successfully sended

    Examples:
      |email                  |password           |Name        |Surname     |     number    |
      | Gregorio999@wp.pl     |Qwerty12345        | Gregorio   |Matrini     |   695234569   |
      | Mauricio999@wp.pl     |Asdfg12345         | Stefano    | Mauricio   |   699875212   |

