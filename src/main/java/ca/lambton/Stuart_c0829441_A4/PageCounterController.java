/**
 * @author Stuart Daniells - c0829441
 * @date 27th November
 * Assignment 4
 * Rest Controller class
 * To display the page count when "localhost:8080/currentcount" is requested
 */

package ca.lambton.Stuart_c0829441_A4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageCounterController {
	
	@Autowired					// the object is not instantiated here, uses the concept of dependency injection and IOC
	private PageCounter pgCount;		// lets the spring framework inject the instantiated obj. into the controller class
												
	
	@GetMapping("/currentcount")
	public Integer getCurrPageCount() {
		return pgCount.getPageCount();
	}
}
