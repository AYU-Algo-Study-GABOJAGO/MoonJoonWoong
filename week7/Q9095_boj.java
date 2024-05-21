package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[11];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i=4;i<11;i++){
            arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
        }

        for(int i=0;i<N;i++){
            int s = Integer.parseInt(br.readLine());
            System.out.println(arr[s]);
        }
    }
}
