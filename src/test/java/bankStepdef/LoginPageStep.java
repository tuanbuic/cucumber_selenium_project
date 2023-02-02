package bankStepdef;

import cucumberOptions.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageStep {
    WebDriver driver;
    public LoginPageStep(){
        this.driver = Hooks.openAndQuitBrowser();
        
    }
    @When("Open register page")
    public void openRegisterPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("submit valid infor to login form")
    public void submitValidInforToLoginForm() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
