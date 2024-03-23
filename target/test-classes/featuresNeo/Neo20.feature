
  Feature: To Test Login Functionality Of NeoStox Application.  

  Scenario Outline: Verify User Should Login With Valid Credentials.
  
    Given Browser Page Should Get Open
    And Click On Sign In Btn
    When User Enters <MN>
    And Click On Submit Btn1
    When User Enter <PIN>
    And Click On Submit Btn2
    #When User On Home Page Pop up
    #And User is on another popup
    Then User Navigate To Home Page and check <Verify>
    #And User click on userLink1
    #And click on logout1
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Examples: 
    
        |MN|PIN|Verify|
        |7773907045|2854|Rs.8,50,000.00|
     
