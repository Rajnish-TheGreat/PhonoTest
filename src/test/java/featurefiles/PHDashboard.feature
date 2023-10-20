Feature: Test Phonologix Dashboard Functionality

  @Dashboard
  Scenario: Phonologix Dashboard Functionality
    Given Browser is open and user is logged in
    And User Can Select The Value From Dropdownlist
    When User Click On Plan Expiry Report
    Then User Navigates To Plan Expiry Report Page
    When User Click On Slot Booked Report
    Then User Navigates To Slot Booked Report Page
    When User Click On Slot Complete Report
    Then User Navigates To Slot Complete Report Page
    When User Click On Assessments Report
    Then User Navigates To Assessments Report Page
