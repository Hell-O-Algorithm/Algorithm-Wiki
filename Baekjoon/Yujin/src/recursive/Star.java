package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        StarPrint(num);
    }

    public static void StarPrint(int num) {
        int count = num / 3; // 3의 제곱
        int blankNum = 0; // 4일 때 공백
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (blankNum == 4) {
                    Blank(count);
                } else {
                    BasicStar(1);
                }
                blankNum++;
            }
            System.out.println();
        }
    }

    public static void BasicStar(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
        }
        System.out.print("*");
    }

    public static void Blank(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
        }
    }
}
