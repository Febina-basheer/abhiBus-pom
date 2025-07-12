package com.abhibus.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abhibus.pom.BusSelection;
import com.abhibus.pom.Homepage;
import com.abhibus.pom.passangerInfo;

public class TC_01_BookBusServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		
		driver.get("https://www.abhibus.com");
		Homepage oHomepage=new Homepage(driver);
		oHomepage.setLocationFrom();
		oHomepage.setDepatureDate();
		oHomepage.searchBus();
		
		BusSelection oBusSelection=new BusSelection(driver);
		oBusSelection.selectSeat();
		oBusSelection.chooseStops();
		oBusSelection.clickOnProceedBtn();
		
		passangerInfo opassangerInfo=new passangerInfo(driver);
		opassangerInfo.Skip();
		opassangerInfo.PassangerContactDetails();
		opassangerInfo.Checkforrefund();
		opassangerInfo.ContinueToPay();
		
		

	}

}
