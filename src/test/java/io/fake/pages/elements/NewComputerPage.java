package io.fake.pages.elements;

import io.fake.pages.ComputersPage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class NewComputerPage {

    public NewComputerPage setComputerName(String computerName) {
        $(byId("name")).setValue(computerName);
        return this;
    }

    public NewComputerPage setIntroducedDate(String introducedDate) {
        $(byId("introduced")).setValue(introducedDate);
        return this;
    }

    public NewComputerPage setDiscontinuedDate(String discontinuedDate) {
        $(byId("discontinued")).setValue(discontinuedDate);
        return this;
    }

    public NewComputerPage setCompany(String companyName) {
        $(byId("company")).selectOptionContainingText(companyName);
        return this;
    }

    public ComputersPage saveComputer() {
        $(byXpath("//input[@value='Create this computer']")).click();
        return new ComputersPage();
    }

}
