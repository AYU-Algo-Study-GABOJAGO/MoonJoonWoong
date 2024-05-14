package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] room = new int[N][2];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<2;j++){
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2차원 배열 뒷값 정렬 람다식 이용해서 뒷값이 같을 경우 앞값 비교까지 하게
        Arrays.sort(room, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);

        int cnt = 0, time=-1;

        for(int i=0;i<N;i++){
            if(room[i][0] >= time){
                time = room[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
