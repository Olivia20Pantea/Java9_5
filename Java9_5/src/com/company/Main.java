package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de copii: ");
        int n=scanner.nextInt();
        int i,nr=1;
        for (i = 1; i <= n; i++)
            lista.add(i);
        System.out.print("m=");
        int m=scanner.nextInt();
        while(lista.size()>1) {
            for (i = 1; i <= lista.size(); i++) {
                if (nr== m) {
                    lista.remove(i-1);
                    i--;
                    nr = 1;
                }
                else
                    nr++;
            }
        }
        System.out.println("Copilul cu nr "+lista.get(0)+" a castigat jocul.");
    }
}
