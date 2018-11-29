package services;

import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

public class WebDriverService {
    private static WebDriver webDriver;

    public static WebDriver getDriver(String Ip, int port) throws IllegalStateException {
        if (webDriver != null) {
            return webDriver;
        } else {
            webDriver = null;
            ChromeOptions options = new ChromeOptions();
            Proxy seleniumProxy = ClientUtil.createSeleniumProxy(new InetSocketAddress(Ip, port));
            options.addArguments("start-maximized", "--ignore-certificate-errors");
            options.setProxy(seleniumProxy).setAcceptInsecureCerts(true);

            String opSystem = System.getProperty("os.name");
            if (opSystem.contains("Mac")) {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            } else if (opSystem.contains("Linux")) {
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver_linux");
            } else if (opSystem.contains("Win")) {
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            } else {
                throw new IllegalStateException("Your system is: " + opSystem + ", no chrome driver for it");
            }
            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            return webDriver;
        }
    }

    public static void remove(){
        webDriver.close();
        webDriver.quit();
        webDriver=null;
    }
}
