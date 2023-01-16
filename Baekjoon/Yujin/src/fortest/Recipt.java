package fortest;

import java.util.Scanner;

public class Recipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            sum -= (scanner.nextInt()) * scanner.nextInt();
        }

        if(sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
