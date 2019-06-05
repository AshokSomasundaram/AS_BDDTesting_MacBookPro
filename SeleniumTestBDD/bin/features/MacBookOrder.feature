Feature: Buying a MacBook Pro on the website https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjx0KzJjtLiAhUM-qQKHfyzAg8QPAgH As an online customer

Scenario: A MacBook 15” with accessories can be ordered on the website
  Given I go to the url
  When I choose a MacBook Pro with the following features and accessories
    | Option          | Specification        |
    | Screen          |                 15’’ |
    | Processor       |              2.9 GHz |
    | Memory RAM      |                16 GB |
    | Colour          |               Silver |
    | Software        |          Logic Pro X |
    | Display adapter | USB-C to USB Adapter |
  Then I can place an order for it.


Scenario: The correct price and VAT are displayed for a MacBook 15” with accessories
  Given when I choose the following items:
    | Option                   | Price in £ |
    | MacBook Pro and software |    3168.99 |
    | Display adapter          |      19.00 |
  When I proceed to the checkout 
  Then a total price of £3187.99 will be displayed
  And £531.34 will be listed for VAT.VAT
