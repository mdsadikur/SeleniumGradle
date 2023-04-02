package Class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class information {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

       WebElement element = driver.findElement(By.name("username"));
       element.sendKeys("Admin");

        System.out.println(element.isDisplayed());
        //for display element

        System.out.println(element.getTagName());
        //for get tag name

        System.out.println(element.getCssValue("font-size").trim());
        // to get font size

        System.out.println(element.getRect().x+"  "+element.getRect().y);
        //to get position

        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).submit();
        Thread.sleep(2000);

        driver.quit();
    }
}
