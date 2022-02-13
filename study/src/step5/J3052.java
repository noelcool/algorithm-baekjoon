package step5;

import java.util.ArrayList;
import java.util.Scanner;

public class J3052 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        for (int i=0; i<10; i++) {
            array[i] = scanner.nextInt();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            int temp = i % 42;
            if (!arrayList.contains(temp)) {
                arrayList.add(temp);
            }
        }
        System.out.println(arrayList.size());
    }
}
