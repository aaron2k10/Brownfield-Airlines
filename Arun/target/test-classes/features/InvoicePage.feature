@Test

Feature: Generating the invoice

@invoicegeneration

Scenario: Clicking generate invoice button

Given when the user present in the invoice page
When user clicks the generateinvoice button
Then invoice success message should be displayed