package net.javaguides.springboot;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import net.javaguides.springboot.controller.EmployeeController;

@SpringBootTest
public class RestTest {
	
	
	@InjectMocks
	private EmployeeController cont;
	
	
	@Test
	public void saveEmployee() throws Exception
	{
		cont.saveEmployee(Mockito.any());
	}
	

}
