package Class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dynamicCSSLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize(); //maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.cssSelector("input[id*=userName]")).sendKeys("Md Sadikur Rahman");

        driver.findElement(By.cssSelector("input[id^=userE]")).sendKeys("mdsadikurrahman26@gmail.com");

        driver.findElement(By.cssSelector("textarea[id$=rrentAddress]")).sendKeys("Mohammadpur");

        driver.findElement(By.cssSelector("textarea[id$=nentAddress]")).sendKeys("Trishal");

        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        driver.quit();//quiz from the deiver

    }
}
