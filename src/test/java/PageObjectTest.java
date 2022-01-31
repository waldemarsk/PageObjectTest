import org.junit.Test;
import pages.GaragePage;
import pages.HomePage;

public class PageObjectTest {

    @Test
    public void canLogin() {
        HomePage homePage = new HomePage();

        GaragePage garagePage = homePage.login("cowboywolf1@gmail.com", "Qwerty123");

        garagePage.notifications.shouldHaveText("You have been successfully logged in");
    }

    @Test
    public void canAddCar() {
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("cowboywolf1@gmail.com", "Qwerty123");

        garagePage.addCar("123645");

        garagePage.notifications.shouldHaveText("Car added");
    }

    @Test
    public void canLogoutViaHeader(){
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("cowboywolf1@gmail.com", "Qwerty123");

        garagePage.logoutHeader();

        garagePage.notifications.shouldHaveString("Do more!");
    }

    @Test
    public void canLogoutViaSideMenu(){
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("cowboywolf1@gmail.com", "Qwerty123");

        garagePage.logoutSidebar();

        garagePage.notifications.shouldHaveString("Do more!");
    }
}
