package com.radio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {
	
	
	public static void main(String[] args) throws Exception {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		Thread.sleep(1000);
		
	driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
	
	Thread.sleep(1000);
	
	List<WebElement>  rbutton = driver.findElements(By.name("sex"));
	System.out.println(rbutton.size());
	
	for(int i=0 ; i<rbutton.size();i++) {
		
		String gen= rbutton.get(i).getAttribute("value");
		System.out.println(gen);
		
		//.out.println(gname.getAttribute("value"));
		
	if(gen.equals("1")) {

		 rbutton.get(i).click();
		 break;
		
	}

	}
		 
		
	}
}

