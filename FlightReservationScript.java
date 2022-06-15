package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightReservationScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
        
		//Check the blazedemo.com page using page title 
		System.out.println("Page Title " + driver.getTitle());
		
		//Perform a online ticket reservation
		WebElement select1 = driver.findElement(By.name("fromPort"));
		WebElement select2 = driver.findElement(By.name("toPort"));
		
		Select s1 = new Select(select1);
		Select s2 = new Select(select2);
		s1.selectByIndex(2);
		s2.selectByIndex(2);
		
		WebElement button1 = driver.findElement(By.tagName("input"));
		button1.click();
		
		WebElement button2 = driver.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"));
		button2.click();
		
		WebElement Name = driver.findElement(By.id("inputName"));
		Name.sendKeys("Prakash H");
		
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("Salavanpet");
		
		WebElement City = driver.findElement(By.id("city"));
		City.sendKeys("Vellore");
		
		WebElement State = driver.findElement(By.id("state"));
		State.sendKeys("TamilNadu");
		
		WebElement Zipcode = driver.findElement(By.id("zipCode"));
		Zipcode.sendKeys("222333");
		
		WebElement Cardtype = driver.findElement(By.id("cardType"));
		Select select3 = new Select(Cardtype);
		select3.selectByValue("visa");
		
		WebElement CreditCardNumber = driver.findElement(By.id("creditCardNumber"));
		CreditCardNumber.sendKeys("12345");
		
		WebElement CreditCardMonth = driver.findElement(By.id("creditCardMonth"));
		CreditCardMonth.clear();
		CreditCardMonth.sendKeys("6");
		
		WebElement CreditCardYear = driver.findElement(By.id("creditCardYear"));
		CreditCardYear.clear();
		CreditCardYear.sendKeys("2022");
		
		WebElement NameOnCard = driver.findElement(By.id("nameOnCard"));
		NameOnCard.sendKeys("Prakash");
		
		WebElement RememberMe = driver.findElement(By.id("rememberMe"));
		RememberMe.click();
		
		WebElement button3 = driver.findElement(By.xpath("//body[1]/div[2]/form[1]/div[11]/div[1]/input[1]"));
		button3.click();
		
		//Count the number of links and print the total number along with text of the link
		List<WebElement> NumberOfLink = driver.findElements(By.tagName("a"));
		System.out.println(NumberOfLink.size());
		for(WebElement i : NumberOfLink) {
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
		}
	}

}
