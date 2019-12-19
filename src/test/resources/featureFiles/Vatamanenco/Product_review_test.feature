# new feature
# Tags: optional

Feature: Product review functionality

  Scenario Outline: User goes on enter.online, selects any product, writes review and click [Send] button
    Given User is on homepage
    When User selects Smartphones category
    And User selects product
    And clicks on [Write review] button
    Then Appears form with 'Name', 'Email' and 'Message' fields, 'stars'-bar for selecting quality, and [Send] button
    When User fills in the <Name> <Email> <Message> fields and submit
    Then Success message appears
    Examples:
      | Name  | Email                       | Message                  |
      | Dima  | dima-kaskader95@mail.ru     | Klassnii telefon         |
#      | Vasya | vasya-ubiica@bk.ru          | Otlichnaya trubka        |
#      | Jora  | george-2005@gmail.com       | Ochen krutoy display     |
#      | Lev   | lev-solomonovich@outook.com | Ochen horoshaya batareya |
