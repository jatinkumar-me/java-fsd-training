package com.jatin.project_bean_config2.model;

public class Engine {

	private String type;
	private boolean isRunning;

	public Engine() {
	}

	public Engine(String type, boolean isRunning) {
		this.type = type;
		this.isRunning = isRunning;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
}
