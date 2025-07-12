package com.abhibus.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	//declare as a class variable.
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public Homepage(WebDriver driverfrommotherclass) {
		
		this.driver = driverfrommotherclass;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		
	}

	By flightsBtn=By.id("flights-link");
	By leavingFromIp=By.xpath("//input[@placeholder=\"Leaving From\"]");
	By goingToIp=By.xpath("//input[@placeholder=\"Going To\"]");
	By departureDateIp=By.xpath("//input[@placeholder=\"Onward Journey Date\"]");
	By searchBtn=By.xpath("//span[text()=\"Search\"]/parent::a");
	
	//offers
	
	By offerBtn=By.id("offers-link");
	
	
	
	public void navigateToFlight()
	{
		
		//WebDriver driver= new ChromeDriver();
		driver.findElement(flightsBtn).click();
	}
	
	public void setLocationFrom()
	{
	//WebDriver driver=new ChromeDriver();
		//Leaving
	driver.findElement(leavingFromIp).click();
	driver.findElement(leavingFromIp).sendKeys("Kochi");
	driver.findElement(By.xpath("//div[text()=\"Kochi\"]/parent::div")).click();
	
	    //going to
	driver.findElement(goingToIp).click();
	driver.findElement(goingToIp).sendKeys("Bangalore");
	driver.findElement(By.xpath("//div[text()=\"Bangalore\"]/parent::div")).click();
	}

	
	public void setDepatureDate()
	{
		driver.findElement(departureDateIp).click();
		driver.findElement(By.xpath("//a[text()=\"31\"]")).click();
	}
	
	public void searchBus()
	{
		driver.findElement(searchBtn).click();
	}
	
	public void offerBtn()
	{
		driver.findElement(offerBtn).click();
	}

}
