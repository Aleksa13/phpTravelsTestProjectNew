package phpTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Aleksandra on 07.01.18.
 */
public class HotelsTest extends BaseTest {
    MainPage firstPage;

        @BeforeMethod(alwaysRun = true)


    public void openMainPage() throws InterruptedException {
            firstPage = new MainPage(driver);
            firstPage.openPage("http://www.phptravels.net/"); }

    @Test
    public void mainPageTest() {

        String url = firstPage.getPageUrl();
        assertEquals(url, "http://www.phptravels.net/", "phpBooking page opened fail"); }


    @Test (dataProvider = "Hotels", dataProviderClass = TestDataProvider.class)
    public void hotelsTest(String name, String checkInDates, String checkOutDates, int childIndex, int index, int stars)throws InterruptedException {

        firstPage
                .selectHotelTitle()
                .enterCity(name)
               .checkInDate(checkInDates);
        Thread.sleep(2000);
              firstPage.checkOutDate(checkOutDates);
        Thread.sleep(2000);



        firstPage.childIndex(childIndex)
                .kidsAge(index)
                .DoneButton();

        Thread.sleep(2000);

        firstPage.SearchButton();

        String url = driver.getCurrentUrl();
        assertTrue(url.contains( "http://www.phptravels.net/properties/search?city="), "phpSearch page opened fail");


         ResultsPage secondPage = new ResultsPage(driver);
         secondPage.FilterButton();
         secondPage.SearchButton();
         secondPage.selectStars(stars);

     }



}

