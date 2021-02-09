package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenMenu {

    private WebDriver driver;

    private By ThreeLines = By.className("icon-menu");
    private By flightSchedules = By.className("line-link-right");

    public OpenMenu(WebDriver driver){

        this.driver = driver;
    }

    public void clickonthreelines(){
        driver.findElement(ThreeLines).click();
    }

    public void clickOnflightSchedules(){

        driver.findElement(flightSchedules).click();

    }


}
