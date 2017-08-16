package com.company;

public class Main {

    public static void main(String[] args) {
    int a = 3;
    int b = 3;
	int[][] arr1 = new int[a][b];
	int[][] arr2 = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = (int) (0 + (Math.random() * (10)));
            }
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr2[(a - 1) - i][j] = arr1[j][i];
            }
        }
        System.out.println("Перевернутый массив:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
}
