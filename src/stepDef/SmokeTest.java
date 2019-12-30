package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest
{

    ChromeDriver driver;

    @Given("^Open firefox$")
    public void Open_firefox() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "E:\\Web Driver\\driver79\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

    }

    @When("^Enter user name password$")
    public void Enter_user_name_password() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("ravilak193@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("abc11111");
        Thread.sleep(3000);



    }

    @Then("^User can login successfully$")
    public void User_can_login_successfully() throws Throwable {
        driver.findElement(By.id("loginbutton")).click();




    }


}
