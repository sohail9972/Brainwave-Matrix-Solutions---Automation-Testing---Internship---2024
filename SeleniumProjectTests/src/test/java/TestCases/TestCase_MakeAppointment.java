package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class TestCase_MakeAppointment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sohail\\Seleniumfolder\\chromedrivernew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //In this Test Case End-to-End Test Case for the Making an Appointment
        //Following Operation were Performed in this Test Case

        //Maximizing the Current Window
        driver.manage().window().maximize();

        // Login Operation into CURA Health Service Demo Site
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.name("username")).sendKeys("John Doe");
        driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

        // Assertions are Verified my their Title Names
        String titleName = driver.getTitle();
        String Expected_title="CURA Healthcare Service";
        Assert.assertEquals(titleName,Expected_title);

//Selecting the Facility
        //here the DropDowns are Select option Type



        driver.findElement(By.id("combo_facility")).click();
        List<WebElement> list =driver.findElements(By.xpath("//select[@id='combo_facility']//option"));
        System.out.println(list.size());


        for (WebElement ele : list){
            if (ele.getText().equals("Seoul CURA Healthcare Center")){
                ele.click();
                System.out.println("Clicked");
                break;
            }
        }


        //Alternative for the Iterations through the Each Element

        //        driver.findElement(By.id("combo_facility")).click();
//
//        List<WebElement> listele = driver.findElements(By.cssSelector("select option"));
//        String optionSelect = "Seoul CURA Healthcare Center";
//        for (int i=0;i<listele.size();i++){
//            if (listele.get(i).getText().contains(optionSelect)){
//                    listele.get(i).click();
//                System.out.println("Clicked");
//                    break;
//            }
//        }
    }
}

