package com.example.demo.Codesystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage 
{
    public static void main( String[] args ) throws InterruptedException
    {
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
      driver.quit();
    }
}
