package phpTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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




    public ResultsPage starsGrade(int index) {
       // driver.findElement(By.cssSelector("#body-section > div.header-mob.mt-25 > div > div > div:nth-child(4) > div > a")).click();
        driver.findElements(By.cssSelector(".go-right ins")).get(index).click();
        //driver.findElement(By.id("#34")).click();
        return this;
    }

    public ResultsPage SearchButton() {
        driver.findElement(By.id("searchform")).click();
        return this;
    }

public List<WebElement>  getSearchResults(){
        return driver.findElements(By.cssSelector( "div.itemscontainer > table > tbody > tr"));
}

public int getStarsCount(WebElement result){
    return result.findElements(By.cssSelector("i.icon-star-5")).size();

    }



//    public ResultsPage selectStars(int stars) {
//        driver.findElement(By.id("#\\3"+stars)).click();
//        return this;
//    }


}


