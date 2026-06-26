import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookingTheDate {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.irctc.co.in/nget/train-search");
        LocalDate journeyDate = LocalDate.now().plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = journeyDate.format(formatter);

        // Locate the calendar input field by id and enter the date
        WebElement dateInput = driver.findElement(By.id("jDate"));
        dateInput.clear();
        dateInput.sendKeys(formattedDate);
        driver.findElement(By.id("origin")).sendKeys("Bhubaneswar");
        driver.findElement(By.id("destination")).sendKeys("Hyderabad");

        // Click on Search Trains button
        driver.findElement(By.cssSelector("button.train_Search")).click();

        // Add waits or further steps as needed
    }
}


