package com.example.seleniumPractice;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppointmentChart {
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//i[@class='fa fa-calendar-plus-o ml-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='facility']")).sendKeys("s");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-appointment/div[1]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/ul/li[1]")).click();
		Thread.sleep(2000);
//		WebElement timeDropdown = driver.findElement(By.xpath("//input[@formcontrolname='startTime']"));
//		timeDropdown.clear();
//		timeDropdown.click();
//		Thread.sleep(2000);
        Thread.sleep(2000);
    	driver.findElement(By.xpath("//select[@formcontrolname='visitType']")).click();
    	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-appointment/div[1]/form/div[2]/div[3]/div[1]/div[1]/div[2]/div/select/option[2]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//select[@formcontrolname='provider']")).click();
    	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-appointment/div[1]/form/div[2]/div[2]/div[2]/div[1]/div[2]/div/select/option[4]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@formcontrolname='refPhysician']")).click();
    	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-appointment/div[1]/form/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/ul/li[4]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-appointment/footer/div[2]/button[1]")).click();
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='user-avatar rounded-circle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();
		Thread.sleep(4000);
		driver.quit();
		
	

		

	}
}
