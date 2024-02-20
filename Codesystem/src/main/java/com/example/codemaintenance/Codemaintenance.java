package com.example.codemaintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Codemaintenance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://devcsapp.atria.healthcare/login");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("swamynaik@kavanant.com");
	      driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Swamy@333");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-listing/vex-page-layout/vex-page-layout-content/div/div[1]/button[3]/span[4]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//mat-select[@formcontrolname='codeType']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/mat-option[1]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@formcontrolname='fileName']")).sendKeys("C:\\Users\\Kavanant\\Downloads\\icd.zip\\");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/vex-code-maintenance-create/form/mat-dialog-content/div[2]/mat-form-field[1]/div[1]/div[2]/div[2]/mat-datepicker-toggle/button")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@formcontrolname='releaseVersion']")).sendKeys("2 version");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/vex-code-maintenance-create/form/mat-dialog-content/div[3]/mat-form-field[1]/div[1]/div[2]/div[2]/mat-datepicker-toggle/button")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/vex-code-maintenance-create/form/mat-dialog-content/div[3]/mat-form-field[2]/div[1]/div[2]/div[2]/mat-datepicker-toggle/button")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[7]/button/span[1]")).click();
	      Thread.sleep(2000);
	      //upload button
	      //driver.findElement(By.xpath("//button[@type='submit']")).click();
	      //cancel button
	      driver.findElement(By.xpath("//button[@class='cancel-button mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-unthemed mat-mdc-button-base']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@class='mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base']")).click();
	      Thread.sleep(2000);
	      driver.quit();

	}

}
