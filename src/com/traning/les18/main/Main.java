package com.traning.les18.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.traning.les18.logic.logic;
import com.traning.les18.stationandtrain.Station;
import com.traning.les18.stationandtrain.Train;

public class Main {

	public static void main(String[] args) {
		ArrayList<Train> tr = new ArrayList<>();
		masTrain(tr);
		
		Station station = new Station(tr);
        logic.sortOfNumber(tr);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер поезда: ");
        int trainNumber = scanner.nextInt();
        logic.printTrainInfoByNumber(tr, trainNumber);
        logic.sortOfDestinationAndTime(tr);
    }

	public static ArrayList<Train> masTrain(ArrayList<Train> tr){
		tr.add(new Train("Моcква", 288, "12:30"));
		tr.add(new Train("Рига", 693, "07:15"));
		tr.add(new Train("Киев", 859, "23:00"));
		tr.add(new Train("Арарат", 233, "15:45"));
		tr.add(new Train("Варшава", 256, "14:50"));
		
		return tr;

	}
}

