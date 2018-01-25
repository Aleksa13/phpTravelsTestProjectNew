package phpTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Aleksandra on 08.01.18.
 */
public class ResultsPage extends AbstractWebPage{

    ResultsPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    
    @FindBy(css=".go-right ins")
    List<WebElement> checkboxes;

    @FindBy(css=".go-right label")
    List<WebElement> labels;
    
//    public ResultsPage getArticles(String selector) {
//        List<WebElement> starsResults = driver.findElements(By.cssSelector(selector));
//        return selector;
//    }




    public ResultsPage starsGrade(int index) {
       // driver.findElement(By.cssSelector("#body-section > div.header-mob.mt-25 > div > div > div:nth-child(4) > div > a")).click();
        checkboxes.get(index).click();
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


    public ResultsPage selectPropertyType (PropertyTypes type) {
//    //body
//        int index;
//        switch (type){
//            case Hotel:
//            {
//                index =6;
//               // checkboxes.get(6).click();
//                break;
//            }
//            case Apartment:
//            {
//                index =5;
//                //checkboxes.get(5).click();
//                break;
//            }
//
//            case GuestHouse:
//            {
//                index =7;
////                checkboxes.get(7).click();
//                break;
//            }
//
//            case Motel:
//            {
//                index =8;
////                checkboxes.get(8).click();
//                break;
//            }
//
//            case Residence:
//            {
//                index =9;
////                checkboxes.get(9).click();
//                break;
//            }
//
//            case Resort:
//            {
//                index =10;
////                checkboxes.get(10).click();
//                break;
//            }
//
//            case TimeShare:
//            {
//                index =11;
////                checkboxes.get(11).click();
//                break;
//            }
//
//            case ExtendedStay:
//            {
//                index =12;
////                checkboxes.get(12).click();
//                break;
//            }
//
//            case Villa:
//            {
//                index =13;
////                checkboxes.get(13).click();
//                break;
//            }
//
//
//            default:throw new RuntimeException("Property type is unknown");
//        }

        checkboxes.get(type.getIndex()).click();
        Assert.assertEquals(labels.get(type.getIndex()).getText(), type.getName(), "Labels is incorrect");
        return this;
    }



//    public ResultsPage selectStars(int stars) {
//        driver.findElement(By.id("#\\3"+stars)).click();
//        return this;
//    }


}


