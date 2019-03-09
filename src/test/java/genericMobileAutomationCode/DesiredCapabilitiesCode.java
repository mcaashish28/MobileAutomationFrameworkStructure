package genericMobileAutomationCode;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DesiredCapabilitiesCode {

    public static void main(String[] args) throws MalformedURLException {

        File fs = new File("./src/GenericMobileApp/ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"EmulatorName");
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsoluteFile());

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"),cap);


    }

}
