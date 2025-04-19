Feature: Urban Ladder Website Automation
Scenario: Login with invalid credentials
				Given I launch browser and navigate to the home page
				When The homepage should be displayed
				Then I search for "Sofa"
        When Search results should be displayed
        When I apply a filter
        Then The search results should be updated
        When I add a product to the cart
        Then The product should be in the cart
        When I proceed to checkout
        Then The checkout page should load successfully