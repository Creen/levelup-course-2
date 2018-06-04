package ru.levelup.training.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {

        int steps = 0;

        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int x = n;

        while(n > 1){
            if(n % 2 == 0)
                n /= 2;
            else n = (n * 3) + 1;
            steps++;
        }

        System.out.println("It takes \'" + steps + "\' steps to reach \'1\' using the Collatz conjecture on the number \'" + x +"\'.");

    }
}
