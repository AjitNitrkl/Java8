package com.test;

public interface Vehicle {

	public String getVehicleType();
	public String getVehicleBrand();
	default  String getSingleEngineType() {
		return "SingleEngineCylinder";
	}
}
