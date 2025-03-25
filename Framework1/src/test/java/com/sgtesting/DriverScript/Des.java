package com.sgtesting.DriverScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class Des {
    public static void main(String[] args) {
       // DesiredCapabilities des=new DesiredCapabilities();
       // des.acceptInsecureCerts();
        ChromeOptions ops=new ChromeOptions();
        ops.addArguments("--start-maximized");
        ops.addArguments("--incognito");
        ops.addArguments("--kiosk");
        //ops.addArguments("--headless=new");
        //ops.addArguments("--disable-notifications");


        ops.setAcceptInsecureCerts(true);
        //ops.merge(des);
        WebDriver d=new ChromeDriver(ops);
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.get("https://cacert.com/");
        d.manage().window().minimize();
    }
}
