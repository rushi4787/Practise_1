package Program_practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeBdtable_handling {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter ("D:\\new work\\Framework\\test-output\\rushisc.html");
		
		reporter.config().setReportName("rushigadilkar");
		reporter.config().setDocumentTitle("RushiReport");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest test= extent.createTest("main test");

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		WebElement salary= driver.findElement(By.xpath("//tbody/tr[6]/td[4]"));
		System.out.println(salary.getText());
		 test.pass("the test is pass");
		JavascriptExecutor  js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", salary);
	  //arguments[0].scrollIntoView(); scrollIntoView()
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(salary));
		Actions act =new Actions(driver);
		act.moveToElement(salary).release().build().perform();
		test.log(Status.PASS, "test is pass");
		
		        
		
		
		
		for (int i=2;i<=7;i++)
			{
			for(int j=1;j<=5;j++)
			{
			WebElement salary1=driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]"));
			
			System.out.print(salary1.getText()+" ");
			}
			System.out.println();
		}
	TakesScreenshot ts= (TakesScreenshot) driver;
	File sorce= ts.getScreenshotAs(OutputType.FILE);
	File dsti= new File("D:\\new work\\Framework\\test-output\\rushisc.png");
	FileUtils.copyFile(sorce, dsti);
		test.log(Status.PASS, "screenshot sucess");
		reporter.flush();
		extent.flush();
		
		
		

	}

}
