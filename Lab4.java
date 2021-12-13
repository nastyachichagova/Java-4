//Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные
//целому числу X. В результате должен получиться массив не большей размерности. На экран должны
//выводиться как оригинальное состояние массива, так и итоговое

import java.util.Scanner;


public class Lab4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int A[], N;

        System.out.print("Введите размерность массива: ");
        N = in.nextInt();

        A = new int[N];

        for (int i = 0; i < N; i++){
            System.out.print("Введите " + (i+1) + "-й элемент массива: ");
            A[i] = in.nextInt();
        }

        System.out.print("Введите число X: ");
        int X = in.nextInt();

        System.out.print("Оригинальный массив: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        int k = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == X){
                k += 1;}
        }

        int[] newA = new int [A.length-k];
        for (int i = 0, j = 0; i < A.length; i++) {
            if (A[i] != X) {
                newA[j++] = A[i];
            }
        }

        System.out.print("Преобразованный массив: ");
        for (int i = 0; i < newA.length; i++) {
            System.out.print(newA[i] + " ");
        }
        System.out.println();

        in.close();
    }
}