/**
 * 
 */
package console.demo_logging.dev;

/**
 * @author ETY3
 *
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import console.demo_logging.dev.service.AppService;

public class App {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implémentation Logback");
		new AppService().executer("valeur 1");
	}
}
