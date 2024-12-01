import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTestWithEnter() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("ru.selenide.org"));
    }

    @Test
    void successfulSearchTestWithClickSearch() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide");
        $("[name=btnK]").click();
        $("[id=search]").shouldHave(text("ru.selenide.org"));
    }
}
