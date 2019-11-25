package utils;

import java.io.File;

public interface DriverLocations {
	
	static final String GECKODRIVER_PATH = System.getProperty("user.dir") + File.separator + "Resources" + File.separator + "geckodriver.exe";
	static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + File.separator + "Resources" + File.separator + File.separator +"chromedriver.exe";
}
