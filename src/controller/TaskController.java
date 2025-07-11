package controller;

import java.util.Scanner;

import presentation.TaskSelectPresentation;
import service.Task1Service;
import service.Task2Service;
import service.Task3Service;
import service.Task4Service;

public class TaskController {

	public void start(Scanner scanner) {
		TaskSelectPresentation selectPresentation = new TaskSelectPresentation();
		int taskType = selectPresentation.selectTask(scanner);

		switch (taskType) {
			case 1 -> new Task1Service().execute(scanner);
			case 2 -> new Task2Service().execute(scanner);
			case 3 -> new Task3Service().execute(scanner);
			case 4 -> new Task4Service().execute(scanner);
			default -> System.out.println("無効な選択です。");
		}
	}
}
