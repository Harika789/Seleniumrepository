import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
// WebDriver driver=new InternetExplorerDriver();
 System.setProperty("webdriver.ie.driver", "D:\\Training for selenium\\IEDriverServer.exe");
 WebDriver driver=new InternetExplorerDriver();
 driver.manage().window().maximize();
Runtime.getRuntime().exec("D:\\Training for selenium\\Handle Authentication.exe");
 driver.get("https://deliveryexcellencest.cognizant.com/apps/processspace");
driver.findElement(By.xpath("//*[@id='inner-content-div']/ul/li[2]/a/span[2]")).click();;
driver.findElement(By.xpath("//*[@id='pursuitView']/ul[3]/li/span[4]")).click();
 driver.findElement(By.xpath("//*[@id='inner-content-div']/ul/li[3]/a/span[2]")).click();
 driver.findElement(By.xpath("//*[@id='Manual-element']")).click();
 driver.close();
	}

}
