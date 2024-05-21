package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q18353_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int soldier[] = new int[N+1];
        int dp[] = new int[N+1];

        for(int i=0;i<N;i++){
            soldier[i] = Integer.parseInt(st.nextToken());
        }

        int result = 1;
        Arrays.fill(dp, 1);

        for(int i=0;i<N;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(soldier[j] > soldier[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            result = Math.max(result, dp[i]);
        }

        System.out.println(N- result);
    }
}
