/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.Scanner;
import java.util.ArrayList;
/**

package todo;
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
   

  
    


public static void main(String[] args) {
        // TODO code application logic here
        
           ArrayList<String> taskList = new ArrayList<>();
           Scanner sc = new Scanner(System.in);
           Scanner taskScan = new Scanner(System.in);
      
       
        int id = 0, op;

        do {
            System.out.println("1 - New Task \n2 - Remove task \n3 - View List \n4 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("New Task: ");
                    taskList.add(taskScan.nextLine());
                  //
                    break;

                case 2:
                    int d = sc.nextInt();
                  taskList.remove(d);
                    break;
                case 3:
                    System.out.println("Lista");
                 for (int i = 0; i < taskList.size(); i++) {
            System.out.println(  "  ["+i + "] -" + taskList.get(i));

                    }
                 break;
            }
                    
            
        } while (op < 4);

    }

      
        
        }
        
