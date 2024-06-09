package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2018_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int result = 0;
        int end = 1;
        int sum = 0;

        for(int i=1; i<= N; i++){
            while(sum<N && end <=N){
                sum += end;
                end += 1;
            }

            if(sum == N){
                result += 1;
            }
            sum -= i;
        }
        System.out.println(result);
    }
}
