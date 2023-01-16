package geometry1;

import java.util.Scanner;

public class TaxiGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

//   유클리드 기하학의 원 넓이는  PI * r^2 이고, 택시 기하학의 원 넓이는 2 * r^2 이다.
        System.out.printf("%.6f", Math.PI * Math.pow(r, 2));
        System.out.println();
        System.out.printf("%.6f", 2 * Math.pow(r, 2));
    }
}
