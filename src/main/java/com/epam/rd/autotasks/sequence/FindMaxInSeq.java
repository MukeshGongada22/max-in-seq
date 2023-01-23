package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner s = new Scanner(System.in);
        int max=s.nextInt();
        int k=max;
        while(k!=0){

            if(k>max){
                max=k;
            }
            k=s.nextInt();

        }


        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
