Feature: A description

  @RunnerVCrisac
  Scenario Outline: Login on Enter.Online
    Given User is on homepage
    When user click on login menu
    Then login menu popup is displayed
    When user click on 'facebook' icon
    Then login window pops up
    When user enter credentials
    Then email and password fiels are filled in
    When user press login button
    Then user is logged in via facebook profile and home page is displayed
    Examples:
      | email | password |
      | me@me.com | 123456 |

