package step5;

import java.util.Scanner;

public class J8958 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String arr[] = new String[count];
        for(int i=0; i<count; i++) {
            arr[i] = scanner.next();
        }
        for(String s : arr) {
            char[] arr2 = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                arr2[i] = s.charAt(i);
            }
            int temp = 0;
            int point = 1;
            for(char ss : arr2) {
                if(ss == 'O') {
                    temp += point;
                    point += 1;
                }
                if (ss == 'X') {
                    point = 1;
                }
            }
            System.out.println(temp);
        }
    }
}
