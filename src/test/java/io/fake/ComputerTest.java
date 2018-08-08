package io.fake;

import io.fake.pages.ComputersPage;
import org.junit.Test;

import java.util.UUID;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.open;

public class ComputerTest extends BaseTest {

    @Test
    public void createComputer() {
        String name = String.valueOf(UUID.randomUUID());
        String introduceDate = "2017-12-23";
        String discontinuedDate = "2017-12-25";
        String company = "IBM";

        open("/");
        new ComputersPage()
                .addComputer()
                .setComputerName(name)
                .setIntroducedDate(introduceDate)
                .setDiscontinuedDate(discontinuedDate)
                .setCompany(company)
                .saveComputer()
                .searchComputer(name)
                .getComputersTable()
                .findAll("td")
                .shouldHave(texts(name, "23 Dec 2017", "25 Dec 2017", company));
    }
}
