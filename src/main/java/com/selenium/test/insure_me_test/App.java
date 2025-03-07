package com.selenium.test.insure_me_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class App {
    public static void main(String[] args) {

    	ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver= new ChromeDriver(options);
        
        

        driver.get("http://44.202.116.117:8081/contact.html");

        System.out.println(driver.getTitle());

       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement name = driver.findElement(By.id("inputName"));
        name.sendKeys("John Test");
        WebElement number = driver.findElement(By.id("inputNumber"));
        number.sendKeys("9789097788");
        WebElement email = driver.findElement(By.id("inputMail"));
        email.sendKeys("john@gmail.com");
        WebElement message = driver.findElement(By.id("inputMessage"));
        message.sendKeys("Hi John How are you, what are you doing");
        
        WebElement submitButton =driver.findElement(By.id("my-button"));       
       
        submitButton.click();

        WebElement response = driver.findElement(By.id("response"));
        response.getText();

        if( response.getText().equalsIgnoreCase("Message Sent"))
		{
			 System.out.println("Test Cases Passed Successfully");
		}
		else
		{
			 System.out.println("Test Cases Failed");
		}
        
        driver.quit();
    }
}
