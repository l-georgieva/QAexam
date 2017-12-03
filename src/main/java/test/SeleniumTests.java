package test;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTests {

        private static final String ADMIN_USERNAME = "admin";
        private static final String ADMIN_PASSWORD = "admin";


        private WebDriver driver;

        @Before
        public void setUp(){
            this.driver = new FirefoxDriver();
            this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            this.driver.manage().window().maximize();
            this.driver.get("http://qaf2017demo1-001-site1.dtempurl.com/Account/Login");
        }

        private void loginAsAdmin(){
            WebElement usernameField = this.driver.findElement(By.id("username"));
            WebElement passwordField = this.driver.findElement(By.id("password"));
            WebElement submitButton = this.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/fieldset/div[3]/div/button[2]"));

            usernameField.sendKeys(ADMIN_USERNAME);
            passwordField.sendKeys(ADMIN_PASSWORD);
            submitButton.click();
        }

        private void createOwnLibrary(){
            WebElement softuniAcc = this.driver.findElement(By.id("inputSoftuniAccount"));
            WebElement passwordField = this.driver.findElement(By.id("inputPassword"));
            WebElement submitButton = this.driver.findElement(By.xpath("/html/body/div/div[2]/div/form/fieldset/div[3]/div/button"));

            softuniAcc.sendKeys(ADMIN_USERNAME);
            passwordField.sendKeys(ADMIN_PASSWORD);
            submitButton.click();
        }


    }
