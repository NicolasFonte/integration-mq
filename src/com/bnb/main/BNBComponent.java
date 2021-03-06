package com.bnb.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bnb.integration.Integrator;
import com.bnb.integration.IntegratorConfiguration;

public class BNBComponent {

	public static final Logger logger = Logger.getLogger("com.bnb");

	public static void main(String[] args) {

		Properties prop = new Properties();
		FileInputStream stream = null;
		// load a properties file
		
		try {
			stream = new FileInputStream(
					"configuration.properties");
			prop.load(stream);
		} catch (FileNotFoundException e) {
			logger.log(Level.SEVERE, "Unable to load file", e);
			return;
		} catch (IOException e) {
			logger.log(
					Level.SEVERE,
					"Probleming when reading data from file configuration.properties",
					e);
		}
		
		IntegratorConfiguration configuration = IntegratorConfiguration.getInstance();
		configuration.buildConfigurationFromProperties(prop);
		
		System.out.println(configuration);
		
		Integrator integrator = new Integrator();
		integrator.doIntegration(configuration);
		
		
	}
	
	

}
