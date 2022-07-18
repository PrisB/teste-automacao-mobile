package runners;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@calculation",
        plugin = {}
)

public class CalculationTest {

    @Test
    public void somaTresValores() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("automationName","automator");
        desiredCapabilities.setCapability("appPackage","com.android.uicalculator2");
        desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        
        AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

        driver.quit();     
        
    }
}