package com.assignment.question7;

import com.assignment.question7.Radio;
import com.assignment.question7.TV;

class Radio {
	private double frequency = 1.1;

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
}
class TV {
	private int channel = 3;
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
}
public class TestClass {
	public static void reset (TV t) {
		t.setChannel(0);
	}
	public static void reset (Radio r) {
		r.setFrequency(0.0);
	}
	public static void main(String[] args) {
		TV t = new TV();
		Radio r = new Radio();
		reset(t);
		reset(r);
		System.out.println(r.getFrequency());
		System.out.println(t.getChannel());

	}
}
