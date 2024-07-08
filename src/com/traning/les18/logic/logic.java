package com.traning.les18.logic;

import java.util.List;

import com.traning.les18.stationandtrain.Train;

public class logic {

	
	public static void sortOfNumber(List<Train> tr) {
        for (int i = 0; i < tr.size() - 1; i++) {
            for (int j = i + 1; j < tr.size(); j++) {
                if (tr.get(i).getNumberOfTrain() > tr.get(j).getNumberOfTrain()) {
                    Train temp = tr.get(i);
                    tr.set(i, tr.get(j));
                    tr.set(j, temp);
                }
            }
        }
    }

    public static void printTrainInfoByNumber(List<Train> tr, int trainNumber) {
        for (Train train : tr) {
            if (train.getNumberOfTrain() == trainNumber) {
                train.printInfoTrain();
                return;
            }
        }
        System.out.println("Поезда под номером " + trainNumber + " нет");
    }

    public static void sortOfDestinationAndTime(List<Train> tr) {
        for (int i = 0; i < tr.size() - 1; i++) {
            for (int j = i + 1; j < tr.size(); j++) {
                if (tr.get(i).getDestination().compareTo(tr.get(j).getDestination()) > 0 ||
                        (tr.get(i).getDestination().equals(tr.get(j).getDestination()) &&
                                tr.get(i).getTime().compareTo(tr.get(j).getTime()) > 0)) {
                    Train temp = tr.get(i);
                    tr.set(i, tr.get(j));
                    tr.set(j, temp);
                }
            }
        }
        System.out.println("==============================================");
        for (Train train : tr) {
            train.printInfoTrain();
    }

}
}
