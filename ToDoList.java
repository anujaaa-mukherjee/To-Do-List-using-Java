import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> tasks;
    private ArrayList<Boolean> completed;

    public ToDoList() {
        tasks = new ArrayList<String>();
        completed = new ArrayList<Boolean>();
    }

    public void addTask(String task) {
        tasks.add(task);
        completed.add(false);
        System.out.println("Task added to to-do list.");
    }

    public void markTaskComplete(int taskNum) {
        if (taskNum >= 1 && taskNum <= tasks.size()) {
            completed.set(taskNum-1, true);
            System.out.println("Task marked as complete.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void viewToDoList() {
        if (tasks.size() == 0) {
            System.out.println("To-do list is empty.");
        } else {
            System.out.println("=== To-Do List ===");
            for (int i = 0; i < tasks.size(); i++) {
                String status = completed.get(i) ? "complete" : "incomplete";
                System.out.println((i+1) + ". " + tasks.get(i) + " (" + status + ")");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        System.out.println("=== To-Do List Manager ===");

        while (true) {
            System.out.println("1. View To-Do List");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
        }
    }
}