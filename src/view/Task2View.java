package view;

public class Task2View {
	public void view(int size) {
		//列番号の増加。0を使いたいので1下げた。
		for (int i = 0; i < size; i++) {
			//左からi個だけスペースを入れて、残りに$を入れる。
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < size - i; k++) {
				System.out.print("$");
			}
			//$を入れ終わったら改行
			System.out.println();
		}
	}
}
