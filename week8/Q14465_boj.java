package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14465_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int arr[] = new int[N+1];

        for(int i=1;i<=N;i++){
            arr[i] = 1;
        }

        for(int i=0;i<B;i++){
            arr[Integer.parseInt(br.readLine())] = 0;
        }

        int result = 0;

        for(int i=1;i<=N;i++){
            arr[i] += arr[i-1];
        }

        int index = K;
        while(index <= N){
            result = Math.max(result, arr[index] - arr[index-K]);
            index++;
        }

        System.out.println(K-result);
    }
}
