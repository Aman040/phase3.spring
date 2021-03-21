package com.model;

import org.springframework.stereotype.Component;

@Component(value="sa")
public class SavingAccount implements InterestCalculator {
	private int duration=5;
	private double roi=5.8;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	@Override
	public double calculate(double amount) { 
		
		return amount*roi/duration;
	}

	
}
