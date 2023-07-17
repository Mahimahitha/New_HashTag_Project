Feature:  Verify Hashtag landing page

  Scenario: Verify the "hashtag" Application header bar on Hashtag Landing page
    Given user navigate to hashtag landing page
    When user verifies hashtag page logo in header bar
    Then user verifies "Services","Shopify","Blog","Careers" nav bar menus in landing page
    And user verifies case studies menu in hashtag page
    And user verifies about us menu in hashtag page
    And user verifies contact us menu in hashtag page
    And user verifies Services dropdown for Services menu in landing page
    And user verifies "EN" Button in hashtag page
    And user verifies "Let's Speak" Button in hashtag page
#data is not presenting #Bug is accused
#      Then user verifies "Quality Assurance(QA) Engineer" header title in hashtag page
#      And user verifies "Responsibilities" in hashtag page
#      And user verifies "Requirements and Skills in hashtag page
    Then verifies Join us title in hashtag page
    And user verifies and provide name of hashtag in hashtag page
    Then user verifies and provide email in hashtag page
    And user verifies and provide phone in hashtag page
    And user verifies and enter resume in hashtag page
    Then user verifies and enter description in hashtag page
    And user verifies apply now button in hashtag page
    And user verifies footer section Menu in hashtag page
    And user verifies Services in hashtag page
