package Com.SAIGlobal.LoginTest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;


//URL is defaulted but can be changed
@DefaultUrl("https://infostore.saiglobal.com/")
public class SAIGlobalLogin extends PageObject {

	private String User_UserName;
	private String User_Password;
	
    @FindBy(id="ctl00_Login_accounttype")
    private WebElementFacade LoginMenu;

    @FindBy(linkText="CREATE AN ACCOUNT")
    private WebElementFacade CreateAccountBtn;
    
    @FindBy(xpath="//*[@id='dropdownTitle_chzn']")
    private WebElementFacade Titledrpdown;
    
    @FindBy(xpath="//*[@id='dropdownTitle_chzn']/div/ul/li")
    private WebElementFacade Title;
    
    @FindBy(id="txtFirstName")
    private WebElementFacade firstName;
    
    @FindBy(id="txtLastName")
    private WebElementFacade lastName;
    
    @FindBy(id="txtEmail")
    private WebElementFacade EmailAddress;
    
    @FindBy(id="txtConfirmEmail")
    private WebElementFacade ConfirmEmailAddress;
    
    @FindBy(id="txtPassword")
    private WebElementFacade Password;
    
    @FindBy(id="txtConfirmPassword")
    private WebElementFacade ConfirmPassword;
    
    @FindBy(xpath="//label[contains(@for,'checkboxIAgree')]")
    private WebElementFacade IagreeChkbox;
    
    @FindBy(xpath="xpath=//button[contains(@class, 'btn btn-uppercase pull-right btn-personal-next')]")
    private WebElementFacade NextBtn;
    
    @FindBy(xpath="//*[@id='dropdownInvoiceCountry_chzn']")
    private WebElementFacade Country;
    
    @FindBy(id="txtInvoiceAddress1")
    private WebElementFacade AddressLine1;
    
    @FindBy(id="txtInvoiceAddress2")
    private WebElementFacade AddressLine2;
    
    @FindBy(id="txtInvoiceCity")
    private WebElementFacade City;
    
    @FindBy(id="dropdownInvoiceState_chzn")
    private WebElementFacade State;
    
    @FindBy(id="txtInvoiceZip")
    private WebElementFacade ZipCode;
    
    @FindBy(id="checkboxCopyInvoiceAddress")
    private WebElementFacade CopyinvoiceDetails;
    
    @FindBy(xpath="//button[text()='Register']")
    private WebElementFacade RegisterBtn;
    
    @FindBy(id="login-email")
    private WebElementFacade LoginEmil;
    
    @FindBy(id="login-password")
    private WebElementFacade LoginPassword;
    
    @FindBy(id="btnLogin")
    private WebElementFacade LoginBtn;
    
    public void UserEntersHisPersonalDetails() {
    	Titledrpdown.click();
    	List<WebElement> options = getDriver().findElements(By.xpath("//*[@id='dropdownTitle_chzn']/div/ul/li"));
          // Loop through the options and select the one that matches
          for (WebElement opt : options) {
              if (opt.getText().equals("Mr")) {
                  opt.click();
                  
              }
          }
       // Title.selectByVisibleText("Mr");
        firstName.type("TestingWeb");
        lastName.type("TestingWeb");
        
        
        //Instead of hardcoding here we can also get the from function parameters. 
        
        User_UserName="TestingWeb@Test.com";
        
        User_Password="Testing123$";
        
        EmailAddress.type(User_UserName);
        ConfirmEmailAddress.type(User_UserName);
        
        
        Password.type("Test123$");
        ConfirmPassword.type("Test123$");
        IagreeChkbox.click();
        NextBtn.click();
       
    }
    
    public void UserEntersHisContactDetails() {
    	
        Country.click();
        
        List<WebElement> options = getDriver().findElements(By.xpath("//*[@id='dropdownInvoiceCountry_chzn']/div/ul/li"));
        // Loop through the options and select the one that matches
        for (WebElement opt : options) {
            if (opt.getText().equals("Australia")) {
                opt.click();
                
            }
        }
        AddressLine1.type("1 Shelley Street");
      
        City.type("Sydney");
        State.type("New South Wales");
        ZipCode.type("2000");
        CopyinvoiceDetails.click();
        NextBtn.click();
       
    }
    
    public void UserCompletesRegistrationDetails() {
        /*Captcha - This can be tackled in few ways. 
    	1. Use paid libraries to capture and enter/select captcha details
    	2. Use codes from dev team - which will be considered as test user and bypass captcha*/
    	
    	
    	RegisterBtn.click();
       
    }
    
    public String UserAccountCreatedSuccessfully() {
        /*Not sure how the successful user creation screen will look like
          but leaving the placeholder to check the user account created message */
    	//Depending on success or failure return string
       return "Success";
    }
    
    public void UserEntersLoginCredentials() {
        LoginMenu.click();
        LoginEmil.type(User_UserName);
        LoginPassword.type(User_Password);
        LoginBtn.click();
    }
    
    public String UserLoggedInSuccefully() {
    	
    //Not sure how the logged in user view looks assuming the title of page will change 
    	//then returning the page title and validating it against certain value
      return this.getTitle();
    }

    public void OpenCreateUserPage() {
        LoginMenu.click();
        CreateAccountBtn.click();
    }


    

   
}