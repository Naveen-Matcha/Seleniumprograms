package com.example.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScriptPad {

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
		driver.findElement(By.xpath("//i[@class='fa fa-clipboard']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Add Prescription']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter 3 chars or more...']")).sendKeys("00591387544");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Add to patient']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='quickInput ng-untouched ng-pristine ng-invalid']")).sendKeys("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window[3]/div/div/app-prescription-add/div[2]/div/form/div/div[4]/div[2]/form/div[1]/div[2]/div/select")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window[3]/div/div/app-prescription-add/div[2]/div/form/div/div[4]/div[2]/form/div[1]/div[2]/div/select/option[3]")).click();
		Thread.sleep(2000);
		//save and cancel buttons
		//driver.findElement(By.xpath("/html/body/ngb-modal-window[3]/div/div/app-prescription-add/div[3]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("/html/body/ngb-modal-window[3]/div/div/app-prescription-add/div[3]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-times float-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-close mt-1 mr-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='user-avatar rounded-circle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
