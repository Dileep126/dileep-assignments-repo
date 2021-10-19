package com.sapient.trg.pl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author Admin
 * short-cut keys:  control / : block comment
 * control shift o  : import
 */
class AppTest {
	private App app=null;

//	@BeforeAll static void setUpBeforeClass() throws Exception {
//		System.out.println("Before all test methods"); 
//	}
//
//	@AfterAll static void tearDownAfterClass() throws Exception {
//		System.out.println("After all test methods"); 
//	}


	@BeforeEach
	void setUp() throws Exception {
//		System.out.println("Before each test method");
		app=new App();
		
	}

	@AfterEach
	void tearDown() throws Exception {
//		System.out.println("After each test method");
		app=null;
	}

	@Test
	void testSquareForSuccess() {
//		System.out.println("test method: square()");
//		fail("Not yet implemented");		
		assertEquals(25,app.square(5));
	}
	
	@Test
	void testSquareForFailure() {
		assertNotEquals(20,app.square(5));
	}

	@Test
	void testCubeForSuccess() {
//		System.out.println("test method: cube()");
//		fail("Not yet implemented");
		assertEquals(125,App.cube(5));
	}
	
	@Test
	void testCubeForFailure() {
//		System.out.println("test method: cube()");
//		fail("Not yet implemented");
		assertNotEquals(25, App.cube(5));
	}

}
