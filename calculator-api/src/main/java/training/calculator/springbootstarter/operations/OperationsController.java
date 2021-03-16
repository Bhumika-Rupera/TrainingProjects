package training.calculator.springbootstarter.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {
	
	@Autowired 
	private OperationsService operationsService;
	
	@RequestMapping("/calculator/add/{num1}/{num2}")
	public long addition(@PathVariable long num1, @PathVariable long num2) {
		
		return operationsService.addition(num1, num2);
	}
	
	@RequestMapping("/calculator/substract/{num1}/{num2}")
	public long substraction(@PathVariable long num1, @PathVariable long num2) {
		return operationsService.substraction(num1, num2);
			
		}
	
	@RequestMapping("/calculator/multiply/{num1}/{num2}")
	public long multiplication(@PathVariable long num1, @PathVariable long num2) {
		return operationsService.multiplication(num1, num2);
		
	}
	
	@RequestMapping("/calculator/divide/{num1}/{num2}")
	public long division(@PathVariable long num1, @PathVariable long num2) {
		return operationsService.division(num1, num2);
		
	}
}
