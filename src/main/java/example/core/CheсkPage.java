package example.core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheсkPage extends BasePageRgs {
    public static  CheсkPage cheсkPage;

    //Проверить значения"
    @FindBy(xpath = "//span[contains(@class,'summary-value')][@data-bind='with: Trips']/span[@class='text-bold']")
    public WebElement comparableElementTrips;
    @FindBy(xpath = "//span/span[contains(@data-bind,'foreach: countries')]/strong")
    public WebElement comparableElementDirection;
    @FindBy(xpath = "//strong[contains(@data-bind,'LastName')]")
    public WebElement comparableElementFullName;
    @FindBy(xpath = "//strong[contains(@data-bind,' text: BirthDay.')]")
    public WebElement comparableElementBirthDay;
    @FindBy(xpath = "//div[contains(@data-bind, 'SelectedProgram.Options')]" +
            "/div[contains(@data-bind, 'Активный')]/div[@class='summary-row']/span[@class='summary-value']/span")
    public WebElement comparableElementActiveOrNot;

    public void checkElementQuantity() throws Exception {
        System.out.println("16.Проверить значения:");
        System.out.println("16.1 Многократные поездки в течение года");
        compareText(comparableElementTrips, "Многократные поездки в течение года");
    }

    public void checkElementArea() throws Exception {
         System.out.println("16.2 Территория – Шенген");
        compareText(comparableElementDirection, "Шенген");


    }

    public void checkName(String name) throws Exception{
        System.out.println("16.3 Застрахованный");
        compareText(comparableElementFullName, name);
    }

    public void checkBirthDay(String birthDay) throws Exception{
        System.out.println("16.4 Дата рождения");
        compareText(comparableElementBirthDay, birthDay);
    }

    public void checkActivOrNot(String active) throws Exception{
        System.out.println("16.5 Вид отдыха - активный");
        if("true".equalsIgnoreCase(active))
            compareText(comparableElementActiveOrNot, "Активный");
    }

@Override
public void next() { };

}
