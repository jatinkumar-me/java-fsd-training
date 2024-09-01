package com.jatin.project_bean_config2.model;

public class Car {

	private String carName;
	private Engine engine;

	public Car() {
	}

	public Car(String carName, Engine engine) {
		this.carName = carName;
		this.engine = engine;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
