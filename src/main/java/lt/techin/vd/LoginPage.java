package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".MuiBox-root.css-164r41r a")
    private WebElement clickSignUp;
    @FindBy(id="email")
    private WebElement inputEmail;
    @FindBy (id="password")
    private WebElement inputPassword;
    @FindBy(css="main [tabindex]")
    private WebElement clickLogIn;
    public void clickSignUp(){
        clickSignUp.click();
    }
    public void inputEmail(String email){

        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void clickLogIn(){
        clickLogIn.click();
    }


}
