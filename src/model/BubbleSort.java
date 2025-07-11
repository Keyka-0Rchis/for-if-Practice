package model;

public class BubbleSort {
	public int[] bubbleSort(int[] numbers,int size) {
		//バブルソートの手法
		//全部でsize周する。1周ごとに最後尾から確定する。
		for (int i = 0; i < size - 1; i++) {
			//size-1-i番目以降は並べ替え済みなので見ない。
			for (int j = 0; j < size - 1 - i; j++) {
				//j,j+1の隣同士見比べて、右が大きければ入れ替える。これを繰り返して小さいものを右に追いやる。
				if (numbers[j] < numbers[j + 1]) {
					//以下、入れ替え
					//一時的に左側を退避
					int temp = numbers[j];
					//左側を右側の値で初期化して 
					numbers[j] = numbers[j + 1];
					//右側を退避していたもので初期化する。
					numbers[j + 1] = temp;
				}
			}
		}
		return numbers;
	}
}
