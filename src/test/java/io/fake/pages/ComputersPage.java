package io.fake.pages;

import com.codeborne.selenide.SelenideElement;
import io.fake.pages.elements.NewComputerPage;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ComputersPage {

    public ComputersPage searchComputer(String computerName){
        $(byId("searchbox")).setValue(computerName);
        $(byId("searchsubmit")).click();
        return this;
    }

    public EditComputerPage openComputer(String computerName){
        $(byXpath("//*[text() = '"+computerName+"']")).click();
        return new EditComputerPage();
    }

    public NewComputerPage addComputer(){
        $(byId("add")).click();
        return new NewComputerPage();
    }


    public SelenideElement getComputersTable() {
        return $(byClassName("computers"));
    }


}
