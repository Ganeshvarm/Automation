package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new EdgeDriver();
    driver.get("https://demo.guru99.com/insurance/v1/register.php");
    Select dropdown=new Select(driver.findElement(By.name("title")));
    dropdown.selectByIndex(1);
    Thread.sleep(5000);
    dropdown.selectByValue("Doctor");
    Thread.sleep(5000);
    dropdown.selectByVisibleText("General");
    Select dropdown1=new Select(driver.findElement(By.name("year")));
    dropdown1.selectByIndex(59);
    Thread.sleep(3000);
    Select dropdown2=new Select(driver.findElement(By.name("month")));
    dropdown2.selectByIndex(7);
    Select licence=new Select(driver.findElement(By.name("licenceperiod")));
    licence.selectByIndex(3);
    Thread.sleep(3000);
	}

}
