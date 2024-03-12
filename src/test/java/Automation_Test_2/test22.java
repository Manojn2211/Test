package Automation_Test_2;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class test22 {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();


driver.get("https://demo.dealsdray.com/mis/dashboard");
driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("prexo.mis@dealsdray.com");
driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("prexo.mis@dealsdray.com");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Thread.sleep(3000);
WebElement ss = driver.findElement(By.xpath("//div[@class='css-sukebr']"));
ss.click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("(//button[@name='child'])[2]")).click();
driver.manage().window().maximize();
driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();



Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='mui-7']")).sendKeys("C:\\Users\\User\\Downloads\\demo-data.xlsx");
driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();



TakesScreenshot ts=(TakesScreenshot) driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\\\Selenium Softwares\\\\Test\\\\ScreenShots\\\\test2.png");
Files.copy(src, dest);
	}

}
