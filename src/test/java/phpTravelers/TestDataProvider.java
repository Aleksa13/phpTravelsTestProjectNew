package phpTravelers;

import org.testng.annotations.DataProvider;

/**
 * Created by Aleksandra on 06.01.18.
 */
public class TestDataProvider {


    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {

        return new Object[][]{
                {"demo@phptravels.com", "demoadmin"},
                {"admin@phptravels.com", "demoaasfdmin"}};

    }

    @DataProvider(name = "Login")
    public static Object[][] goodCredentials() {

        return new Object[][]{
                {"admin@phptravels.com", "demoadmin"}};

    }

    @DataProvider(name = "Hotels")
    public static Object[][] hotels() {

        return new Object[][]{
                {"Dubai"},//"01/31/2018","02/02/2018",1,2,1},
                {"New York"},//"03/24/2018","04/13/2018",// 1,3,2},
                {"Riga"}};//"06/23/2018","08/10/2018",2,5,3}


//        @DataProvider(name = "Results")
//        public static Object[][] results() {
//
//            return new Object[][]{
//                    {"#\\35"}, {"#\\34"}, {"#\\33"}};
//        }


    }
}
