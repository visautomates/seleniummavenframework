package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReade extends BaseClass {

	public static Properties properties;

	public final String propertyFilePath = "C://Users//Vishnu//eclipse-workspace//selenium//config//congif.properties";

	public ConfigurationReade() {

		try {
			FileInputStream ip = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}

	}

	public String getdriverpath() {

		String Driverpath = properties.getProperty("Driverpath");

		if (Driverpath != null) {
			return Driverpath;
		} else
			throw new RuntimeException("Driverpath not configured" );

	}

	public String getherourl() {

		String herourl = properties.getProperty("herourl");
		if (herourl != null) {
			return herourl;
		} else
			throw new RuntimeException("url not configured");

	}

	public String getAmazon() {
		String amazon = properties.getProperty("Amazon");
				if (amazon != null) {
					return amazon;
				} else
					throw new RuntimeException("amazon url not configured");
	
	}

}
