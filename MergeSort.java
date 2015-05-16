//package com.kiva;
//http://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html

public class MergeSort{
	
	private int[] numbers;
	private int[] helper;

	private int number;

	public void sort(int[] values){

	this.numbers = values;
	number = values.length;
	this.helper = new int[number];
	mergesort(0,number -1);
	for (int i=0;i<number;i++){
		System.out.println(values[i]);
	}
	}

	private void mergesort(int low,int high){

		if (low < high){
			int middle = low +(high -low)/2; 
		
		mergesort(low,middle);
		mergesort(middle+1,high);
		merge(low,middle,high); 
		}
	}

	private void merge(int low,int middle, int high){
		for (int i=low;i<=high ;i++){
			helper[i]=numbers[i];
		}

		int i=low;
		int j = middle +1;
		int k = low;
// Copy the smallest values from either the left or the right side back
    // to the original array
		while (i<=middle && j <= high){
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		while ( i <= middle){
			numbers[k]= helper[i];
			k++;
			i++;
			}
	}

	public static void main(String[] argv){

		MergeSort m = new MergeSort();
		int[] unsorted={99,93,77,44,66,22,33,11};

		m.sort(unsorted);
	}

}