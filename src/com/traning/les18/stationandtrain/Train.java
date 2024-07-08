package com.traning.les18.stationandtrain;

import java.util.Objects;

public class Train {

	private String destination;
	private int numberOfTrain;
	private String time;
	
	public Train(String destination, int numberOfTrain, String time) {
		this.destination = destination;
		this.numberOfTrain = numberOfTrain;
		this.time = time;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberOfTrain() {
		return numberOfTrain;
	}

	public void setNumberOfTrain(int numberOfTrain) {
		this.numberOfTrain = numberOfTrain;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public void printInfoTrain() {
		System.out.println("Минск - " + destination + " №" + numberOfTrain + " " + time );
	}

	@Override
	public int hashCode() {
		return Objects.hash(destination, numberOfTrain, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(destination, other.destination) && numberOfTrain == other.numberOfTrain
				&& Objects.equals(time, other.time);
	}
	
}

