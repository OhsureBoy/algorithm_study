package BOJ;

import java.util.Scanner;

public class BOJ1032 {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder word = new StringBuilder(sc.next());

        for (int j = 1; j < n; j++) {
            StringBuilder temp = new StringBuilder(sc.next());

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != temp.charAt(i)) {
                    word.setCharAt(i, '?');;
                }
            }
        }
        sc.close();
        System.out.print(word);
    }
}