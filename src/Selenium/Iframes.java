package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframes {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().frame(1);
	driver.findElement(By.name("mytext1")).sendKeys("varma");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
    driver.switchTo().frame(2);
    driver.findElement(By.name("mytext2")).sendKeys("varma");
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
    driver.switchTo().frame(3);
    driver.findElement(By.name("mytext3")).sendKeys("varma");
    /* driver.switchTo().frame(0);
    driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
    driver.switchTo().defaultContent();
    List<WebElement> CHK=driver.findElements(By.xpath("////*[@id=\"i19\"]/div[3]"));
    System.out.println(CHK.size());
    for( int i=0;i<CHK.size();i++) {
    	CHK.get(i).click();
    }*/
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
    driver.switchTo().frame(4);
    driver.findElement(By.name("mytext4")).sendKeys("varma");
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("/html/frameset/frame[2]"));
    driver.switchTo().frame(5);
    driver.findElement(By.name("mytext5")).sendKeys("varma");


    
	
	
	
	
	
	
	
	
	
	
	


    
			
	
			

	}

}
