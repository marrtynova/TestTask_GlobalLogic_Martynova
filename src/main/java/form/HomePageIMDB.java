package form;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HomePageIMDB extends Form {
    private static String homeProjectPageLocator = "//nav[@id=\"imdbHeader\"]";
    private ITextBox textBoxSearch = getElementFactory().getTextBox(By.xpath("//input[@id=\"suggestion-search\"]"), "Text box to look for a movie");
    private IButton buttonSearch = getElementFactory().getButton(By.xpath("//button[@id=\"suggestion-search-button\"]"), "The button to look for a movie");
    public HomePageIMDB() {
        super(By.xpath(homeProjectPageLocator), "Home page IMDB");
    }
    public void enterMovieTitle(String projectName) {
        textBoxSearch.type(projectName);
    }
    public void searchMovie() {
        buttonSearch.clickAndWait();
    }
}
