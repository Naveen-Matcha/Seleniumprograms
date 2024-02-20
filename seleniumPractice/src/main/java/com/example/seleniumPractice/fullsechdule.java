package com.example.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fullsechdule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dv.cinch-project.com/#/");
		driver.findElement(By.name("FormEmail")).sendKeys("cs");
		driver.findElement(By.name("password")).sendKeys("Cips@1234");
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@type='search']"));
		searchbox.sendKeys("rita test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='search-patient-name text-truncate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Full Schedule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='New Appointment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search by Patient Name']")).sendKeys("rita test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ptname']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search by']")).sendKeys("Mid");
		driver.findElement(By.xpath("//div[@class='dropdown-menu _dropdown show']")).click();
		Thread.sleep(2000);
		Select Visittype = new Select(driver.findElement(By.xpath("//select[@formcontrolname='visitType']")));
		Visittype.selectByVisibleText(" DEPO (Deposition) ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='billingNotes']")).sendKeys("bill paid");
		Thread.sleep(2000);
		Select provider = new Select(driver.findElement(By.xpath("//select[@formcontrolname='provider']")));
		provider.selectByIndex(3);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-appointment/div[1]/form/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"lookup-tr-4\"]/td[2]")) .click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary btn-sm mr-3']")).click();
		driver.findElement(By.id("sidebarIcon")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/app-root/app-scheduler/div[1]/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[3]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/app-root/app-scheduler/div[1]/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[5]")).click();
		driver.findElement(By.id("compare-75")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm mr-2 float-right']")).click();
//		WebElement Physician =;
//		Physician.sendKeys("Saman, Aboudi");
		//Physician.click();
		//driver.findElement(By.xpath("//div[@class='dropdown-menu _dropdown show']")).click();
		Thread.sleep(4000);
    	driver.quit();

	}

}
