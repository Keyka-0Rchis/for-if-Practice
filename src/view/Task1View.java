package view;

public class Task1View {
	public void view(int size) {
		//列番号の増加
		for (int i = 1; i <= size; i++) {
			//左からi個だけ$を重ねる
			for (int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			//$を入れ終わったら改行
			System.out.println();
		}
	}
}
