package drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class Chrome  implements WebDriverProvider {
    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
//        System.setProperty("webdriver.gecko.driver","/Users/ilyas/Documents/WebDrivers/geckodriver-v0.19.0");
        Map<String, Object> prefs = new HashMap<>();

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        capabilities.merge(capabilities);
        return new ChromeDriver(options);
    }
}
