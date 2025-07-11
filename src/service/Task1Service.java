package service;

import java.util.Scanner;

import presentation.TaskInputReader;
import view.Task1View;

public class Task1Service {
	public void execute(Scanner scanner) {
		//実行のためのメソッド。ここで処理の呼び出しを行う。
		//指定の数値。intに分離することでテストを容易に。
		int size;
		//標準入力で数値を取得
		size = new TaskInputReader().taskInputReader(scanner);
		new Task1View().view(size);
	}
}
