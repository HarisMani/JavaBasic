import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class basicSelenium {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hai");
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("LOG IN")).click();
		WebElement mail = driver.findElement(By.name("n"));
		mail.sendKeys("haris120597@gmail.com");
		WebElement pwd = driver.findElement(By.name("p"));
		pwd.sendKeys("Change@123");
		driver.findElement(By.id("login_submit_button")).click();
		// Thread.sleep(9000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("waited");
		// ERR driver.findElement(By.id("mypage_circle1")).click();
		// ccWebElement gh=
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a/svg/path[1]"));
		// ccgh.findElement(By.id("mypage_circle1")).click();

		// id("mypage_circle1")).dispatchEvent(new Event("click"));
		driver.findElement(By.id("navbtn_tutorials")).click();

		driver.findElement(By.id("navbtn_references")).click();
		driver.findElement(By.id("navbtn_examples")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/a[1]")).click();
		driver.findElement(By.name("search")).sendKeys("haris");
		driver.findElement(By.xpath("//*[@id='___gcse_0']/div/div/form/table/tbody/tr/td[2]/button")).click();
		driver.findElement(By.xpath("//*[@id='___gcse_0']/div/div/div[1]/div[1]")).click();
		WebElement ma = driver.findElement(By.xpath("//*[@id='mypage_circle1']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ma).click().perform();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("https://www.flipkart.com/account/orders?link=home_orders");
        driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div/span")).click();
		driver.close();
		// .linkText("LOG OUT")).click();

		// WebElement mapObject =
		// driver.findElement(By.xpath("//*[name()='svg']/*[name()='path[1]']"));

		// Actions builder = new Actions(driver);

		// builder.contextClick(mapObject).perform();
	}

}
