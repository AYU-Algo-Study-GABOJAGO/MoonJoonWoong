package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12847_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long arr[] = new long[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=n;i++){
            arr[i] += arr[i-1];
        }

        long result=0, sum=0;

        for(int i=0;i<=n-m;i++){
            sum = arr[i+m] - arr[i];
            result = Math.max(sum, result);
        }

        System.out.println(result);
    }
}
