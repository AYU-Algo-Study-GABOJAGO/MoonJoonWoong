package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1946_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        int sinip = 0;


        for(int i=0;i<N;i++){
            sinip = Integer.parseInt(br.readLine());
            int arr[][] = new int[sinip][2];

            for(int j= 0;j<sinip;j++){
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);

            int first = arr[0][1];
            int cnt = sinip;

            for(int j=1;j<sinip;j++){
                if(first < arr[j][1]){
                    cnt--;
                    continue;
                }
                first = arr[j][1];
            }
            System.out.println(cnt);
        }
    }
}
