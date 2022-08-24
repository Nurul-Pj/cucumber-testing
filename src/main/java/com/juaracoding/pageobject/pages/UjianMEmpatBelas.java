package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class UjianMEmpatBelas {
private WebDriver driver;
	
	public UjianMEmpatBelas () {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Register
	
	@FindBy(xpath = "//*[@id='reg_username']")
	private WebElement usernameReg;
	
	@FindBy(xpath = "//*[@id='reg_email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id='reg_password']")
	private WebElement passwordReg;
	
	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegist;
	
//	Login
	
	@FindBy(xpath = "//*[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
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
	
	@FindBy(xpath = "//*[@id='product-1497']/div[1]/div[2]/a")
	private WebElement compare;
	
	@FindBy(xpath = "//*[@id='cboxClose']")
	private WebElement close;
	
//	@FindBy(xpath = "//select[@id='pa_color']")
//	private WebElement pilihColor;
//	
//	@FindBy(xpath = "//select[@id='pa_size']")
//	private WebElement pilihSize;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAddCart;
	
//	Element Barang 2
	
	@FindBy(xpath = "//*[@id='noo-site']/div[2]/div[2]/div/div/div[2]/div")
	private WebElement shirtTwo;
	
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtShirtTwo;
	
	@FindBy(xpath = "//*[@id='product-1491']/div[1]/div[2]/a")
	private WebElement compareTwo;
	
	@FindBy(css = "a[aria-label='Select options for “pink drop shoulder oversized t shirt”']")
	private WebElement selectOptions;
	
	@FindBy(xpath = "//*[@id=\"cboxClose\"]")
	private WebElement closeTwo;
	
	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement pilihColorTwo;
	
	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement pilihSizeTwo;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAddCartTwo;
	
	@FindBy(xpath = "//*[@id='nav-menu-item-cart']/a")
	private WebElement btnCart;

//	Checkout
	@FindBy(xpath = "//*[@id='post-6']/div/div/div[2]/div[2]/div/a")
	private WebElement btnCheckout;
	
//	Data Place Order
	@FindBy(xpath = "//input[@id='billing_first_name']")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='billing_last_name']")
	private WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='billing_company']")
	private WebElement txtCompany;
	
	@FindBy(xpath = "//select[@id='billing_country']")
	private WebElement pilihNegara;
	
	@FindBy(xpath = "//input[@id='billing_address_1']")
	private WebElement txtAddress;
	
	@FindBy(xpath = "//input[@id='billing_city']")
	private WebElement txtKota;
	
	@FindBy(xpath = "//select[@id='billing_state']")
	private WebElement pilihProvinsi;
	
	@FindBy(xpath = "//input[@id='billing_postcode']")
	private WebElement txtPostcode;
	
	@FindBy(xpath = "//input[@id='billing_phone']")
	private WebElement txtTelpon;
	
	@FindBy(xpath = "//input[@id='billing_email']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//*[@id='terms']")
	private WebElement terms;
	
	@FindBy(xpath = "//button[@id='place_order']")
	private WebElement btnPlaceOrder;
	
	public void regist(String usernameReg, String email, String password) {
		this.usernameReg.sendKeys(usernameReg);
		this.email.sendKeys(email);
		this.passwordReg.sendKeys(password);
		btnRegist.click(); 
	}
	
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin.click(); 
	}
	
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
	
	public void compareOne() throws InterruptedException {
		compare.click();
		Thread.sleep(5000);
	}
	
	public void close() {
		close.click();
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
	
	public void compareTwo() throws InterruptedException {
		compareTwo.click();
		Thread.sleep(7000);
	}
	
	public void closeTwo() {
		closeTwo.click();
	}
	
	public void selectOptions() {
		selectOptions.click();
	}
		
	public void addCartTwo() {
		Select select1 = new Select(pilihColorTwo);
		select1.selectByValue("grey");
		pilihColorTwo.click();
		Select select2 = new Select(pilihSizeTwo);
		select2.selectByValue("40");
		pilihSizeTwo.click();
		btnAddCart.click();
	}
	
	public void clickBtnCart() {
		btnCart.click();
	}
	
	public void clickBtnCheckout() {
		btnCheckout.click();
	}
	
	public void data () {
		this.txtFirstName.sendKeys("Nurul");
		this.txtLastName.sendKeys("Fajrianty");
		System.out.println("Nama : Nurul Fajrianty");
		this.txtCompany.sendKeys("PT DIKA");
		System.out.println("Company : PT DIKA");
		Select negara = new Select(pilihNegara);
		negara.selectByValue("ID");
		System.out.println("Country : Indonesia");
		this.txtAddress.sendKeys("Premier Serenity Blok S.29");
		System.out.println("Address : Premier Serenity Blok S.29");
		this.txtKota.sendKeys("Bekasi");
		System.out.println("City : Bekasi");
		Select provinsi = new Select(pilihProvinsi);
		provinsi.selectByValue("JB");
		System.out.println("Province : Jawa Barat");
		this.txtPostcode.sendKeys("17112");
		System.out.println("Post Code : 17112");
		this.txtTelpon.sendKeys("081906753073");
		System.out.println("No. Telphone : 081906753073");
		this.txtEmail.sendKeys("fajriantynurul99@gmail.com");
		System.out.println("Email : fajriantynurul99@gmail.com");
//		terms.click();
//		btnPlaceOrder.click();
	}
	
	public void clickTerms() {
		terms.click();
	}
	
	public void clickPlaceOrder() {
		btnPlaceOrder.click();
	}

}
