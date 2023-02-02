package bankStepdef;

import common.PageGeneratorManager;
import cucumberOptions.Hooks;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.norCommercePortal.UserRegisterPageObject;

public class RegisterPageStep {
    WebDriver driver;
    UserRegisterPageObject registerPage;
    public RegisterPageStep(){
        this.driver = Hooks.openAndQuitBrowser();
        registerPage = PageGeneratorManager.getUserRegisterPage(driver);
    }
    @When("Input to email textbox")
    public void inputToEmailTextbox() {
    }

    @When("Click to submit button")
    public void clickToSubmitButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Get User and password information")
    public void getUserAndPasswordInformation() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Back to Login page")
    public void backToLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
