package presentation;

import java.util.Scanner;

public class TaskSelectPresentation {
	public int selectTask(Scanner scanner) {
		System.out.print("課題を選択してください (1-4):");
		return scanner.nextInt();
	}
}
