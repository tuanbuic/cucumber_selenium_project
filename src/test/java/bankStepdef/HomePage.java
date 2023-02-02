package bankStepdef;

import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(){
        this.driver = Hooks.openAndQuitBrowser();

    }
}
