package sort;

import java.util.Scanner;

public class NumberSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i; j < numArr.length; j++) {
                if(numArr[i] > numArr[j]){
                    temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
