package view;

import model.BubbleSort;
import model.GenerateRandom;

public class Task4View {
	public void view(int size) {
		//入れ物を用意
		int[] numbers = new int[size];
		numbers = new GenerateRandom().generateRandom(size);
		
		//出力
		System.out.print("生成されたのは");
		for (int i = 0; i < size; i++) {
			System.out.print("、" + numbers[i]);
		}
		System.out.println("です。");
		
		numbers = new BubbleSort().bubbleSort(numbers, size);
		
		//出力
		System.out.print("大きい順に並べると");
		for (int i = 0; i < size; i++) {
			System.out.print("、" + numbers[i]);
		}
		System.out.println("です。");
	}
}
