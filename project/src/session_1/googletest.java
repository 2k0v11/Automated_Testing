package session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletest {
ChromeDriver d;
@BeforeMethod
void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
    ChromeOptions op=new ChromeOptions();
    op.addArguments("--remote-allow-origins=*");
    ChromeDriver d=new ChromeDriver(op);
    d.get("https://www.google.com/");
    
}
@Test
void googletitletest() throws InterruptedException {
	System.out.print(d.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")));
	Thread.sleep(1000);
}
@Test
void googletexttest() throws InterruptedException {
	System.out.print(d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")));
	Thread.sleep(1000);
}
@Test
void linktest() {
	System.out.print(d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")));
}
@AfterMethod
void close() {
	d.close();
}
}
