package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;



public class Main {
    public static void main(String[] args) {

        taskOne();
        taskTwo();
    }

    public static void taskOne () {
        /** Creating ArrayList <String> list:
         * The first way - we  use add() method to add elements in the list
         * The second way - we use the construction  = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
         * contains(str) - we use the method to check whether the sheet contains the desired row with
         * the specified color.
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        String str = "red";
       /** ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
           boolean result = arrayList.contains(str);
           System.out.println("ArrayList contains element \"" + str + "\" ?  " + result);
       */
        if (list.contains(str)) {
            System.out.println("The color exists!");
        } else {
            System.out.println("There is no color!");
        }
    }
    public static void taskTwo () {
        /** Creating LinkedList <Integer> ll
         *  Adding elements to Linked List with add()
         *  Defining the elements that will be swapped:  int element1 = 1; int element2 = 5;
         *  Using the static swap method
         *
         */

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        int element1 = 1;
        int element2 = 5;

        System.out.println("Linked List Before Swapping ");

        for (int i : ll) {
            System.out.print(i + " ");
        }
        swap(ll, element1, element2);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Linked List After Swapping ");

        for (int i : ll) {
            System.out.print(i + " ");
        }
    }

    // Swap Function

    /**
     * The method accepts arguments LinkedList<Integer> list,
     *                             int ele1, int ele2
     * @param list
     * @param ele1
     * @param ele2
     * Getting the positions of the elements int index1 and  int index2
     * Returning if the element is not present in the LinkedList
     * Swapping the elements with method set() : list.set(index1, ele2);
     */
    public static void swap(LinkedList<Integer> list,
                            int ele1, int ele2) {


        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);
        if (index1 == -1 || index2 == -1) {
            return;
        }
        list.set(index1, ele2);
        list.set(index2, ele1);
    }
}



