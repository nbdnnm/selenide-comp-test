package io.fake;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;

public abstract class BaseTest {

    @BeforeClass
    public static void setupClass() {
        Configuration.baseUrl = "http://computer-database.gatling.io";
        Configuration.screenshots = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
