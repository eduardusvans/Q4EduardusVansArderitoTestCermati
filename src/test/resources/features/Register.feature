@Web
Feature: Register

  Scenario Outline: Register with positive cases
    Given User is on Register page
    When User input "<email>" on E-mail input text field on Register page
    When User input "<password>" on Password input text field on Register page
    When User input "<confirmPassword>" on Confirm Password input text field on Register page
    When User input "<firstName>" on First Name input text field on Register page
    When User input "<lastName>" on Last Name input text field on Register page
    When User input "<phoneNumber>" on Phone Number input text field on Register page
    When User input "<residenceCity>" on Residence City input text field on Register page
    When User tap register button
    Then User is on Cermati Home Page
    Examples:
      | email                      | password                                           | confirmPassword                                    | firstName | lastName  | phoneNumber  | residenceCity  |
      | vanstestcermati@gmail.com  | vanste12                                           | vanste12                                           | v         | a         | 081290135050 | KOTA TANGERANG |
      | vanstestcermati2@gmail.com | vansasdasdasdasdasdasdasdasdasdasdasdasdasdasdas12 | vansasdasdasdasdasdasdasdasdasdasdasdasdasdasdas12 | v.        | v.        | 081290134040 | KOTA TANGERANG |
      | vanstestcermati3@gmail.com | vanste12                                           | vanste12                                           | v'        | v'        | 081290133030 | KOTA TANGERANG |
      | vanstestcermati4@gmail.com | vanste12                                           | vanste12                                           | v,        | v,        | 081290132020 | KOTA TANGERANG |
      | vanstestcermati5@gmail.com | vanste12                                           | vanste12                                           | v-        | v-        | 081290131021 | KOTA TANGERANG |
      | vanstestcermati6@gmail.com | vanste12                                           | vanste12                                           | v ans     | ar derito | 081290139298 | KOTA TANGERANG |

