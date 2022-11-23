package ru.yandex.praktikum.orderPage;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import ru.yandex.praktikum.basePageTest.BasePageTest;

import static org.junit.Assert.assertEquals;

public class OrderPageTest extends BasePageTest {

    // Тестовые данные  1
    protected String ivanName = "Иван";
    protected String ivanLastName = "Иванов";
    protected String ivanAddress = "г.Москва, Севанская 8, кв 36";
    protected String ivanPhone = "81233455678";
    protected String ivanComment = "Комментарий для курьера";
    //Тестовые данные 2
    protected String victorName = "Виктор";
    protected String victorLastName = "Викторов";
    protected String victorAddress = "г.Москва, Кутузовский 10, кв 36";
    protected String victorPhone = "812000765328";
    protected String victorComment = "Без комментариев";

    // Тест для Chrome клик через по верхней кнопке заказа
    @ParameterizedTest
    @ValueSource()
    public void checkRentOrderChromeOfClickTopButton(By by) {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButton(by);
        orderPage.inputName(ivanName);
        orderPage.inputLastName(ivanLastName);
        orderPage.inputAddress(ivanAddress);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(ivanPhone);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(ivanComment);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

    //   Тест для FireFox клик по верхней кнопке заказа
    @Test
    public void checkRentOrderFireFoxClickTopButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButtonTop();
        orderPage.inputName(victorName);
        orderPage.inputLastName(victorLastName);
        orderPage.inputAddress(victorAddress);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(victorPhone);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(victorComment);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

    //     Тест для Chrome клик через по нижней кнопке заказа
    @Test
    public void checkRentOrderChromeClickBottomButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.scrollToElement(orderPage.bottomOrderButton);
        orderPage.clickOrderButtonBottom();
        orderPage.inputName(ivanName);
        orderPage.inputLastName(ivanLastName);
        orderPage.inputAddress(ivanAddress);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(ivanPhone);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(ivanComment);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

    //    Тест для FireFox  клик через по нижней кнопке заказа
    @Test
    public void checkRentOrderFireFoxClickBottomButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.scrollToElement(orderPage.bottomOrderButton);
        orderPage.clickOrderButtonBottom();
        orderPage.inputName(victorName);
        orderPage.inputLastName(victorLastName);
        orderPage.inputAddress(victorAddress);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(victorPhone);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(victorComment);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }
}