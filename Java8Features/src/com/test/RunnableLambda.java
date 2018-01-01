package com.test;


public class RunnableLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			public void run() {
			System.out.println("*****");
				}
			};
			new Thread(r1).start();
	
	
//using Lambda Expression parameter -> expression body			
			
		Runnable r2 = () -> System.out.println("*****");
		new Thread(r2).start();
		
		Vehicle car = new Car();
		int i =0;
		Runnable r3 = () ->{
			process(i);
		System.out.println(car.getVehicleType());
		};
		new Thread(r3).run();
	}
	

	
	
	public static void process(int i){
		System.out.print("test");
	}
	
}

