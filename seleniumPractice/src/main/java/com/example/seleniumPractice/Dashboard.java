package com.example.seleniumPractice;

import java.time.Duration;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard {

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
        driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-sm dropdown-toggle float-right ml-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Provider's Visit Grid")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='searchString']")).sendKeys("Test Mahesh");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='ptname']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Facility Name ']")).sendKeys("Silverside");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='list-group-item dropdown-item']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Provider Name ']")).sendKeys("Roth");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"emr-card\"]/div[2]/app-visit-grid/div/div/div/div/div/form/div[2]/div[4]/app-seachselectdd/div/div[2]/ul/li")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-custom float-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Create Routing Slip']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"emr-card\"]/div[2]/app-visit-grid/div/div/div/div/div/div[3]/table/tbody/tr/td[14]/div/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-times float-right']")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm float-right printBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Open Chart']")).click();
		//driver.findElement(By.xpath("/html/body/print-preview-app//print-preview-sidebar//print-preview-button-strip//div/cr-button[1]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
////button[@class='btn btn-outline-primary btn-sm mr-3']cancel button
