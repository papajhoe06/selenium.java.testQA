package com.selemiumjava.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Test for Push and Commit

public class Login {

WebDriver driver;
	
	@BeforeTest
	public void setup() {
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//Navigate Browser
		driver.get("https://katalon-demo-cura.herokuapp.com");
	
		// Get the title and verify 'Cura Healthcare Service App'
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		String ExpectedTitle = "CURA Healthcare Service";
		Assert.assertEquals(ExpectedTitle, Actualtitle);
		
		//Click Menu Button
		driver.findElement(By.xpath("//a[@id='menu-toggle']")).click();
		//Click Login
		driver.findElement(By.xpath("//a[@href='profile.php#login']")).click();
		//Input Data
		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		//Click Login
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();	
		
	}
	
	@Test(priority = 1) //Select Tokyo Facility Medicare
	public void FirstAppointment() {
	
		driver.findElement(By.xpath("//option[@value='Tokyo CURA Healthcare Center']")).click();
		//Apply for Hospital Readmission
		driver.findElement(By.xpath("//label[@for='chk_hospotal_readmission']")).click();
		//Healthcare Program
		driver.findElement(By.xpath("//input[@value='Medicare']")).click();
		//Visit Date
		driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("24/03/2023");
		//Commment
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("QA Booking Test");
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
	
	}
		
	@Test(priority = 2) //Select Hongkong Facility Medicaid 
	public void SecondAppointment () {
		
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
		//Apply for Hospital Readmission
		driver.findElement(By.xpath("//label[@for='chk_hospotal_readmission']")).click();
		//Healthcare Program
		driver.findElement(By.xpath("//input[@value='Medicaid']")).click();
		//Visit Date
		driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("24/03/2023");
		//Commment
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("QA Booking Test 2");
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
		
	}
		
	@Test(priority = 3) //Select Hongkong Facility Medicaid 
	public void ThirdAppointment () {
		
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		driver.findElement(By.xpath("//option[@value='Seoul CURA Healthcare Center']")).click();
		//Apply for Hospital Readmission
		driver.findElement(By.xpath("//label[@for='chk_hospotal_readmission']")).click();
		//Healthcare Program
		driver.findElement(By.xpath("//input[@value='None']")).click();
		//Visit Date
		driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("24/03/2023");
		//Commment
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("QA Booking Test 3");
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
			}
	}

/*	
// Get the title and verify 'Cura Healthcare Service App'
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		String ExpectedTitle = "CURA Healthcare Service";
		Assert.assertEquals(ExpectedTitle, Actualtitle);
		
		//Click Menu Button
		driver.findElement(By.xpath("(//a[@id='menu-toggle'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='profile.php#login']")).click();
		
		//Enter Email and Password - Using xpath locators
		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		
		//Click Login
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		
		//Book Appointment
		driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("24/03/2023");
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("Lorem Ipsum");
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();

		//Go Homepage
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		driver.findElement(By.xpath("//a[@id='menu-toggle']")).click();
		
		//Logout
		driver.findElement(By.xpath("//a[@href='authenticate.php?logout']")).click();

		
		*/
		
/*/
		//Enter Email and Password - Using xpath locators
		driver.findElement(ById.xpath("//input[@id='email']")).sendKeys("testqa@mail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");

		//Click Submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Add Goal Setter
		driver.findElement(By.xpath("//input[@id='text']")).sendKeys("Goal Automation1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
/*/
	

	