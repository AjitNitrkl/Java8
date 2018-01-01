package com.funinterface;

@FunctionalInterface//not mandatory
 interface MyFirstFunctionalInterface {
	
	double convert(double input);
    //public String firstWork(); //only 1 abstract method
   // public void secondWork(); //cannot since only 1 SAM
    default public void secondWork() {
    	//default method can be added to functional interface
    };
    
    @Override
    public String toString(); //we are overriding the tostring of object class allowed
    // overriding one of the public methods of java.lang.Object, that also does not count toward the interface’s abstract method count since any implementation 
    //of the interface will have an implementation from java.lang.Object or elsewhere
}

public class FunIntTest {
	public static void main(String ar[]) {
		
		MyFirstFunctionalInterface fInt = (input) -> {
			System.out.println(input*5);
			return input;
		};
		
		fInt.convert(2);
	}

	
	
	
}
