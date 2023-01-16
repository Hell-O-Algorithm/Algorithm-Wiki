package bruteforce;

import java.util.Scanner;

public class BlackJack {
    public static int tempNum = 0;
    public static int min = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }
        BlackJack(M, cards);
    }

    public static void BlackJack(int M, int[] cards) {
        // M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합 출력
        min = Math.abs((cards[0] + cards[1] + cards[2]) - M);
        tempNum = (cards[0] + cards[1] + cards[2]);

        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    Sum(cards[i], cards[j], cards[k], M);
//                    System.out.println("count : " + count + " " + i + " " + j + " " + k);
//                    System.out.println("i j k " + cards[i] + " " + cards[j] + " " + cards[k]);
                }
            }
        }
        System.out.println(tempNum);
    }

    public static void Sum(int numA, int numB, int numC, int M) {
        int sum = numA + numB + numC;

        if (sum == M) {
            tempNum = sum;
        }

        if (sum < M && Math.abs(M - sum) < min) {
            min = Math.abs(M - sum);
            tempNum = sum;
        }
    }
}
