package com.Testdome;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition {
	private final Deque<Integer> wagons = new LinkedList<>();
//	LinkedList<Integer> wagons = new LinkedList<>();
	public void attachLeft(int wagonNumber) {
		wagons.addFirst(wagonNumber);
	}

	public void attachRight(int wagonNumber) {
		wagons.addLast(wagonNumber);
	}

	public int detachWagonFromLeft() {
		if (!wagons.isEmpty()) {
			return wagons.removeFirst();

		} else {
			throw new IndexOutOfBoundsException("No wagons available");
		}
	}

	public int detachWagonFromRight() {
		if (!wagons.isEmpty()) {
			return wagons.removeLast();

		} else {
			throw new IndexOutOfBoundsException("No wagons available");
		}
	}

	public static void main(String[] args) {
		TrainComposition tree = new TrainComposition();
		tree.attachRight(7);
		tree.attachLeft(13);
		System.out.println(tree.detachWagonFromRight()); // 7
		System.out.println(tree.detachWagonFromLeft()); // 13
	}
}