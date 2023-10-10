package com.tns.inheritance1;

public class Harrier extends Tata{
	private long maxspeed;
	// default constructor
	public Harrier() {
		super();
	}
	// parameterised constructor

	public Harrier(long maxspeed) {
		super();
		this.maxspeed = maxspeed;
	}


	// set getters and setters

	public long getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(long maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	

	public Harrier(String modelName) {
		super(modelName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Harrier [maxspeed=" + maxspeed + "]";
	}

	

	
	}
