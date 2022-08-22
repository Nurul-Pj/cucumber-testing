package com.juaracoding.pageobject.pages;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class PostTest18 {
	
	private WebDriver driver;
	
	public PostTest18 () {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Element Search
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//label[@class='note-search']")
	private WebElement txtTitleSearch;
	
	@FindBy(xpath = "//input[@name='s']")
	private WebElement search;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement inputSearch;
	
	
//	Element Barang 1
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div")
	private WebElement shirtOne;
	
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtShirtOne;
	
	@FindBy(xpath = "//*[@id='product-1497']/div[1]/div[2]/div[2]/div")
	private WebElement wishlistOne;
	
//	@FindBy(xpath = "//select[@id='pa_color']")
//	private WebElement pilihColor;
//	
//	@FindBy(xpath = "//select[@id='pa_size']")
//	private WebElement pilihSize;
//	
//	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
//	private WebElement btnAddCart;
	
//	Element Barang 2
	
	@FindBy(xpath = "//*[@id='noo-site']/div[2]/div[2]/div/div/div[2]/div")
	private WebElement shirtTwo;
	
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtShirtTwo;
	
	@FindBy(xpath = "//*[@id='product-1491']/div[1]/div[2]/div[2]/div")
	private WebElement wishlistTwo;
	
//	@FindBy(xpath = "//select[@id='pa_color']")
//	private WebElement pilihColorTwo;
//	
//	@FindBy(xpath = "//select[@id='pa_size']")
//	private WebElement pilihSizeTwo;
//	
//	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
//	private WebElement btnAddCartTwo;
	
	public void txtSearch(String search) {
		this.search.sendKeys("SHIRT" + "\n"); //step 
	}
	
	public String getTitleSearch() {
		return txtTitleSearch.getText();
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
	public String getTxtShirtOne() {
		return txtShirtOne.getText();
	}
	
	public void clickShirtOne() {
		shirtOne.click();
	}
	
	public void clickWishlistOne() {
		wishlistOne.click();
	}
	
	public void clickWishlistTwo() {
		wishlistTwo.click();
	}
	
//	public void addCart() {
//		Select select = new Select(pilihColor);
//		select.selectByValue("pink");
//		pilihColor.click();
//		Select selectOne = new Select(pilihSize);
//		selectOne.selectByValue("36");
//		pilihSize.click();
//		btnAddCart.click();
//	}
	
	public String getTxtShirtTwo() {
		return txtShirtTwo.getText();
	}
	
	public void clickShirtTwo() {
		shirtTwo.click();
	}
//	
//	public void addCartTwo() {
//		Select select1 = new Select(pilihColorTwo);
//		select1.selectByValue("grey");
//		pilihColor.click();
//		Select select2 = new Select(pilihSizeTwo);
//		select2.selectByValue("40");
//		pilihSizeTwo.click();
//		btnAddCart.click();
//	}

}
