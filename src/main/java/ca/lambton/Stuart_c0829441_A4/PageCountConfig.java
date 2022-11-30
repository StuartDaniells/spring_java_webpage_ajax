/**
 * @author Stuart Daniells - c0829441
 * @date 27th November
 * Assignment 4
 * Controller Config. class that: 
 * 1. Does the Config. & Autowiring for the model - @BEAN annotation
 * 2. Then injects the instantiated class (our model/data) into the controller.
 * 3. So control is passed to the spring framework, instead of config. done by controller class
 */

package ca.lambton.Stuart_c0829441_A4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageCountConfig {
	
	@Bean							// instantiates the PageCounter class and injects the obj. when autowiring is done
	public PageCounter getPageCounterObj() {
		return new PageCounter();
	}
}
