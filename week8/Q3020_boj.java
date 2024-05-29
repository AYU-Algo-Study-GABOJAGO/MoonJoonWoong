package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3020_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int up[] = new int[H+2];
        int down[] = new int[H+2];

        for (int i = 0; i < N/2; i++) {
             down[Integer.parseInt(br.readLine())]++;
             up[H-Integer.parseInt(br.readLine())+1]++;
        }

        for (int i = 1 ; i <= H; i++) {
            down[i] += down[i-1];
        }

        for (int i = H; i >= 1; i--) {
            up[i] += up[i+1];
        }

        int min = N;
        int cnt = 0;

        for (int i = 1; i <= H; i++) {
            int obs = (down[H] - down[i - 1]) + (up[1] - up[i + 1]);

            if (obs < min) {
                min = obs;
                cnt = 1;
            } else if (obs == min)
                cnt++;
        }

        System.out.println(min + " " + cnt);
    }
}
