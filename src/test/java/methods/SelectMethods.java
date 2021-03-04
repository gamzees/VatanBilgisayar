package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

    private WebDriver driver;

    public SelectMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void selectByText (String key){
        getSelect().selectByVisibleText(key);
    }

    public void selectByValue (String key){
        getSelect().selectByValue(key);
    }

    public void selectByIndex (int x){
        getSelect().selectByIndex(x);
    }

    public Select getSelect(){
        return new Select((WebElement) driver);
    }
}
