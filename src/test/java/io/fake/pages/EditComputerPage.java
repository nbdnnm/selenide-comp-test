package io.fake.pages;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EditComputerPage {

    public EditComputerPage setComputerName(String computerName) {
        $(byId("name")).setValue(computerName);
        return this;
    }

    public EditComputerPage setIntroducedDate(String introducedDate) {
        $(byId("introduced")).setValue(introducedDate);
        return this;
    }

    public EditComputerPage setDiscontinuedDate(String discontinuedDate) {
        $(byId("discontinued")).setValue(discontinuedDate);
        return this;
    }

    public EditComputerPage setCompany(String companyName) {
        $(byId("company")).setValue(companyName);
        return this;
    }

    public ComputersPage saveComputer() {
        $(byXpath("//input[@value='Save this computer']"));
        return new ComputersPage();
    }

    public ComputersPage deleteComputer() {
        $(byXpath("//input[@value='Delete this computer']"));
        return new ComputersPage();
    }
}
