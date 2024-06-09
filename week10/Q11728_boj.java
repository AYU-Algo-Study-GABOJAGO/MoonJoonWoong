package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11728_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int fir[] = new int[N];
        int sec[] = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            fir[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            sec[i] = Integer.parseInt(st.nextToken());
        }

        int first = 0;
        int second = 0;

        while(first<N && second<M){
            if(fir[first] == sec[second]){
                sb.append(fir[first] + " ");
                first++;
                sb.append(sec[second] + " ");
                second++;
            }else if(fir[first]>sec[second]){
                sb.append(sec[second] + " ");
                second++;
            }else {
                sb.append(fir[first] + " ");
                first++;
            }
        }

        if(second == M){
            for(int i=first;i<N;i++){
                sb.append(fir[i] + " ");
            }
        }
        if(first == N){
            for(int i=second;i<M;i++){
                sb.append(sec[i]+" ");
            }
        }
        System.out.println(sb);
    }
}
