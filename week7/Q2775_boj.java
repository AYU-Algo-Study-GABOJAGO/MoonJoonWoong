package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2775_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[] apt = new int[n];

            for(int j = 0; j < n; j++) {
                apt[j] = j + 1;
            }

            for(int j = 0; j < k; j++) {
                for(int l = 1; l < n; l++) {
                    apt[l] += apt[l - 1];
                }
            }

            System.out.println(apt[n - 1]);
        }
    }

}