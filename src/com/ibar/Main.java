package com.ibar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scan input data
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose size of 2 dimensional array!");
        System.out.print("Rows: ");
        int m = sc.nextInt();
        System.out.print("Columns: ");
        int n = sc.nextInt();

        // execute
        printArray(m, n);
    }

    static void printArray(int m, int n){

        // Determines First or Second will be printed
        int ForS = 1;

        // First part of sequence
        int first = 1;

        // Second part of sequence
        int second;
        if((m*n)%2 == 1){
            second = (((m*n)+1)/2)+1;
        }else {
            second = ((m*n)/2)+1;
        }

        // Loop
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){

                if (ForS%2 == 1){
                    System.out.print(first + "\t");
                    first++;
                }else {
                    System.out.print(second + "\t");
                    second++;
                }
                ForS++;
            }

            // if columns are not double, slides sequence
            if (n%2==0){
                ForS++;
            }

            // New line
            System.out.println();
        }


    }
}
