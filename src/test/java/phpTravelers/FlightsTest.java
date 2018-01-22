package phpTravelers;

import javafx.scene.control.Tab;
import javafx.scene.web.WebView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Aleksandra on 07.01.18.
 */
public class FlightsTest extends BaseTest {
    FlightPage flyingPage;

        @BeforeMethod(alwaysRun = true)

        public void openMainPage() throws InterruptedException {
            flyingPage = new FlightPage(driver);
            flyingPage.openPage("http://www.phptravels.net/");

  }

    @Test
    public void mainPageTest() {
        //check that main page is opened

        String url = driver.getCurrentUrl();
        assertEquals(url, "http://www.phptravels.net/", "phpBooking page opened fail");
    }

    @Test
    public void FlightsTest () throws InterruptedException {
        flyingPage.flightTitle();

        Thread.sleep(2000);

        flyingPage.departDates();

        driver.switchTo().activeElement();

        Thread.sleep(2000);

        flyingPage.enterDepartDate();

        //WebElement departDate = driver.findElement(By.cssSelector(".mewtwo-flights-dates .mewtwo-flights-dates-return"));
        //departDate.click();

        flyingPage .returnDates();

        driver.switchTo().activeElement();



        WebElement destinationCity = driver.findElement(By.name("destination_name"));
        destinationCity.click();
        destinationCity.clear();
        destinationCity.sendKeys("New York");

        WebElement originCity = driver.findElement(By.name("origin_name"));
        originCity.click();
        originCity.clear();
        originCity.sendKeys("London");



        WebElement passengers = driver.findElement(By.cssSelector("div.mewtwo-flights-trip_class > div"));
        passengers.click();

        WebElement passengersAge= driver.findElement(By.cssSelector("div:nth-child(2) > div.mewtwo-popup-ages-counter > span.mewtwo-popup-ages-counter__plus"));
        passengers.click();


        WebElement searchButton = driver.findElement(By.cssSelector("div.mewtwo-flights-submit_button > button"));
        searchButton.click();



        Thread.sleep(3000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(3000);


        String url = driver.getCurrentUrl();
        assertTrue(url.contains("http://flights.phptravels.net/"),url);




        //Select departData = new Select(driver.findElement(By.cssSelector("div.mewtwo-flights-dates-depart.mewtwo-flights-dates-depart--focused")));
        //departData.selectByVisibleText("#mewtwo-datepicker-2018-1-10 > div");
    }




}
