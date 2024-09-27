package linked_list;

import java.util.Arrays;
import java.util.LinkedList;

public class exercises{
    public static void main(String[] args) {
        LinkedList<String> color_list = new LinkedList<>();
        String[] colors = {"Red", "Green", "Black", "White", "Pink"};
        color_list.addAll(Arrays.asList(colors));

        System.out.println("Task 1: Iterating through the list");
        System.out.print("color list: ");
        for(String i: color_list) System.out.print(i + "   ");
        System.out.println("\n");

        System.out.println("Task 2: Appending");
        String new_color = "Yellow";
        color_list.add(new_color);
        System.out.println("color list: " + color_list + "\n");

        System.out.println("Task 3: Inserting to first and last");
        String first_color = "Light grey", last_color = "Dark grey";
        color_list.addFirst(first_color);
        color_list.addLast(last_color);
        System.out.println("color list: " + color_list + "\n");

        System.out.println("Task 4: Removing first and last");
        color_list.removeFirst();
        color_list.removeLast();
        System.out.println("color list: " + color_list + "\n");

        System.out.println("Task 5: Swapping elements");
        String temp = color_list.getLast();
        color_list.set(color_list.indexOf(color_list.getLast()), color_list.getFirst());
        color_list.set(color_list.indexOf(color_list.getFirst()), temp);
        System.out.println("color list: " + color_list + "\n");

        System.out.println("Task 6: Comparing 2 lists");
        LinkedList<String> color_list2 = new LinkedList<>();
        String[] colors2 = {"Magenta", "Cyan", "Yellow"};
        color_list2.addAll(Arrays.asList(colors2));
        System.out.println("color list 1: " + color_list);
        System.out.println("color list 2: " + color_list2);
        if(color_list.equals(color_list2)) System.out.println("The lists are the same.\n");
        else System.out.println("The lists are not the same.\n"); 

        System.out.println("Task 7: Checking if empty");
        System.out.println("color list 1: " + color_list + "\n");
        System.out.println("color list 2: " + color_list2 + "\n");
        if(color_list.isEmpty()) System.out.println("The first list is empty.\n");
        if(color_list2.isEmpty()) System.out.println("The second list is empty.\n");

        System.out.println("Task 8: Retrieving last element");
        System.out.println("The last element of the first list is " + color_list.getLast());
        System.out.println("The last element of the second list is " + color_list2.getLast());
        System.out.println();

        System.out.println("Task 9: Retrieving first element");
        System.out.println("The first element of the first list is " + color_list.getFirst());
        System.out.println("The first element of the second list is " + color_list2.getFirst());
        System.out.println();

        System.out.println("Task 10: Combining lists");
        color_list.addAll(color_list2);
        System.out.println("The combination of the two lists: " + color_list);
    }
}