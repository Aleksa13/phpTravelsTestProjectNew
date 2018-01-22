package phpTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Aleksandra on 08.01.18.
 */
public class FlightPage extends AbstractWebPage{
    FlightPage(WebDriver driver) {
            super(driver);
            this.driver=driver;
    }

    public FlightPage flightTitle() {
        driver.findElement(By.cssSelector("[href*='#TRAVELPAYOUTS']")).click();
        return this;
    }


    public FlightPage departDates() {
        driver.findElement(By.cssSelector(".mewtwo-flights-dates .mewtwo-flights-dates-depart")).click();
        return this;
    }

    public FlightPage enterDepartDate() {
        driver.findElement(By.id("mewtwo-datepicker-2018-1-23")).click();
        return this;
    }


    public FlightPage returnDates() {

           driver.findElement(By.id("mewtwo-datepicker-2018-1-27")).click();
           return this;
        }


    }



