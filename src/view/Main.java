package view;

import controller.BubbleSort;
import controller.MergeSort;
import controller.QuickSort;

public class Main {
	public static void main(String[] args) {
		
		int[] vetor = new int[1500];
		int cont = 1500;
		
		for(int x = 0; x < 1500; x++) {
			vetor[x] = cont;
			cont--;
		}
		
		BubbleSort bubbleSort = new BubbleSort();
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		
		long inicio = System.currentTimeMillis();
		vetor = bubbleSort.bubble(vetor);
		long fim = System.currentTimeMillis();
		System.out.println(fim - inicio);
		
		inicio = System.currentTimeMillis();
		vetor = quickSort.quick(vetor, 0, 1499);
		fim = System.currentTimeMillis();
		System.out.println(fim - inicio);
		
		inicio = System.currentTimeMillis();
		vetor = mergeSort.merge(vetor, 0, 1499);
		fim = System.currentTimeMillis();
		System.out.println(fim - inicio);
		
	}
}
