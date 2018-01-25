package phpTravelers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by aleksandra on 1/8/18.
 */
public abstract class AbstractWebPage {
    protected WebDriver driver;
    AbstractWebPage (WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }
    public void openPage(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);

    }
}
