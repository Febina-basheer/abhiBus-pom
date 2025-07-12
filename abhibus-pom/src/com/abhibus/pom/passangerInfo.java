package com.abhibus.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class passangerInfo {
	
	
	WebDriverWait wait;


public passangerInfo(WebDriver driver) {
		
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	By Skip=By.xpath("//a[text()='Skip']");
	By MobileNumber=By.xpath("//input[@placeholder='Mobile Number']");
	By EmailId=By.xpath("//input[@placeholder='Email ID']");

	By PassangerName=By.xpath("//input[@placeholder='Name']");
	By PassangerAge=By.xpath("//input[@placeholder='Age']");
	By Gender=By.xpath("//button[text()='Female']");

	By radioBtnforRefundBy=By.xpath("//span[contains(text(),'Yes')]");
	By ContinueToPayBtn=By.partialLinkText("Continue to");
	
	public void Skip()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Skip)).click();
	}
	
	public void PassangerContactDetails()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileNumber)).sendKeys("7306169918");
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmailId)).sendKeys("Febina@basheer.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(PassangerName)).sendKeys("Febina Basheer");
		wait.until(ExpectedConditions.visibilityOfElementLocated(PassangerAge)).sendKeys("24");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Gender)).click();
		
	}
	
	public void Checkforrefund()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(radioBtnforRefundBy)).click();
	}
	
	public void ContinueToPay()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueToPayBtn)).click();
	}

}
