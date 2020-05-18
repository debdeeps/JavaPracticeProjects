package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList_ArrayListtoArray {  
    public static void main(String[] args) {  
        //creating Arraylist  
        List<String> fruitList = new ArrayList<>();  
        //adding String Objects to fruitsList ArrayList  
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
        System.out.println("Converting ArrayList to Array" );  
        String[] item = fruitList.toArray(new String[fruitList.size()]);   //important
        for(String s : item){  
            System.out.println(s);  
        }  
        
       
        System.out.println("Converting Array to ArrayList" );  
        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList(item));  //important
//        l2 =  Arrays.asList(item);  
        System.out.println(l2);  
    }  
}  