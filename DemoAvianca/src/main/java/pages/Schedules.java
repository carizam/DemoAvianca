package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Schedules {

    private WebDriver driver;

    private By from = By.id("origenIter");
    private By to = By.id("destinoIter");
    private By departure = By.id("fechaIdaIter");
    private By returndate = By.id("fechaRegresoIter");
    private By query = By.id("mainContent_Ir");

    public Schedules(WebDriver driver){

        this.driver = driver;
    }

    public void clickfrom (){

        driver.findElement(from).click();

    }

    public void clickto (){

        driver.findElement(to).click();

    }

    public void clickdeparture(){

        driver.findElement(departure).click();

    }

    public void clickreturndate(){

        driver.findElement(returndate).click();

    }

    public void IntrofromSchedule(String bogota){

        driver.findElement(from).sendKeys(bogota);
    }

    public void Introdeparture(String cartagena){

        driver.findElement(from).sendKeys(cartagena);
    }

    public void checkFlights() {
        driver.findElement(query).click();
    }
}
