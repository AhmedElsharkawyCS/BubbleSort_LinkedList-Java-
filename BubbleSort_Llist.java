/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort_llist;

import java.util.Scanner;

/**
 *
 * @author mohammed
 */

    public class BubbleSort_Llist{
   public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         System.out.println("Are you want to test this algorithm\nA-OK\nE-Exit");
         Scanner input = new Scanner(System.in);
         String wil=inp.nextLine();
         while (wil.equals("OK")||wil.equals("ok")||wil.equals("A")) 
         {           
           
         System.out.println("please selecte the method of sort!\nA-sort by value\nB-sort by refrance");
        LinkList list = new LinkList();
        int[] value={1,3,2,4,6,30,20,10};
        for (int i = 0; i < 7; i++) {
            list.addToLinkedList(value[i]);
        }
        if(input.nextLine().equals("A"))
//        list.printingtoList();
        { list.sorting("SBV");
        System.out.println("");
        list.printingtoList();
        }else{
            list.printingtoList();
            list.sorting("refrance");
        System.out.println("");
        list.printingtoList();
        }
        Scanner sc=new Scanner(System.in);
             System.out.println("LIST:\nA-to continue.\nE-to exit.\nLoading...\n");
             String get=sc.nextLine();
             if(get.equals("E")||get.equals("e")){
                 wil="E";
             }
         }
}
    
    }

