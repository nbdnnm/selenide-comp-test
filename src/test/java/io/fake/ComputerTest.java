package io.fake;

import com.codeborne.selenide.Condition;
import io.fake.pages.ComputersPage;
import org.junit.Test;

import java.util.UUID;

import static com.codeborne.selenide.Selenide.open;

public class ComputerTest extends BaseTest {


    @Test
    public void createComputer() {
        String name = String.valueOf(UUID.randomUUID());
        open("/");
        new ComputersPage()
                .addComputer()
                .setComputerName(name)
                .setIntroducedDate("2017-12-23")
                .setDiscontinuedDate("2017-12-25")
                .setCompany("IBM")
                .saveComputer()
                .searchComputer(name)
                .getComputersTable()
                .shouldHave(Condition.text(name)).screenshot();
    }

}
