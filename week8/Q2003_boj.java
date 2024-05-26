package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2003_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ptr1=0, ptr2=0, result=0, sum=0;

        while (ptr1 < N){
            if(sum > M || ptr2 == N){
                sum -= arr[ptr1];
                ptr1++;
            }else{
                sum += arr[ptr2];
                ptr2++;
            }

            if(sum == M){
                result++;
            }
        }

        System.out.println(result);
    }
}
