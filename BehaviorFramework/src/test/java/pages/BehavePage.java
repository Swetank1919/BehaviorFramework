package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BehavePage {
	WebDriver driver=new ChromeDriver();

	public BehavePage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void user(String username) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	}
	public void pass(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
	}
	public void clickbtn() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}
	public void banner() {
		driver.findElement(By.xpath("//div[@class='product_label']")).isDisplayed();
	}
	public void userlogin(String username ,String password) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
	}
	

}
