package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseone {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //In this Test case All The Selenium Operations will be Performed
        //With Respect to the WebBrowser
        //Indiviually Test Cases Will be Written For the CURA HelathCare Services Semo Site


        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //Basic Naviagtion Operations
        driver.navigate().to("https://www.amazon.in/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();



    }
}
