/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author beatr
 */
public class ToDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<String> task = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id = 0, i = 0, op;

        do {
            System.out.println("1 - New Task \n2 - Remove task \n3 - View List \n4 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("New task: ");
                    task.add(sc.nextLine());
                     System.in.read();
                    System.out.println(task);
                   //
                    break;
                case 2:
                    System.out.println("ID task remove: ");
                    task.get(id = sc.nextInt());
                    System.out.println("Remover task " + task.toString() + "?");
                    String choice = null;
                    if (choice.equals("nao")) {
                        System.out.println("Task not removed");
                    } else {
                        task.remove(0);
                    }
                    break;
                case 3:
                    System.out.println("View List");
                    for (i = 0; i < task.size(); i++) {
                        System.out.println(task.get(i));

                    }

                    break;
            }
        } while (op < 4);

    }

}

