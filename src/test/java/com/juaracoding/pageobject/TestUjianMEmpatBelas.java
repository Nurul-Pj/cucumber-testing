package com.juaracoding.pageobject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;



import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.UjianMEmpatBelas;

public class TestUjianMEmpatBelas {
	
	public static WebDriver driver;
	private UjianMEmpatBelas ujianEmpatBelas;

	
	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/";
		driver.get(url);

	}
	
	@BeforeMethod
	public void pageObject() {
//		postTest18 = new PostTest18Update();
		ujianEmpatBelas = new UjianMEmpatBelas();
	}
	
	@Test(priority = 1)
	public void testRegister() throws InterruptedException {
		System.out.println("=========REGISTRASI==========");
		driver.navigate().to("https://shop.demoqa.com/my-account/");
		ujianEmpatBelas.regist("nurul_pj", "fajriantynurul99@gmail.com", "nurulpj2099");
		System.out.println("Registrasi Done");
		Thread.sleep(1000);
		
		System.out.println("=========LOGIN==========");
		ujianEmpatBelas.login("nurul_pj", "nurulpj2099");
		System.out.println("Login Done");
		Thread.sleep(1000);
		
		System.out.println("=========SEARCH==========");
//		driver.navigate().refresh();
		ujianEmpatBelas.clickSearch();
		delay(3);
		ujianEmpatBelas.txtSearch("");
		ujianEmpatBelas.getTitleSearch();
		System.out.println(ujianEmpatBelas.getTitleSearch());
		System.out.println("Search Berhasil");
		scroll(500);
		delay(3);
		
//		Step pilih barang 1
		System.out.println("==========PILIH BARANG 1==========");
		ujianEmpatBelas.clickShirtOne();
		Thread.sleep(1000);
		System.out.println("Pilih Barang 1 Berhasil");
		System.out.println(ujianEmpatBelas.getTxtShirtOne());
		scroll(500);

//		Compare Product
		System.out.println("==========COMPARE 1========");
		ujianEmpatBelas.compareOne();
		Thread.sleep(5000);
		ujianEmpatBelas.close();
		delay(3);
		System.out.println("Compare Sukses");
//		driver.navigate().refresh();
//		scroll(300);
		driver.navigate().back();
		
//		Step pilih barang 2
		System.out.println("==========PILIH BARANG 2==========");
		ujianEmpatBelas.clickShirtTwo();
		Thread.sleep(1000);
		System.out.println("Pilih Barang 2 Berhasil");
		System.out.println(ujianEmpatBelas.getTxtShirtOne());
		scroll(500);
		
//		Compare Product
		System.out.println("==========COMPARE 2========");
		Thread.sleep(2000);
		ujianEmpatBelas.compareTwo();
		Thread.sleep(5000);
		delay(3);
		ujianEmpatBelas.closeTwo();
//		ujianEmpatBelas.compareTwo();
		System.out.println("Compare Sukses");
//		ujianEmpatBelas.addCartTwo();
		
//		Step Add Cart
		scroll(500);
		ujianEmpatBelas.addCartTwo();
		Thread.sleep(1000);
		System.out.println("The Product add to Cart");
		
		System.out.println("==========KLIK CART==========");
		ujianEmpatBelas.clickBtnCart();
		scroll(300);
		System.out.println("Keranjang berhasil diklik");
		
		System.out.println("==========CHECKOUT==========");
		scroll(300);
		ujianEmpatBelas.clickBtnCheckout();
		System.out.println("Silahkan checkout barangnya :)");
		
		driver.navigate().to("https://shop.demoqa.com/checkout/");
		ujianEmpatBelas.data();
		delay(3);
		ujianEmpatBelas.clickTerms();
		ujianEmpatBelas.clickPlaceOrder();
		System.out.println("Checkout Berhasil");
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
