package com.company;

import java.util.Scanner;

public class DeleteElementByValue {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert array length (Smaller than 20)");
        int choice = scanner.nextInt();
        while (choice > 20) {
            System.out.println("Please insert again arrlength (Smaller than 20)");
            choice = scanner.nextInt();
        }
        int[] arr = new int[choice];
        System.out.println("Insert element value");
        String arrToString = "";
        for (int i = 0; i < choice; i++) {
            arr[i] = scanner.nextInt();
            arrToString += arr[i] + "\t";
        }
        System.out.println("your array is: " + arrToString);
        new DeleteElementByValue().DeleteElement(arr);
        arrToString = "";
        for (int i = 0; i < arr.length; i++) {
            arrToString += arr[i] + "\t";
        }
        System.out.println("your array is: " + arrToString);

    }


    public void DeleteElement(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert element that you want to delete");
        int input = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1]=0;
                i--;
            }
        }
    }

}
