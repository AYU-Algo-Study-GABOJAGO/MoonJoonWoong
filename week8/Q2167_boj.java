package week8;

import java.io.*;
import java.util.StringTokenizer;

public class Q2167_boj {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sample[][] = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                sample[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int tc = Integer.parseInt(br.readLine());

        for(int z=0;z<tc;z++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int result = 0;

            for(int o=i-1;o<x;o++){
                for(int p=j-1;p<y;p++){
                    result += sample[o][p];
                }
            }

            System.out.println(result);
        }
    }
}
