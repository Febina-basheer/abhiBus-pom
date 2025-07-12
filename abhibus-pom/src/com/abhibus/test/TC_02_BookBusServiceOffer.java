package com.abhibus.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abhibus.pom.BusTicketOffer;
import com.abhibus.pom.Homepage;

public class TC_02_BookBusServiceOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.abhibus.com/");
		
		Homepage oHomepage=new Homepage(driver);
		oHomepage.offerBtn();
		
		BusTicketOffer oBusTicketOffer=new BusTicketOffer(driver);
		oBusTicketOffer.getCouponCode1();
		
	
	}

}
