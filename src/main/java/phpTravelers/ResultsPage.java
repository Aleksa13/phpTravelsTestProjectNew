package phpTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.transform.Result;
import java.util.List;

/**
 * Created by Aleksandra on 08.01.18.
 */
public class ResultsPage extends AbstractWebPage{
    ResultsPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
//    public ResultsPage getArticles(String selector) {
//        List<WebElement> starsResults = driver.findElements(By.cssSelector(selector));
//        return selector;
//    }

    public WebElement SearchButton() {
    driver.findElement(By.cssSelector("#searchform")).click();
    return SearchButton();

    }
    public WebElement FilterButton() {
        driver.findElement(By.cssSelector("#body-section > div.header-mob.mt-25 > div > div > div:nth-child(4) > div > a")).click();
        return FilterButton();
    }

    public ResultsPage selectStars(int stars) {
        driver.findElement(By.id("#\\3"+stars)).click();
        return this;
    }


}


