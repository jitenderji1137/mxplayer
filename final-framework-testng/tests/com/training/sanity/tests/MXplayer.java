package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.DirecturlPOM;
import com.training.pom.FilterByBhojpuriMoviesPOM;
import com.training.pom.FilterByGeansPOM;
import com.training.pom.FilterByHindiMoviesPOM;
import com.training.pom.FilterByMalayalamMoviesPOM;
import com.training.pom.FilterByTamilMoviesPOM;
import com.training.pom.FilterByTeluguMoviesPOM;
import com.training.pom.HeadingOfSubModulesPOM;
import com.training.pom.MoviesButtonClickPOM;
import com.training.pom.MoviesVisibilityPOM;
import com.training.pom.NewandFreeVisibilityPOM;
import com.training.pom.VisibilityOfAllSubmodulesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MXplayer {

	private WebDriver driver;
	private String baseUrl;
	private MoviesVisibilityPOM moviesVisibilityPOM;
	private MoviesButtonClickPOM moviesButtonClickPOM;
	private NewandFreeVisibilityPOM newandFreeVisibilityPOM;
	private FilterByTeluguMoviesPOM filterByTeluguMoviesPOM;
	private FilterByBhojpuriMoviesPOM filterByBhojpuriMoviesPOM;
	private FilterByMalayalamMoviesPOM filterByMalayalamMoviesPOM;
	private FilterByHindiMoviesPOM filterByHindiMoviesPOM;
	private FilterByTamilMoviesPOM filterByTamilMoviesPOM;
	private VisibilityOfAllSubmodulesPOM visibilityOfAllSubmodulesPOM;
	private HeadingOfSubModulesPOM headingOfSubModulesPOM;
	private FilterByGeansPOM filterByGeansPOM;
	private DirecturlPOM directurlPOM;
	private static Properties properties;
//	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		moviesVisibilityPOM = new MoviesVisibilityPOM(driver);
		moviesButtonClickPOM = new MoviesButtonClickPOM(driver);
		newandFreeVisibilityPOM = new NewandFreeVisibilityPOM(driver);
		filterByTeluguMoviesPOM = new FilterByTeluguMoviesPOM(driver);
		filterByBhojpuriMoviesPOM = new FilterByBhojpuriMoviesPOM(driver);
		filterByMalayalamMoviesPOM = new FilterByMalayalamMoviesPOM(driver);
		filterByHindiMoviesPOM = new FilterByHindiMoviesPOM(driver);
		filterByTamilMoviesPOM = new FilterByTamilMoviesPOM(driver);
		visibilityOfAllSubmodulesPOM = new VisibilityOfAllSubmodulesPOM(driver);
		headingOfSubModulesPOM = new HeadingOfSubModulesPOM(driver);
		filterByGeansPOM = new FilterByGeansPOM(driver);
		directurlPOM = new DirecturlPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void TC_013() {
//		for validation of movies btn in navbar
		moviesVisibilityPOM.validatehomebtn();
	}
	@Test
	public void TC_014() {
//		are we able to click on movies btn
		moviesButtonClickPOM.verifymoviesbtn();
	}
	@Test
	public void TC_015() {
//		To verify if New & Free Option is visible on the Header
		newandFreeVisibilityPOM.validate_new_and_free();
	}
	@Test
	public void TC_216() {
//		Validate on Click Telugu Movies Button redirecting to Telugu Movies page
		filterByTeluguMoviesPOM.Filter_By_Telugu_Movies();
	}
	@Test
	public void TC_217() {
//		Validate on Click Bhojpuri Movies Button redirecting to Bhojpuri Movies page
		filterByBhojpuriMoviesPOM.Filter_By_Bhojpuri_Movies();
	}
	@Test
	public void TC_218() {
//		Validate on Click Malayalam Movies Button redirecting to Malayalam Movies page
		filterByMalayalamMoviesPOM.Filter_By_Malayalam_Movies();
	}
	@Test
	public void TC_219() {
//		Validate on Click Hindi Movies Button redirecting to Hindi Movies page
		filterByHindiMoviesPOM.Filter_By_Hindi_Movies();
	}
	@Test
	public void TC_220() {
//		Validate on Click Tamil Movies Button redirecting to Tamil Movies page
		filterByTamilMoviesPOM.Filter_By_Tamil_Movies();
	}
	@Test
	public void TC_221() {
//		visibility of all submodules in movies like Hindi and so on should be visible
        visibilityOfAllSubmodulesPOM.Visibility_Of_AllSubmodules();
	}
	@Test
	public void TC_222() {
//		all the heading text of submodules should be visible like Teluge movies , Hindi movies etc 
	headingOfSubModulesPOM.Heading_Of_SubModules();
	}
	@Test
	public void TC_223() {
//		After Visiting submodules of movies, on every page we should filter by Genres
	filterByGeansPOM.Filter_By_Geans();
	}
	@Test
	public void TC_224() {
//		After Visiting submodules of movies, on every page we should filter by Genres
	  directurlPOM.DirectURL();
	}
}
