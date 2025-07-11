import java.util.Scanner;

import controller.TaskController;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner scanner = new Scanner(System.in);
        TaskController controller = new TaskController();
        controller.start(scanner);
        scanner.close();
	}

}
