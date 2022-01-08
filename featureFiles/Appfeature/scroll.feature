
Feature: select language section and trending topic feature
Scenario: scroll till footer of home page and verify trending topics and again navigate to top of the Home page and select Hindi language
 Given user navigate to news18 HomePge
 When user scroll till end of footer of Home Page and top of Home page
 And user verify Trending topic and language section
 Then Trendind Topic and language section should be displayed
 


 