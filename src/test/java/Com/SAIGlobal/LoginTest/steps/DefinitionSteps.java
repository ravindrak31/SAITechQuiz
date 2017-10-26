package Com.SAIGlobal.LoginTest.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Com.SAIGlobal.LoginTest.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps User;

    @Given("the user is on the '(.*)' home page")
    public void givenTheUserIsOnTheSAIGlobalHomePage(String WebSiteName) {
    	User.is_the_home_page();
    }

    @When("the user enters his details to create login")
    public void whenTheUserEntersDetails() {
    	User.UserEntersHisDetails();
    }

    @Then("ensure the user account is created")
    public void thenUserAccountIsCreated(String definition) {
    	User.UserCreatedSuccessfully();
    }
    
    @Then("user is able to login")
    public void thenUserIsAbleLogin() {
    	User.userEnterLoginDetailsAndLogin();
    	User.should_see_successfullUserLogin();
    }

}
