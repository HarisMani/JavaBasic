import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
			System.out.println("Hai");
			System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\chromedriver_win32Ver90\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/");

	}

}
