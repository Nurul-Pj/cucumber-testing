Feature: Shopping

@tag1
	Scenario: Search product
		Given user go to shop web
    When user enter button search
    And user search product one
    And user search product two
    
@tag2
	Scenario: Add Cart and Place Order
    Given user go to shop web
    When user click product shirt
    And add to cart
		And user click tab checkout
  	And fill out the form
  	Then click button place order
    

