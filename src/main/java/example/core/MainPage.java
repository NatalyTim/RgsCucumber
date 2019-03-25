package example.core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePageRgs{
    public static MainPage mainPage;

    @FindBy(xpath = "//ol/li/a[contains(text(),'Страхование')]")
    public WebElement openMenu;

//    public BasePageRgs getNext(){
//        System.out.println("2. Выбрать пункт меню - Страховани");
//        clickElement(openMenu);
//        return new RgsMenu();
//    }
public void next(){
    System.out.println("2. Выбрать пункт меню - Страховани");
    clickElement(openMenu);

}

}
