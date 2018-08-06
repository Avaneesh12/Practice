Feature: Booking bus on Redbus Functionality

  Scenario: User wants to book the bus
    Given User is on the google page
    When user searches for redbus on google
    And user navigates to the website of redbus
    And enter details to search the bus
    And navigates to view seats of bus
    And select the kind of seat of the choice
    And clicks on proceed to confirm the booking
    And enter passenger details
    And will select the mode of payment
    And enters details of card to make final payment
    And click on pay to confirm the seat
    Then successfull booking message should be displayed
