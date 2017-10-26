package Com.SAIGlobal.LoginTest.steps.serenity;

import Com.SAIGlobal.LoginTest.pages.SAIGlobalLogin;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    SAIGlobalLogin dictionaryPage;

    @Step
    public void UserEntersHisDetails() {
    	dictionaryPage.OpenCreateUserPage();
        dictionaryPage.UserEntersHisPersonalDetails();
        dictionaryPage.UserEntersHisContactDetails();
        dictionaryPage.UserCompletesRegistrationDetails();
    }

    @Step
    public void UserCreatedSuccessfully() {
    	String definition="Success";
        assertThat(dictionaryPage.UserAccountCreatedSuccessfully(), hasItem(containsString(definition)) != null);
    }

    @Step
    public void should_see_successfullUserLogin() {
    	String ExpectedpageTitle="Success";
        assertThat(dictionaryPage.UserLoggedInSuccefully(), hasItem(containsString(ExpectedpageTitle)) != null);
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void userEnterLoginDetailsAndLogin() {
     dictionaryPage.UserEntersLoginCredentials();
    }
}