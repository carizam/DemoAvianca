package tests;

import base.BaseTests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsAvianca extends BaseTests {

    @Test
    public void testReservaexitosa (){

        homePage.Findingflights();
        homePage.FindingDates();
        String title = driver.getTitle();
        Assert.assertEquals(title, "¡Información importante!");

    }

    @Test
    public void testOrganize (){
        openMenu.clickonthreelines();
        openMenu.clickOnflightSchedules();
        schedules.clickfrom();
        schedules.IntrofromSchedule("Bogota");
        schedules.clickto();
        schedules.Introdeparture("Cartagena");
        schedules.clickdeparture();
        //seleccionar fecha
        schedules.clickreturndate();
        //seleccionar fecha
        schedules.checkFlights();


    }
}
