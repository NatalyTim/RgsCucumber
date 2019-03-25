package example.core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineCalculate extends BasePageRgs {
    public  static OnlineCalculate buttonCalculate;
    @FindBy(xpath = "//*[contains(text(),'Рассчитать')][contains(@class,'btn-attention')]")
    public WebElement onlineCalculate;

//    public BasePageRgs getNext() throws Exception {
//        System.out.println("4. Нажать рассчитать – Онлайн");
//        scrollToAndClickElement(onlineCalculate);
//        return new TravelInsurance();
//    }
public void next() throws Exception {
    System.out.println("4. Нажать рассчитать – Онлайн");
    scrollToAndClickElement(onlineCalculate);

}
}
