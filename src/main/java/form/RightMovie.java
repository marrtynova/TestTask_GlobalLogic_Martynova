package form;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.ConfigManager;

public class RightMovie extends Form {
    private static String rightMovieLocator = "//span[(text()='"+ConfigManager.getTestDataProperty("movieTitleToFind")+"')]";
    private IButton movieYear = getElementFactory().getButton(By.xpath("//a[(text()='"+ConfigManager.getTestDataProperty("theYearMovieWasReleased")+"')]"), "The year when a movie was released");
    private ILabel movieDescription = getElementFactory().getLabel(By.xpath("//p[@data-testid=\"plot\"]"), "The description of a movie");
    public RightMovie() {
        super(By.xpath(rightMovieLocator), "The page has necessary information about the movie");
    }
    public boolean isMovieYearLocated() {
        return movieYear.state().isDisplayed();
    }
    public boolean checkMovieDescription() {
        return movieDescription.getText().contains(ConfigManager.getTestDataProperty("movieDescription"));
    }
}

