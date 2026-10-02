import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownTest extends BaseTest {

    @ParameterizedTest(name = "select {0}")
    @CsvSource({
            "Option 1, 1",
            "Option 2, 2"
    })
    void userCanSelectDropdownOption(String optionText, String expectedValue) {

        DropdownPage dropdownPage = new DropdownPage(driver);

        dropdownPage.open();

        dropdownPage.selectByVisibleText(optionText);

        assertEquals(optionText, dropdownPage.getSelectedText());
        assertEquals(expectedValue, dropdownPage.getSelectedValue());
    }
}
