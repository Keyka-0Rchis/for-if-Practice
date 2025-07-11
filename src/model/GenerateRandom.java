package model;

import java.util.Random;

public class GenerateRandom {
	public int[] generateRandom(int size){
		//入れ物を用意
		int[] numbers = new int[size];
		//Randomクラスのインスタンスを作成
		Random rand = new Random();
		
		//順番に格納する
		for (int i = 0;i < size; i++) {
			//randに対するnextIntメソッドは0～引数-1の値をランダムに返す。
			numbers[i] = rand.nextInt(30) + 1;
		}
		return numbers;
	}
}
