package com.example.version;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SummaryHistory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().window().setSize(new Dimension(1920, 1080));
	      driver.get("https://devcsapp.atria.healthcare/login");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("swamynaik@kavanant.com");
	      driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Swamy@333");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      Thread.sleep(6000);
	      driver.findElement(By.linkText("Version Summary History")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c3899553609-37']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//mat-option[@value='icd']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c3899553609-37']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//mat-option[@value='cpt']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c3899553609-37']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//mat-option[@value='medicine']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c3899553609-37']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//mat-option[@value='pharmacy']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c3899553609-37']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//mat-option[@value='allergies']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c3899553609-37']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//mat-option[@value='All']")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.linkText("Maintenance List")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("//button[@class='mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base']")).click();
	      Thread.sleep(4000);
	      driver.quit();

	}

}
