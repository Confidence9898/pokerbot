package pokerbot;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		File f= new File("src");
		File fs = new File(f, "JYou Poker.apk");
		
	DesiredCapabilities cap = new  DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyEmulator");
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	
		
		
	}

}
