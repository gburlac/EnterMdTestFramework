Feature: A description

  @RunnerVCrisac
  Scenario: Login on Enter.Online
    Given User is on homepage
    When user click on login menu
    Then login menu popup is displayed
    When user click on 'facebook' icon
    Then user is logged in via facebook profile and home page is displayed

