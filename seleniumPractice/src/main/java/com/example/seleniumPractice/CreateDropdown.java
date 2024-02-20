package com.example.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDropdown {

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
		driver.findElement(By.xpath("//i[@class='fa fa-plus-circle']")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/app-root/app-emr/div/div/div/div/div/div[2]/app-chart-container/div[1]/div/div/div[2]/div/div[1]/button[1]/ul/li/a/i[1]")).click();
		//PROGRESSNOTE CREATE
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='icon icon-pcpnote']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Provider Name ']")).clear();
	    WebElement provider = driver.findElement(By.xpath("//input[@placeholder='Provider Name ']"));
	    provider.sendKeys("Byrnes Thomas");
	    driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/main/form/div[1]/div[2]/app-seachselectdd/div/div[2]/ul/li")).click();
        Thread.sleep(2000);
//		driver.findElement(By.xpath("//select[@name='soapTempId']")).sendKeys("MPD");
//		driver.findElement(By.xpath("//option[@value='7']"));
		WebElement visitType = driver.findElement(By.xpath("//input[@name='visitDescription']"));
		visitType.clear();
		visitType.sendKeys("PN note");
		Thread.sleep(2000);
		//cancel button in progressnote create
		driver.findElement(By.xpath("//button[@id='closePnCreate']")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
		Thread.sleep(2000);
		//LETTERNOTE
		driver.findElement(By.xpath("//i[@class='fa fa-plus-circle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"emr-card\"]/div[2]/app-chart-container/div[1]/div/div/div[2]/div/div[1]/button[1]/ul/li/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"emr-card\"]/div[2]/app-chart-container/div[1]/div/div/div[2]/div/div[1]/button[1]/ul/li/ul/li[2]/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-target='#collapse-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collapse-1\"]/span/span[7]/i")).click();
		Thread.sleep(2000);
		//sava &close and cancel button
		//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-sm mr-3']")).click();
		Thread.sleep(2000);
		//CHARTNOTE
		driver.findElement(By.xpath("//i[@class='fa fa-plus-circle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"emr-card\"]/div[2]/app-chart-container/div[1]/div/div/div[2]/div/div[1]/button[1]/ul/li/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" /html/body/div[1]/app-root/app-emr/div/div/div/div/div/div[2]/app-chart-container/div[1]/div/div/div[2]/div/div[1]/button[1]/ul/li/ul/li[2]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-target='#collapse-8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collapse-8\"]/span/span[6]")).click();
		Thread.sleep(2000);
		//save&close and cancel buttons
		//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-sm mr-3']")).click();
		Thread.sleep(2000);
		//OPNOTE
		driver.findElement(By.xpath("//i[@class='fa fa-plus-circle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"emr-card\"]/div[2]/app-chart-container/div[1]/div/div/div[2]/div/div[1]/button[1]/ul/li/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" /html/body/div[1]/app-root/app-emr/div/div/div/div/div/div[2]/app-chart-container/div[1]/div/div/div[2]/div/div[1]/button[1]/ul/li/ul/li[2]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-target='#collapse-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collapse-1\"]/span/span[8]")).click();
		Thread.sleep(2000);
		//save& close and cancel buttons
		//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-sm mr-3']")).click();
		//sign&close button
		//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm mr-3']")).click();
		Thread.sleep(2000);
		//ORDER
		driver.findElement(By.xpath("//i[@class='fa fa-plus-circle']")).click();
		//driver.findElement(By.xpath("//span[@class='icon icon-order']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='icon icon-order']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter 3 chars or more...']")).sendKeys("G9873");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-chartcard/main/div[4]/div[6]/ul/li/div/label/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-invalid is-invalid']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='317']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@formcontrolname='facilityId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@formcontrolname='primary']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//option[@value='297150']")).click();
		Thread.sleep(2000);
		//save and cancel buttons
		//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-sm mr-3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-times float-right']")).click();
		Thread.sleep(2000);
		//Referrals
		driver.findElement(By.xpath("//i[@class='fa fa-plus-circle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"emr-card\"]/div[2]/app-chart-container/div[1]/div/div/div[2]/div/div[1]/button[1]/ul/li/ul/li[4]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter 3 chars or more...']")).sendKeys("24079");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-chartcard/main/div[4]/div[6]/ul/li/div/label/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-calendar']")).click();
		driver.findElement(By.xpath("//div[@tabindex='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='referingReason']")).sendKeys("leg pain");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='input-group-btn mt-1']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='providerIfKnown']")).sendKeys("res");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-referrals/div/div[2]/form/div[2]/div/div/div/div[2]/ul[2]/li")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-referrals/div/div[2]/form/div[3]/div[2]/form/div[2]/div[2]/div/select")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-referrals/div/div[2]/form/div[3]/div[2]/form/div[2]/div[2]/div/select/option[2]")).click();
		Thread.sleep(2000);
		//save and cancel buttons
		//driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-referrals/footer/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-referrals/footer/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-times float-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='user-avatar rounded-circle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();
		Thread.sleep(4000);
		driver.quit();
		

	}

}
