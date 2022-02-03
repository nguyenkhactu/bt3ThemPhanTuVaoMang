package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.println("nhap chieu dai mang");
        int sezi = scanner.nextInt();
        array = new int[sezi];
        System.out.println("nhap gia tri cho mang");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("nhập số muốn chèn vào mảng");
        int addNumber = scanner.nextInt();
        System.out.println("nhập vị trí muốn chèn vào mảng");
        int index = scanner.nextInt();
        int[] newArray = new int[sezi + 1];
        for (int j = 0; j < newArray.length; j++) {
            if (newArray[j] < index) {
                    newArray[j] = array[j];
            }
            if (newArray[j] == index) {
                newArray[j] = addNumber;
            }
            if (newArray[j] > index) {
                for (int i = index; i < newArray.length; i++) {
                    newArray[i] = array[i-1];
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
        }
    }
}
