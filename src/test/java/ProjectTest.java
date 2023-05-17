import aquality.selenium.core.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import form.HomePageIMDB;
import form.MoviePage;
import form.RightMovie;
import utils.ConfigManager;

public class ProjectTest extends BaseTest {
    HomePageIMDB homePageIMDB = new HomePageIMDB();
    private String homePageUrl=ConfigManager.getConfigurationProperty("homePageIMDBurl");
    MoviePage moviePage = new MoviePage();
    RightMovie rightMovie = new RightMovie();

    @Test
    public void checkMovieDescription() {

        Logger.getInstance().info("Home page IMDB is opening");
        browser.goTo(homePageUrl);
        browser.waitForPageToLoad();
        Assert.assertTrue(homePageIMDB.state().isDisplayed(), "Home page isn't displayed");

        Logger.getInstance().info("Enter project name");
        homePageIMDB.enterMovieTitle(ConfigManager.getTestDataProperty("movieTitleToFind"));
        homePageIMDB.searchMovie();
        Assert.assertTrue(moviePage.state().isDisplayed(), "Movie page isn't open");

        moviePage.chooseMovie();
        Assert.assertTrue(rightMovie.state().isDisplayed(), "The movie page isn't open");
        Assert.assertTrue(rightMovie.isMovieYearLocated(), "The year of the movie is wrong");
        Assert.assertTrue(rightMovie.checkMovieDescription(), "The description of the movie isn't the same");
    }
}

