package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4158_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N==0 && M==0){
                System.out.println(sb);
                break;
            }

            int sang[] = new int[N];
            int sun[] = new int[M];

            for (int i = 0; i < N; i++) {
                sang[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                sun[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(sang);
            Arrays.sort(sun);

            int cnt=0 ,sang_index = 0, sun_index = 0;

            while (sang_index != N && sun_index != M) {
                if (sang[sang_index] == sun[sun_index]) {
                    cnt++;
                    sang_index++;
                    sun_index++;
                } else if (sang[sang_index] > sun[sun_index]) {
                    sun_index++;
                } else {
                    sang_index++;
                }
            }

            sb.append(cnt+"\n");
            cnt=0;
        }
    }
}
