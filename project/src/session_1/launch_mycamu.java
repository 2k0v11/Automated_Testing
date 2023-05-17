package session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launch_mycamu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
       ChromeOptions op=new ChromeOptions();
       op.addArguments("--remote-allow-origins=*");
       ChromeDriver d=new ChromeDriver(op);
       d.get("https://www.mycamu.co.in/#/?id=62661c40e51b080604ed30d7");
       d.manage().window().maximize();
       d.findElement(By.id("username")).sendKeys("your_email");
       Thread.sleep(3000);
       d.findElement(By.id("password")).sendKeys("your_password");
       Thread.sleep(3000);
       d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div[3]/div[2]/form/div[3]/button[1]")).click();
       Thread.sleep(1000);
       d.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div/div[2]/ul/li[3]/ul/div[2]/span[2]/button")).click();
       Thread.sleep(1000);
       d.close();
	}

}
