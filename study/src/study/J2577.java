package study;

import java.util.Scanner;

public class J2577 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int total = first * second * third;
        int array[] = new int[10];
        while(total > 0) {
            array[total % 10] += 1;
            total /= 10;
        }
        for(int i : array) {
            System.out.println(i);
        }
    }
}
