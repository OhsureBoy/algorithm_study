import java.util.Scanner;

public class BOJ15649 {

static int N,M;
static int[] selected, used;
static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();

        selected = new int[M+1];
        used = new int[N + 1];
        recv_fun(1);

        System.out.println(sb.toString());
    }

    public static void recv_fun(int k) {
        
        if(k == M +1) {
            for(int i = 1; i <= M; i ++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        }else {
            for(int cand = 1; cand <= N; cand ++) {
                if(used[cand] == 1) continue;

                selected[k] = cand; used[cand] = 1;
                recv_fun(k+1);
                selected[k] = 0; used[cand] = 0;
            }
        }

    }
}
