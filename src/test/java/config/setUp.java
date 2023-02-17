package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setUp {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected static int duration = 30;
    protected static Boolean isHeadless = false;

    protected static String WebURL = "https://staging.cicle.app/";

}