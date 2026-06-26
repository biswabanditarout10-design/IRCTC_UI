package PageClass;

public class LoginTest {
    System.setProperty("webDriver.chrome.driver", "path");
    WebDriver driver = new ChromeDriver();
    driver.get("https://in.search.yahoo.com/");
    LoginPage login = new LoginPage();
    login.enterUsername("bandita");
    login.enterPassword("123admin");
    login.clickLogin();
    driver.quit();

}
