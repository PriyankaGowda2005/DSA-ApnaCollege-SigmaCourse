package basicSorting;

import java.util.*;

public class inbuildSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList
        ArrayList<Integer> arrList = new ArrayList<>();
        // assign values to arraylist
        arrList.add(5);
        arrList.add(2);
        arrList.add(8);
        arrList.add(1);
        arrList.add(4);
        // from user input

        System.out.println("Enter the size of array is");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements for array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Arrays.sort(arr); // Using inbuilt sort function
        //Arrays.sort(arr, 0, 4);

        // reverse order
        // Arrays.sort(arr, Collections.reverseOrder()); // for Integer array only
        // for int array we need to use custom comparator or convert to Integer array
        // Integer[] arrInteger = Arrays.stream( arr ).boxed().toArray( Integer[]::new
        // );
        // Arrays.sort(arrInteger, Collections.reverseOrder());
        reverseArrayUsingCollection(arrList);
        arrayPrint(arr);
    }

    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArrayUsingCollection(ArrayList<Integer> arrList) {
        Collections.reverse(arrList);
    }
}
