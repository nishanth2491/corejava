package com.tns.inheritance1;

public class Tata extends car {
	private String modelName;
	//default constructor
	public Tata() {
		super();
	}
// parameterised constructor
	public Tata (String modelName) {
		super();
		this.modelName = modelName;
	}
	

	// set getters and setters
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		
	}
	// to string  function
	@Override
	public String toString() {
		return "Tata [modelName=" + modelName + "]";
	}
	
	




}
