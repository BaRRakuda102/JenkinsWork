import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import helpers.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;


public class CitilinkTest extends BaseTest {

    @Test
    @DisplayName("Search By Word")
    public void citilinkSearch() {
        Selenide.open("https://www.citilink.ru/");
        $(".MainHeader__actions-block [type=search]").click();
        $(".MainHeader__actions-block [type=search]").setValue("ноутбук").pressEnter();

        $(".Subcategory__title-container").shouldHave(Condition.text("Ноутбуки"));

    }
}
