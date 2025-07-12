package com.abhibus.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusSelection {
	
	
WebDriver driver;
WebDriverWait wait;


public BusSelection(WebDriver driver) {
	this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));
}

By selectSeatBtn=By.xpath("(//button[text()=\"Select Seats\"])[1]");
By selectedSeatBtn=By.xpath("//*[@fill=\"white\"]/ancestor::button[1]");
By selectBoardingpointRadio=By.xpath("//div[@id=\"place-select-container\"]//label");
By selectDroppingpointRadio=By.xpath("//div[@id=\"place-select-container\"]//label");
By proceedBtn=By.xpath("//button[text()=\"Proceed\"]");

public void selectSeat()
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(selectSeatBtn)).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(selectedSeatBtn)).click();	
}

public void chooseStops()
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(selectBoardingpointRadio)).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(selectDroppingpointRadio)).click();
}

public void clickOnProceedBtn()
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(proceedBtn)).click();
}

}
