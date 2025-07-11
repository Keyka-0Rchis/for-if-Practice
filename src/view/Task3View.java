package view;

public class Task3View {
	public void view(int size) {
		//列番号の増加。0を使いたいので1下げた。
		for (int i = 0; i < size*2-1; i++) {
			//左からi個だけスペースを入れて、(size*2-1)-i*2だけ$を入れ、あまりはスペースで埋める。
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < size*2-1 - i*2; k++) {
				System.out.print("$");
			}
			//ここは最初と同じ回数なのでコピペで良い。
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//すべて入れ終わったら改行
			System.out.println();
		}
	}
}
