package main;

import java.util.Scanner;

import dataStructures.ReverseStringUsingStack;

import sortTypes.InsertionSort;
import sortTypes.MyBubbleSort;
import sortTypes.MyQuickSort;
import sortTypes.MySelectionSort;
import sortTypes.SortType;

public class Main {
	
	public enum operationType{
		SORT(1),
		STACK(2);
		
		private int value;
		private operationType(int entry){
			value = entry;
		}
		public int getValue(){
			return value;
		}
		
	};
	
	public void sortingTechniques(){
		int lArray[] = {10, -5, 9, 0, 7, -22, 4, 3, 2, 8, 1};
		SortType sortType = null;
		
		System.out.println("Which sorting technique you would like to use from following list:");
		System.out.println(" \"Bubble\", \"Selection\", \"Insertion\", \"Quick\" ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		
		if(str.equalsIgnoreCase("Bubble")){
			sortType = new MyBubbleSort();
		}else if(str.equalsIgnoreCase("Selection")){
			sortType = new MySelectionSort();
		}else if(str.equalsIgnoreCase("Insertion")){
			sortType = new InsertionSort();
		}else if(str.equalsIgnoreCase("Quick")){
			sortType = new MyQuickSort();
		}else{
			System.out.println("Oops!! Wrong input");
		}
		
		if(sortType != null){
			sortType.sort(lArray);
		}
	}
	
	public static String getScannerData(){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		return str;
	}
	
	public void stackOperations(){
		System.out.println("Which operation type you want to choose: 1:Reverse string");
		
		
		int number = Integer.parseInt(getScannerData());
		switch(number){
		case 1: {
			System.out.println("Enter String to be sorted:");
			ReverseStringUsingStack reverseStack = new ReverseStringUsingStack();
			System.out.println("Reversed string is "+ reverseStack.reverseString(getScannerData()));
			break;
		}
		}
	}
	
	public static void main(String[] args){
		System.out.println("Which operation type you want to choose");
		System.out.println("SORT=1, STACK=2");
		
		
		int number = Integer.parseInt(getScannerData());
		operationType type = operationType.values()[number-1];
		
		Main mainFunc = new Main();
		switch(type){
		case SORT: {
					mainFunc.sortingTechniques();
					break;
					}
		case STACK: {
					mainFunc.stackOperations();
					break;
					}
		default: break;
		}
		
	}
}
