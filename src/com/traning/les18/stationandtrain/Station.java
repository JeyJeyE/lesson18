package com.traning.les18.stationandtrain;

import java.util.List;
import java.util.Objects;

public class Station {
	
	private List<Train> tr;

    public Station(List<Train> tr) {
        this.tr = tr;
    }

	public List<Train> getTr() {
		return tr;
	}

	public void setTr(List<Train> tr) {
		this.tr = tr;
	}
	public void addTrain(Train train) {
		tr.add(train);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Station other = (Station) obj;
		return Objects.equals(tr, other.tr);
	}

	
}


