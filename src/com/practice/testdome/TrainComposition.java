package com.practice.testdome;

import java.util.LinkedList;

public class TrainComposition {
	LinkedList <Integer> ll  =new LinkedList <Integer> ();
	
    public void attachWagonFromLeft(int wagonId) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    	ll.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    	ll.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    	if (!ll.isEmpty()) 
    		return ll.removeFirst();
		return 0;
    	}    	
    	    	
    

    public int detachWagonFromRight() {
    	if (!ll.isEmpty()) 
    		return ll.removeLast();
		return 0;
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromRight(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}