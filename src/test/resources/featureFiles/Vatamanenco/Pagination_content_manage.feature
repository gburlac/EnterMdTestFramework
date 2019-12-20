# new feature
@Vatamanenco

Feature: Pagination content manage

  Scenario Outline: User goes on enter.online, select any category and use sorting dropdowns for products sorting.
    Given User is on homepage
    When User selects Smartphones category
    And changes value in pagination content to '<value>' dropdown
    Then The <count> of displayed products on page is the same with selected
    Examples:
      | value                | count |
      | 16 produse pe pagină | 16    |
#      | 20 produse pe pagină | 20    |
#      | 32 produse pe pagină | 32    |
#      | 64 produse pe pagină | 64    |
