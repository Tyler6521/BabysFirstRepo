package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");


        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();

        WebElement menuLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuLink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        System.out.println(driver.getTitle());

        //driver.quit();

    }
    public static void main (String args []){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}

