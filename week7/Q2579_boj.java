package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579_boj{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int f[] = new int[T+1];
        int max[] = new int[T+1];
        for(int i = 1; i<=T; i++){
            f[i] = Integer.parseInt(br.readLine());
        }
        if(T==1) {
            max[1] = f[1];
        }
        else if(T==2) {
            max[1] = f[1];
            max[2] = f[2] + f[1];
        }
        else if(T>2) {
            max[1] = f[1];
            max[2] = f[2] + f[1];
            max[3] = Math.max(f[1] + f[3], f[2] + f[3]);
            for (int i = 4; i <= T; i++) {
                max[i] = Math.max(max[i - 3] + f[i] + f[i - 1], max[i - 2] + f[i]);
            }
        }
        System.out.println(max[T]);
    }
}
