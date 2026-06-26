package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlightPage {

    WebDriver driver;

    public FlightPage(WebDriver driver) {
        this.driver = driver;
    }

    By closePopup = By.xpath("//span[@data-cy='closeModal']");
    By fromCity = By.id("fromCity");
    By fromInput = By.xpath("//input[@placeholder='From']");
    By toCity = By.id("toCity");
    By toInput = By.xpath("//input[@placeholder='To']");
    By searchButton = By.xpath("//a[text()='Search']");
/*
    public void closePopup() {
        try {
            driver.findElement(closePopup).click();
        } catch (Exception e) {}
    }
*/
public void closePopup() {
    try {
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
    } catch (Exception e) {
        // ignore if not present
    }
}
  /*  public void selectFromCity(String city) {
        driver.findElement(fromCity).click();
        driver.findElement(fromInput).sendKeys(city);
        driver.findElement(By.xpath("//p[contains(text(),'" + city + "')]")).click();
    }*/


   /* public void selectToCity(String city) {
        driver.findElement(toCity).click();
        driver.findElement(toInput).sendKeys(city);
        driver.findElement(By.xpath("//p[contains(text(),'" + city + "')]")).click();
    }
*/
   public void selectFromCity(String city) {

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       // Click FROM field
       WebElement from = wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity")));
       from.click();

       // Type city
       WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
       input.sendKeys(city);

       // Wait & click suggestion
       WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
               By.xpath("//p[contains(text(),'" + city + "')]")
       ));
       option.click();
   }
    public void selectToCity(String city) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement to = wait.until(ExpectedConditions.elementToBeClickable(By.id("toCity")));
        to.click();

        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='To']")));
        input.sendKeys(city);

        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//p[contains(text(),'" + city + "')]")
        ));
        option.click();
    }
    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}