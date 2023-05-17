package form;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.ConfigManager;

public class MoviePage extends Form {
    private static String moviePageLocator = "//span[(text()='"+ ConfigManager.getTestDataProperty("theYearMovieWasReleased") +"')]";
    private IButton movieButton = getElementFactory().getButton(By.xpath("//span[(text()='"+ConfigManager.getTestDataProperty("theYearMovieWasReleased")+"')]"), "Button to find out more information about a movie");
    public MoviePage() {
        super(By.xpath(moviePageLocator), "This page consists of the list of movies");
    }
    public void chooseMovie() {
        movieButton.clickAndWait();
    }
}