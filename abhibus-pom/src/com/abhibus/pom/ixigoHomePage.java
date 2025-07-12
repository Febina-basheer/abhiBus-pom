package com.abhibus.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ixigoHomePage {
	
	By fromLocationIp=By.xpath("//p[@data-testid=\"originId\"]/ancestor::div[3]");
	By fromLocationtxtBx=By.xpath("//label[text()='From']/following-sibling::input");
	By toLocationIp=By.xpath("//p[@data-testid=\"destinationId\"]/ancestor::div[3]");
	By departureDateIp=By.xpath("//p[@data-testid=\"departureDate\"]/ancestor::div[3]");
	By SearchBtn=By.xpath("//button[text()=\"Search\"]");
	
	public void setFromLocation()
	{
		WebDriver driver=new ChromeDriver();
		driver.findElement(fromLocationIp).click();
		driver.findElement(fromLocationtxtBx).sendKeys("Kochi");
		driver.findElement(By.xpath("//span[contains(text(),'Kochi')]/ancestor::div[1]")).click();
	}
	

	public void setToLocation()
	{
		WebDriver driver=new ChromeDriver();
		driver.findElement(toLocationIp).click();
		driver.findElement(toLocationIp).sendKeys("Bangalore");
		
		
		
	}
	
//	driver.findElement(departureDateIp).click();
//	driver.findElement(SearchBtn).click();
}
