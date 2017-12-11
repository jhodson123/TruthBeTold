package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Operation methods = new Operation();

        boolean A = true;
        boolean B = true;

        System.out.println("Input Expression (ex. A && B)");
        String expr = input.nextLine();

        if (expr.indexOf("&&") != -1){

            for (int i=0; i<4; i++) {

                methods.andReturn(A, B);

                if (i==0){
                    B = false;
                } else if (i==1){
                    A = false;
                    B = true;
                } else if (i==2){

                } else {

                }
            }
        }
    }
}
