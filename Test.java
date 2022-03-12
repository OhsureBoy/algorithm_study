import java.util.Scanner;

class Test {
static StringBuilder sb = new StringBuilder();
static int N, M;
static int selected[];
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];

        recv_fun(1);

        System.out.println(sb.toString());

    }

    public static void recv_fun(int k) {
        //M번째를 다 돌았다면
        if(k == M + 1) {
            for(int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        }
        // 새로운거라면
        else {
            for(int cand = 1; cand <= N; cand++) {
                selected[k] = cand;
                recv_fun(k+1);
                selected[k] = 0;
            }
        }
    }
}

