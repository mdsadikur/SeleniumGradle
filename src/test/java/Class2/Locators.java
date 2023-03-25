package Class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(2000);


        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
//        Thread.sleep(2000);

        driver.findElement(By.linkText("My Info")).click();
//        Thread.sleep(2000);

        driver.navigate().to("https://demoqa.com/elements");
//        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()='Text Box']")).click();
//        Thread.sleep(2000);
        driver.findElement(By.id("userName")).sendKeys("sadik");
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("sadik@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("currentAddress")).sendKeys("Dhaka");
        Thread.sleep(2000);
        driver.findElement(By.id("permanentAddress")).sendKeys("Trishal");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
