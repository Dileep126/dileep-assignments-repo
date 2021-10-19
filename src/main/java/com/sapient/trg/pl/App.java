package com.sapient.trg.pl;

/**
 *  doc-style commenting
 * @author Srini
 * This class demonstrates difference between instance method and
 * static methods.
 * 
 * Creating instance of a class using default constructor
 * ClassName objectName= new ClassName();
 * 
 * There is root class called, Object where all classes implicitly extend Object class. So
 * all the methods of Object class are inherited into the child classes.
 * 
 * Every class is a child class of Object class.
 */


public class App {

	/* Multi-line comment
	 * 
	 * The following methods explain about instance and 
	 * static methods 
	 */
	//Single-line comment
	//instance method, invoking instance method: objectName.instanceMethod()
	public int square(int n){
		return n*n;
	}

	//static method, invoking static method: ClassName.staticMethod()
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String []args) {
		//returns cube of a number
		System.out.println("Cube of 5 is "+ App.cube(5));
		App app= new App();
		System.out.println("Square of  5 is " + app.square(5));

	}


}
