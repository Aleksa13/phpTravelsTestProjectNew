package phpTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Aleksandra on 07.01.18.
 */
public class MainPage extends AbstractWebPage{

    //@FindBy(name = "cityName")
    //WebElement enterCity;

    MainPage(WebDriver driver) {
        super(driver);
        this.driver=driver;}


    public MainPage selectHotelTitle() {
        driver.findElement(By.cssSelector("[href*='#HOTELS")).click();
        return this;
    }


    public MainPage enterCity(String name) {

            WebElement enterCity = driver.findElement(By.cssSelector("#s2id_autogen10"));
            enterCity.click();
            //driver.switchTo().activeElement();
            //driver.findElement(By.cssSelector("#select2-drop-mask"));
            //driver.findElement(By.cssSelector("#select2-drop")).click();

            //enterCity.click();
            // enterCity.clear();
            enterCity.sendKeys(name);

            driver.switchTo().activeElement();
            driver.findElement(By.cssSelector("#eac-container-citiesInput"));
            driver.findElement(By.cssSelector("#eac-container-citiesInput > ul > li:nth-child(1) > div")).click();
        driver.switchTo().activeElement();
            return this;
    }


    public MainPage checkInDate(String checkInDates) {
        WebElement checkInDate = driver.findElement(By.cssSelector("#dpean1 > input"));
        checkInDate.click();
        checkInDate.clear();
        driver.switchTo().activeElement();
        WebElement enterDate = driver.findElement(By.cssSelector("body > div:nth-child(19)")); //+ date));
        enterDate.click();
        driver.switchTo().activeElement();
        checkInDate.sendKeys(checkInDates);
        return this;
    }


    public MainPage checkOutDate(String checkOutDates) {
        WebElement checkOutDate = driver.findElement(By.cssSelector("dpd2 > input"));
        checkOutDate.click();
        checkOutDate.clear();
        driver.switchTo().activeElement();
        checkOutDate.sendKeys(checkOutDates);
        driver.switchTo().activeElement();
        return this; }

    public MainPage SearchButton() {
        driver.findElement(By.cssSelector("div.bgfade.col-md-4.col-xs-12 > button")).click();
        return this;
    }

    public MainPage DoneButton() {
        driver.findElement(By.cssSelector("#ages > div > div > div.modal-footer > button")).click();
        return this;
    }

    public MainPage kidsAge(int index) {
        Select kidsAge = new Select(driver.findElement(By.cssSelector("div.modal-body > div > div > select")));
        kidsAge.selectByIndex(index);
        return this;
    }

    public MainPage  childIndex(int childIndex) {
        Select childCount =new Select(driver.findElement(By.id("child")));
        childCount.selectByIndex(childIndex);
        return this;
    }

}



