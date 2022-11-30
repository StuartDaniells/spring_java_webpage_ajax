/**
 * @author Stuart Daniells - c0829441
 * @date 27th November
 * Assignment 4
 * Controller class that: 
 * 1. Does the Autowiring for the model
 * 2. Then injects the instantiated class (our model/data) into the controller, 
 * 3. so control is passed to the spring framework, instead of config. done by controller class
 * 3. Renders the welcome.html view
 */


package ca.lambton.Stuart_c0829441_A4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	/* the object is not instantiated here, uses the concept of dependency injection and IOC */
	@Autowired			
	private PageCounter pgCount;		// lets the spring framework inject the instantiated obj. into the WelcomeController class
	
	@GetMapping("/")
	public String getWelcomePage(Model model) {						// injects the Model
		pgCount.incrementPageCount();								//increments page count when page render/refreshes
		return "welcome";											// returns the view "welcome.html" template
		
	}
}

// Using Thymeleaf to pass variable values to the view, use:
// model.addAttribute("visitorCount", pgCount.getPageCount());