package com.model;

import org.springframework.stereotype.Component;

@Component(value="fa")
public class FixedAccount implements InterestCalculator {
	private int duration=5;
	private double roi=4.8;
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
