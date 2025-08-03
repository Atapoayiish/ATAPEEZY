import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.close();


    }
    //I have used this project to practice github and git demos
    //And so lets see the changes that would be made
    //it's a collaboration which we all know
    //Now more updates have to be made so we
    //can see if clearly we are moving ahead with our
    //GitHub stuff

}
