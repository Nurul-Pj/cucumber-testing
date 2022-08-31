package com.juaracoding.pageobject.demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestShopping {
	
	public static WebDriver driver;
	private ShoppingDemoqa shoppingDemoqa = new ShoppingDemoqa();
	
	@Before
	public void setUp () {
		DriverSingleton.getInstance(Constants.CHROME);
		shoppingDemoqa = new ShoppingDemoqa();
	}
	
//	scenario 1
	@Given("user go to shop web")
	public void user_go_to_shop_web() {
		driver = DriverSingleton.getDriver();
		driver .get(Constants.URLSHOP);
	}
	
	@When("user enter button search")
	public void user_enter_button_search() {
		shoppingDemoqa.clickSearch();
	}
	
	@And("user search product one")
	public void user_search_product_one() {
		shoppingDemoqa.txtSearch("");
		scroll(500);
		shoppingDemoqa.clickDress();
	}
	
	@And("user search product two")
	public void user_search_product_two() {
		shoppingDemoqa.clickSearch();
		scroll(500);
		shoppingDemoqa.txtSearch1("");
	}

	@And("click product shirt")
	public void click_product_shirt() {
		driver.navigate().to("https://shop.demoqa.com/?s=shirt&post_type=product");
		scroll(500);
		shoppingDemoqa.clickShirt();
		scroll(300);
	}
	
	@Then("add to cart")
	public void add_to_cart() {
		shoppingDemoqa.addCart();
		shoppingDemoqa.clickBtnCart();
	}
	
	@And("user click tab checkout")
	public void user_click_tab_checkout() {
		shoppingDemoqa.clickBtnCheckout();
		scroll(300);
	}
	
	@And("fill out the form")
	public void fill_out_the_form() {
		shoppingDemoqa.data();
		delay(3);
		shoppingDemoqa.clickTerms();
	}
	
	@Then("click button place order")
	public void click_button_place_order() {
		shoppingDemoqa.clickPlaceOrder();
	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
	
	public static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
