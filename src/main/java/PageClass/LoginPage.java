package PageClass;

public class LoginPage {
    WebDriver driver;
    @FindBy(id="username") WebElement username;
    @FindBy(id="password") WebElement password;
    @FindBy(id="loginButton") WebElement loginbtn;
    public LoginPage(){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public  void enterUsername(String name){
        username.sendKeys(name);
    }
    public  void enterPassword(String pass){
        password.sendKeys(pass);
    }
    public  void clickLogin(String name){
        loginbtn.click();
    }

}
