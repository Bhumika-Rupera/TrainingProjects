package training.calculator.springbootstarter.operations;

import org.springframework.stereotype.Service;

//import java.util.Scanner;

@Service
public class OperationsService {
	
	public long addition(long a, long b) {
		return a+b;
	}
	
	public long substraction(long a, long b) {
		return a-b;
			
		}
	
	public long multiplication(long a, long b) {
		return a*b;
		
	}
	
	public long division(long a, long b) {
		try {
			return a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		return -999999999;
		
	}

}
