Feature: Login Tests

  @LT1 @Login @Smoke
  Scenario: Verify successful login
    Given User on login page
    When User enter "performance_glitcher_user" and "secret_sauce"
    And User click on submit
    Then User verify products page
    And User verify single product


     @LT2 @Login @Smoke
   Scenario Outline: Verify successful login with examples
     Given User on login page
     When User enter "<username>" and "<password>"
     And User click on submit
     Then User verify products page
     And User verify single product

     Examples:
       | username                | password     |
       | standard_user           | secret_sauce |
       | problem_user            | secret_sauce |
       | performance_glitch_user | secret_sauce |
       | visual_user             | secret_sauce |