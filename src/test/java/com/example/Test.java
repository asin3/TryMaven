package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(string [] args) throws InterruptedException {

        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        Thread.sleep(1000);
        driver.close();
    }
}