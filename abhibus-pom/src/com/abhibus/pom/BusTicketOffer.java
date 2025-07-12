package com.abhibus.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;


public class BusTicketOffer {
	
	

	public BusTicketOffer(WebDriver driver) {
		super();
		this.driver = driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	WebDriver driver;
	WebDriverWait wait;
	
	By viewDetailsBtn1=By.xpath("(//span[text()='View Details']/parent::a[@role='button'])[1]");
	By viewDetailsBtn2=By.xpath("(//span[text()='View Details']/parent::a)[8]");
	By viewDetailsBtn3=By.xpath("(//span[text()='View Details']/parent::a)[15]");
	
	By viewDetailsBtn4=By.xpath("(//span[text()='View Details']/parent::a)[2]");
	By viewDetailsBtn5=By.xpath("(//span[text()='View Details']/parent::a)[9]");
	By viewDetailsBtn6=By.xpath("(//span[text()='View Details']/parent::a)[16]");
	
	By viewDetailsBtn7=By.xpath("(//span[text()='View Details']/parent::a)[3]");
	By viewDetailsBtn8=By.xpath("(//span[text()='View Details']/parent::a)[10]");
	By viewDetailsBtn9=By.xpath("(//span[text()='View Details']/parent::a)[17]");
	
	By viewDetailsBtn10=By.xpath("(//span[text()='View Details']/parent::a)[4]");
	By viewDetailsBt11=By.xpath("(//span[text()='View Details']/parent::a)[11]");
	By viewDetailsBtn12=By.xpath("(//span[text()='View Details']/parent::a)[18]");
	
	By viewDetailsBtn13=By.xpath("(//span[text()='View Details']/parent::a)[5]");
	By viewDetailsBt14=By.xpath("(//span[text()='View Details']/parent::a)[12]");
	By viewDetailsBtn15=By.xpath("(//span[text()='View Details']/parent::a)[19]");
	
	By viewDetailsBtn16=By.xpath("(//span[text()='View Details']/parent::a)[6]");
	By viewDetailsBt17=By.xpath("(//span[text()='View Details']/parent::a)[13]");
	By viewDetailsBtn18=By.xpath("(//span[text()='View Details']/parent::a)[20]");
	
	By viewDetailsBtn19=By.xpath("(//span[text()='View Details']/parent::a)[7]");
	By viewDetailsBt20=By.xpath("(//span[text()='View Details']/parent::a)[14]");
	By viewDetailsBtn21=By.xpath("(//span[text()='View Details']/parent::a)[21]");
	
	By getCouponCode1=By.xpath("//div[contains(text(),'Apply Coupon code WHISTLEPODU')]");
	By getCouponCode2=By.xpath("//div[contains(text(),'Apply Coupon code WHISTLEPODU')]");
	By getCouponCode3=By.xpath("//div[contains(text(),'Apply Coupon code WHISTLEPODU')]");
	
	public void getCouponCode1()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewDetailsBtn1)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(getCouponCode1));
	}
	
	
;
}
