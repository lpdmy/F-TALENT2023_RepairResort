/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repairtouristarea;

import java.util.Scanner;

/**
 *
 * @author lpdie
 */
public class RepairTouristArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        System.out.print("Nhap k: ");
        k = sc.nextInt();
        System.out.print("Nhap mang: ");
        int[][] arr = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int truoc = -1;
        int v = 0;
        for (v = 0; v < Math.ceil((double) n / 2); v++) {
            int i;
            int j = v;
            for (i = v; i < n - v; i++) {
                if (arr[i][j] < truoc) {
                    sum = sum + truoc - arr[i][j];
                    arr[i][j] = truoc;
                }
                truoc = arr[i][j];
            }
            i--;
            for (j = v + 1; j < n - v; j++) {
                if (arr[i][j] < truoc) {
                    sum = sum + truoc - arr[i][j];
                    arr[i][j] = truoc;
                }
                truoc = arr[i][j];
            }
            j--;
            for (i = n - 2 - v; i >= 0 + v; i--) {
                if (arr[i][j] < truoc) {
                    sum = sum + truoc - arr[i][j];
                    arr[i][j] = truoc;
                }
                truoc = arr[i][j];
            }
            i++;
            for (j = n - 2 - v; j >= 1 + v; j--) {
                if (arr[i][j] < truoc) {
                    sum = sum + truoc - arr[i][j];
                    arr[i][j] = truoc;
                }
                truoc = arr[i][j];
            }

        }
        System.out.println(sum*k);
    }

}
