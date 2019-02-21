package com.youtube;

import java.util.*;


public class BasicAlgorithms {
	
	private int[] arrDate = new int[20];
	private int arrSize = 10;
	
	//create a arry
	public void randomArray() {
		Random random = new Random();
		for(int i = 0; i< arrSize; i++) {
			arrDate[i] = random.nextInt(10)+10;
		}
	}
	//print menthod
	public void print() {
		System.out.println("--------------");
		for (int i = 0; i < arrSize; i++) {
			System.out.print(i + "| ");
			System.out.print(arrDate[i] + ", ");
			
		}
		System.out.println(" ");
		System.out.println("--------------");
	}
	
	//get value
	public int getValueIndex(int index) {
		if(index > arrSize) {
			System.out.println("Sorry, this index is greater than array size!");
			return 0;
			}else {
				return arrDate[index];
			}		
	}
	//boolean
	public boolean doesValueExist(int value) {
		boolean flag = false;
		for (int i = 0; i < arrSize; i++) {
			if(value == arrDate[i]) {
				flag = true;
			}
		}
		return flag;
	}
	//delete index
	public void deleteIndex(int index) {
		if (index < arrSize) {
			for (int i = index; i < arrSize; i++) {
				arrDate[i] = arrDate[i+1];
			}
			arrSize--;
		}else {System.out.println("Index number is greater than array size!");}
	}
	
	//insert value
	public void insertValue(int value) {
		if (arrSize<20) {
			arrDate[arrSize] = value;
			arrSize++;
		}

	}
	
	//linear search
	public int linearSearch(int value) {
		for (int i = 0; i < arrSize; i++) {
			if (arrDate[i] == value) {
				System.out.println("The find value's index is " + i);
				return i;
			}
		}
		System.out.println("The value is not exist");
		return -1;
		
	}
	
public static void main(String[] args) {
	BasicAlgorithms exmArr = new BasicAlgorithms();
	exmArr.randomArray();
	exmArr.print();
	System.out.println(exmArr.getValueIndex(7));
	System.out.println(exmArr.doesValueExist(18));
	exmArr.deleteIndex(6);
	exmArr.print();
	exmArr.insertValue(19);
	exmArr.print();
	exmArr.linearSearch(20);
	}

}
