package baekjoon;

import java.util.Scanner;

public class x보다_작은_수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i : a){
            if( i < x) System.out.print(i+" ");
         }
    }
}
