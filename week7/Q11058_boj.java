package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11058_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long dp[] = new long[N+1];

        for(int i=1;i<=6;i++){
            dp[i] = i;
        }

        for(int i=7;i<=N;i++){
            for(int j=3;j<i;j++){
                dp[i] = Math.max(dp[i], dp[i-j]*(j-1));
            }
        }

        System.out.println(dp[N]);
    }
}
