package in.nit.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Test Case : A class that will test our code

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Testing TestEmployee Task")
public class TestEmployee {
	
	//test methods
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("From Onetime SetUp");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("From Setup");
	}
	
	@Test
	@Order(1)
	@DisplayName("Testing save method")
	public void testSave() {
		System.out.println("Hello-Save");
		
	}
	@Test
	@Order(10)
	@DisplayName("Testing update method")
	public void testUpate() {
		System.out.println("Hello-Update");
		
	}
	@Test
	@Order(20)
	@DisplayName("Testing delete method")
	public void testDelete() {
		System.out.println("Hello-Delete");
		
	}
	
	@AfterEach
	public void clear() {
		System.out.println("From Clear");
		
	}
	
	@AfterAll
	public static void closeAll() {
		System.out.println("ONCE AT END");
	}
	
	

}
