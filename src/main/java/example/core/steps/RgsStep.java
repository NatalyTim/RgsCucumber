package example.core.steps;

import cucumber.api.java.es.E;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import example.core.*;

import java.util.List;

public class RgsStep {
    @Когда("выбираем пунк меню Страхование")
    public static void choseClause() throws Exception {
        new MainPage().next();
    }

    @Когда("выбираем пунк меню Страхование выезжающих за рубеж")
    public static void choseClause2() {
        new RgsMenu().next();
    }

    @Когда("нажимаем рассчитать – Онлайн")
    public static void openForm() throws Exception {
        OnlineCalculate.buttonCalculate = new OnlineCalculate();
        OnlineCalculate.buttonCalculate.next();
    }

    @Тогда("проверяем наличие заголовка")
    public void setComparableElement() throws Exception {
        TravelInsurance.pageObject = new TravelInsurance();
        TravelInsurance.pageObject.setComparableElement();
    }

    @Когда("выбираем количесво поездок")
    public void setNumberOfTrips() throws Exception {
        TravelInsurance.pageObject.setNumberOfTrips();
    }

    @Когда("выбираем направление String \"(.*)\"")
    public void setDirection(String direction) throws Exception {
        TravelInsurance.pageObject.setDirection(direction);
    }

    @Когда("выбираем город String \"(.*)\"")
    public void setCountryList(String countryList) throws Exception {
        TravelInsurance.pageObject.setCountryList(countryList);
    }

    @Когда("выбираем дату первой поездки")
    public void setFirstDate() throws Exception {
        TravelInsurance.pageObject.setFirstDate();
    }

    @Когда("выбираем планируемое количество дней")
    public void setDays() throws Exception {
        TravelInsurance.pageObject.setDays();
    }

    @Когда("выбрать активный спорт")
    public void choseActiveSport() throws Exception {
        TravelInsurance.pageObject.setActiveOrNot();
    }

    @Когда("выбрать активный отдых")
    public void choseActive() throws Exception {
        TravelInsurance.pageObject.setActiveOrNot();
    }

    @Когда("согласиться с обработкой данных")
    public void pushCheckBox() throws Exception {
        TravelInsurance.pageObject.setCheckBox();
    }

    @Дано("^ФИО (.*), дата рождения (.*),последний параметр (.*)")
    public void givenFewArguments(String name, String dateOfBirth, String yesOfNot) throws Exception {
        TravelInsurance.pageObject.setFullName(name);
        TravelInsurance.pageObject.setBirthDay(dateOfBirth);
    }

    @Когда("нажимаем кнопку рассчитать")
    public void pushButton() throws Exception {
        TravelInsurance.pageObject.next();
    }

    @Когда("^проверить данные ФИО (.*)")
    public void checkInformationName(String name) throws Exception {
        CheсkPage.cheсkPage.checkName(name);
    }

    @Когда("^проверить данные дата рождения (.*)")
    public void checkInformationDateOfBirth(String dateOfBirth) throws Exception {
        CheсkPage.cheсkPage.checkBirthDay(dateOfBirth);
    }

    @Когда("^проверить данные активный отдых (.*)")
    public void checkInformationActive(String yesOfNot) throws Exception {
        System.out.println("проверить данные последний параметр ");
        CheсkPage.cheсkPage.checkActivOrNot(yesOfNot);
    }

    @Когда("проверить количество поездок в год")
    public void checkInformationQuantity() throws Exception {
        CheсkPage.cheсkPage = new CheсkPage();
        CheсkPage.cheсkPage.checkElementQuantity();
    }

    @Когда("проверить территорию Шенген")
    public void checkInformationArea() throws Exception {
        CheсkPage.cheсkPage.checkElementArea();
    }

}
