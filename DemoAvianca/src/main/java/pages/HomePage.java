package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    private By desdeHomepage = By.xpath("(//input[contains(@class, 'pbOrigen')])[2]");
    private By haciaHomepage = By.xpath("(//input[contains(@class, 'pbDestino')])[2]");
    private By fechaHomepage1 = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[4]" +
            "/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/div/input[1]");
    private By fechaHomepage2 = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]" +
            "/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/table[1]/" +
            "tbody[1]/tr[1]/td[2]/div[3]/table[1]/tbody[1]/tr[3]/td[4]/div[1]");



    public void Findingflights() {

        driver.findElement(desdeHomepage).click();
        driver.findElement(desdeHomepage).sendKeys(desde);
        driver.findElement(haciaHomepage).click();
        driver.findElement(haciaHomepage).sendKeys(hacia);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void FindingDates() {

        driver.findElement(fechaHomepage1).click();
        driver.findElement(fechaHomepage1).sendKeys(fecha1);
        driver.findElement(fechaHomepage2).click();
        driver.findElement(fechaHomepage2).sendKeys(fecha2);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}