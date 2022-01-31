package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {
    SelenideElement signInBtn = $(".header_signin");
    SelenideElement emailInput = $("#signinEmail");
    SelenideElement passwordInput =  $("#signinPassword");
    SelenideElement loginBtn =  $x("//*[text()='Login']");

    public HomePage(){
        open(
                "https://qauto.forstudy.space/",
                "",
                "guest",
                "welcome2qauto"
        );
    }

    public GaragePage login(String email, String password) {
        signInBtn.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginBtn.click();
        return new GaragePage();
    }
}
