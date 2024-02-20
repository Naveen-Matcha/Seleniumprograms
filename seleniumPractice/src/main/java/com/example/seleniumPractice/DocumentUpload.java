package com.example.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DocumentUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dv.cinch-project.com/#/");
		driver.findElement(By.name("FormEmail")).sendKeys("cs");
		driver.findElement(By.name("password")).sendKeys("Cips@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@type='search']"));
		searchbox.sendKeys("Test, Mahesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='search-patient-name text-truncate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Files Upload']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn btn-outline-secondary btn-sm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ngb-dp-day ngb-dp-today']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='docTypeId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='5: 442']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='labOrderId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='82']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='signRequired']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='outcomeId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='385']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Provider Name ']")).sendKeys("s");
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/main/form/div[8]/div[2]/app-seachselectdd/div/div[2]/ul[1]/li")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uploadFiles")).sendKeys("C:\\Users\\Kavanant\\Pictures\\Screenshots\\Screenshot (2).png");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("doc created");
		Thread.sleep(2000);
		//upload button
		//driver.findElement(By.id("uploadDocBtn")).click();
		//upload add button
		//driver.findElement(By.id("uploadAndAddDocBtn")).click();
		//cancel button
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary btn-sm mr-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='user-avatar rounded-circle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
