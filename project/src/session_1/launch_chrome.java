package session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launch_chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
       ChromeOptions op=new ChromeOptions();
       op.addArguments("--remote-allow-origins=*");
       ChromeDriver d=new ChromeDriver(op);
       d.get("https://www.google.com/");
       d.manage().window().maximize();
       String url=d.getCurrentUrl();
       System.out.print("URL:"+url);
       String title=d.getTitle();
       System.out.print("\nTitle:"+title);
       WebElement link=d.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));
       String name=link.getText();
       System.out.print("\nText:"+name);
       String tag=link.getTagName();
       System.out.print("\nTag:"+tag);
       String value=link.getAttribute("class");
       System.out.print("\nValue:"+value+"\n");
       /*WebElement name=d.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));*/
       Thread.sleep(1000);
       d.close();
	}

}
