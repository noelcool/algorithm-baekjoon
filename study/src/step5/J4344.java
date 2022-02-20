package step5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] arr;
        for (int i = 0; i < test_case; i++) {
            int student = sc.nextInt();
            arr = new int[student];
            int sum = 0;
            for(int j = 0; j < student; j++) {
                int point = sc.nextInt();
                arr[j] = point;
                sum += point;
            }
            double avg = (double) sum / student;
            double cnt = 0;
            for (int j = 0; j < student; j++) {
                if(arr[j] > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", cnt / student * 100);
        }
    }
}
