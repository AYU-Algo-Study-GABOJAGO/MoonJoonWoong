package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10819_boj {
    static int[] arr;
    static int[] answer; //
    static boolean[] visited;
    static int result;
    static int N;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        answer = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());

        }
        dfs(0);
        System.out.println(result);

    }


    private static void dfs(int depth){
        if(depth == N){
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(answer[i]-answer[i+1]);
            }
            result = Math.max(result,sum);
            return;

        }
        for (int i = 0; i < N; i++) {

            if(!visited[i]){
                visited[i] = true;
                answer[depth] = arr[i];

                dfs(depth + 1); // depth++ 하면 값이 저장되서 안됨
                visited[i] = false;
            }

        }
    }
}