package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1966_boj {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int TC = Integer.parseInt(br.readLine());

        for(int i = 0;i<TC;i++){
            LinkedList<int[]> queue = new LinkedList<>();
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int imp = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            for(int j=0;j<size;j++){
                queue.add(new int[]{j,Integer.parseInt(st.nextToken())});
            }

            while(!queue.isEmpty()){
                int[] front = queue.pollFirst();
                boolean ismax =
                for(int k=0;k<queue.size();k++){
                    if(front[1]<queue.get(k)[1]){
                        for(int l=0;l<k;l++){
                            queue.add(front);

                        }
                    }
                }
            }
        }

    }
}