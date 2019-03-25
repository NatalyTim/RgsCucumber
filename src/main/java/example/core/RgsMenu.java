package example.core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RgsMenu extends BasePageRgs{
    public static RgsMenu rgsMenu;

    @FindBy(xpath = "//a[contains(text(),'Выезжающим за рубеж')]")
    public WebElement insuranceCategory;

//    public BasePageRgs getNext(){
//        System.out.println("3. Путешествия – Страхование выезжающих за рубеж");
//        clickElement(insuranceCategory);
//        return new OnlineCalculate();
//    }
public void next(){
        System.out.println("3. Путешествия – Страхование выезжающих за рубеж");
        clickElement(insuranceCategory);

    }

}
