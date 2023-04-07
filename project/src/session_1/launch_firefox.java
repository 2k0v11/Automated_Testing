package session_1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\kavya\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver");
       FirefoxDriver drive=new FirefoxDriver();
       drive.get("https://www.mozilla.org/");
       drive.close();
       
	}

}
