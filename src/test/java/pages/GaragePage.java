package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class GaragePage extends BasePage {
    SelenideElement addCarBtn = Selenide.$x("//*[text()='Add car']");
    SelenideElement carBrand = Selenide.$x("//*[text()='Ford']");
    SelenideElement carModel = Selenide.$x("//*[text()='Focus']");
    SelenideElement carMileage = Selenide.$("#addCarMileage");
    SelenideElement addCarSubmit = Selenide.$x("//button[text()='Add']");

    SelenideElement myProfile = Selenide.$("#userNavDropdown");
    SelenideElement logoutMyProfile = Selenide.$x("//button[text()='Logout']");

    SelenideElement logoutSidebarBtn = Selenide.$x("//a[text()=' Log out ']");


    public GaragePage addCar(String mileage) {
        addCarBtn.click();
        carBrand.click();
        carModel.click();
        carMileage.sendKeys(mileage);
        addCarSubmit.click();
        return this;
    }

    public GaragePage logoutHeader() {
        myProfile.click();
        logoutMyProfile.click();
        return new GaragePage();
    }

    public GaragePage logoutSidebar() {
        logoutSidebarBtn.click();
        return new GaragePage();
    }
}
