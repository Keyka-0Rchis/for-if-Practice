package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskInputReader {
	//入力値を受け取ってserviceに返す。１～３は変わらないから、とりあえずまとめる。
	public int taskInputReader(Scanner scanner) {
		//入力を終えていいかのフラグ
		boolean endFlag = false;
		//whileスコープ内でしか初期化されないので、一旦0を入れておく。
		int input = 0;
		while(!endFlag) {
			//促す
			System.out.print("自然数を入力してください。：");
			//不正な値の対処のためにtry-catch
			try {
				//入力値格納
				input = scanner.nextInt();
				//0と負の数を防ぐ
				if (input <= 0) {
					//入力値が0以下なら差し戻し。
					System.out.println("入力は自然数でお願いします。");
				}else {
					//ちゃんと正の数ならフラグ更新
					endFlag = true;
				}
			}catch(InputMismatchException e) {
				System.out.println("入力は自然数でお願いします。");
				//読み飛ばし。abcって入れたら、それはずっと残る。
				scanner.next();
			}
		}
		//確定した入力値を返す
		return input;
	}
}
