package BOJ;

import java.util.Scanner;


//다리 놓기는 조합 문제다 nCr
//시간 초과 났네
public class BOJ1010 {

    private static final int[][] brigde = new int[31][31];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        
        for(int i=0; i<line; i++) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            
            System.out.println(combination(r,n));
        }
        sc.close();
    }

    public static int combination(int n, int r) 
    { 
        if(n == r || r == 0) 
            return 1; 
        else if(brigde[n][r] > 0)
            return brigde[n][r];
        else
            return brigde[n][r] = combination(n - 1, r - 1) + combination(n - 1, r); 
    }

}