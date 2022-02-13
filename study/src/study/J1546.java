package study;

import java.util.Arrays;
import java.util.Scanner;

public class J1546 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double array[] = new double[count];
        for (int i=0; i<count; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        double max = array[array.length - 1];
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] / max * 100;
        }
        System.out.println(Arrays.stream(array).sum() / count);
    }
}
