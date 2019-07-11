package selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/*
 * TRACE - 5000 : This log4j level gives more detailed information than the
 * DEBUG level and sits top of the hierarchy after ALL.
 * 
 * DEBUG - 10000 : To debug the application, developers give the priority to
 * debug. Level of message logged will be focused on providing support to an
 * application developer
 * 
 * INFO - 20000 : Provides informational messages that highlight the progress of
 * the application execution.
 * 
 * WARN - 30000 : The messages coming out of this level may not halt the
 * progress of the system, but informs the user something unexpected is
 * happening
 * 
 * ERROR - 40000 : The ERROR level designates error events that might still
 * allow the application to continue running, means a particular part is failing
 * but not a showstopper.
 * 
 * FATAL - 50000 The FATAL level designates very severe error events that will
 * presumably lead the application to abort, means it is a showstopper.
 */
// public class SEL_20_Logging {
// static Logger log = Logger.getLogger(SEL_20_Logging.class.getName());
//
// public static void main(String[] args) {
// // // PropertiesConfigurator is used to configure logger from properties file
// PropertyConfigurator.configure("C:\\My\\users\\eclipse-workspace\\Selenium\\src\\Resource\\log4j.properties");
// System.out.println("Done1");
//
// // WebDriver driver = new ChromeDriver();
// // driver.get("http://demoqa.com/registration/");
// // driver.get("https://materializecss.com/radio-buttons.html");
// //
// driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
// // log the message to file
// log.trace("This is a trace message");
// log.info("This is an info message");
// log.warn("This is an warn message");
// log.error("This is an error message");
// log.fatal("This is an fatal message");
//
// System.out.println("Done");
//
// // driver.quit();
//
// }
// }

// ==========================
public class SEL_20_Logging {
	static Logger log = Logger.getLogger(SEL_20_Logging.class);

	public static void main(String[] args) {
		// PropertiesConfigurator is used to configure logger from properties file
		PropertyConfigurator
				.configure("C:\\My\\users\\eclipse-workspace\\Selenium\\src\\Resource\\log4j-html.properties");

		// log the message to file
		log.trace("This is a trace message");
		log.info("This is an info message");
		log.warn("This is an warn message");
		log.error("This is an error message");
		log.fatal("This is an fatal message");
		System.out.println("Done");
	}
}