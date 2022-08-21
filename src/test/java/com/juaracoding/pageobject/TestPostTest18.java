package com.juaracoding.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.PostTest18;



public class TestPostTest18 {
	
	public static WebDriver driver;
	private PostTest18 postTest18;


	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/";
		driver.get(url);

	}
	
	@BeforeMethod
	public void pageObject() {
		postTest18 = new PostTest18();
	}

	@Test
	public void testSearch() throws InterruptedException {
//		Step Search
		postTest18.clickSearch();
		delay(3);
		
		postTest18.txtSearch("");
		postTest18.getTitleSearch();
		System.out.println(postTest18.getTitleSearch());
		
		scroll(500);
		delay(3);
		
		
//		Step Pilih Barang Pertama
		postTest18.clickShirtOne();
		Thread.sleep(1000);
		System.out.println("Pilih Barang 1 Berhasil");
		System.out.println(postTest18.getTxtShirtOne());
		
		scroll(500);
		
//		Step Add Cart 1
		postTest18.addCart();
		Thread.sleep(1000);
		System.out.println("Yeay, Barang pertama mu sudah ada di keranjang");
		
		
//		Step pilih barang kedua
		driver.get("https://shop.demoqa.com/?s=SHIRT&post_type=product");
		
		scroll(500);
		postTest18.clickShirtTwo();
		Thread.sleep(1000);
		System.out.println("Pilih Barang 2 Berhasil");
		System.out.println(postTest18.getTxtShirtTwo());
		
		scroll(500);
		
//		Step Add Cart 2
		postTest18.addCartTwo();
		Thread.sleep(1000);
		System.out.println("Yeay, Barang kedua mu sudah ada di keranjang");
		
	}

	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}


}
