package step;

import com.thoughtworks.gauge.Step;
import methods.Methods;


public class StepImplementation {

    Methods methods;

    public StepImplementation() //constructor
    {
        methods = new Methods();
    }
    
    @Step("<element> kontrol et")
    public void checkElement(String key) {
        methods.checkElementisDisplayed(key);
    }

    @Step("<sec> sn. saniye bekle")
    public void waitSec(int second) {
        methods.waitSec(second);
    }

    @Step("<element> butonuna tikla")
    public void clickToElement(String key) {
        methods.clickElement(key);
    }

    @Step("<element> alanini <input>'la doldur")
    public void clickToElement(String key, String text) {
        methods.sendKeys(key, text);
    }

    @Step("<input> a <inputValue> ara")
    public void sendKeys(String key, String text) {
        methods.sendKeys(key, text);
        methods.sendEnter(key);
    }

    @Step("<liste> icinde <urun> sec")
    public void clickList(String key, String name) {
        methods.clickList(key, name);
    }

    @Step("<fotoMenu> elemani uzerine gel")
    public void hoverElement(String key) {
        methods.hoverElement(key);
    }
}