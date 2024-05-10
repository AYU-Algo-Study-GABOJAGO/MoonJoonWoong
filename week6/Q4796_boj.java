package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4796_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int TC =1;

        while(true){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            int result = 0;

            if(L==0 && P==0 && V==0) break;

            result = V/P *L;

            if(L>=V%P) {
                result += V % P;
            }else{
                result += L;
            }

            System.out.println("Case "+ TC +": " + result);
            TC++;
        }
    }
}

