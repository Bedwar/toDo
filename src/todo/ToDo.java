/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author beatr
 */
public class ToDo {

    List<Task> taskList = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    private void addTask(Task task) {
        taskList.add(task);
    }

    private void removeTask(int id) {

        for (Task task : taskList) {
            if (task.getId() == id) {
                taskList.remove(task);
            }
        }
    }

    private void showTask() {

        for (Task task : taskList) {
            System.out.println(task.getId() + "- " + task.getName());
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int id = 0, i = 0, op;

        do {
            System.out.println("1 - New Task \n2 - Remove task \n3 - View List \n4 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("New task: ");
                    addTask(sc.nextLine());
                    System.in.read();
                    
                    //
                    break;
                case 2:
                    int d = sc.nextInt();
                   removeTask(d);
                    break;
                case 3:
                 showTask();

                    }

                    break;
            }
        } while (op < 4);

    }

}
