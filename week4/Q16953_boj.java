package week4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Q16953_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (B != A){
            String str = String.valueOf(B);

            if(A > B){
                System.out.println(-1);
                return;
            }

            if (B%2 == 0){
                B = B/2;
            }
            else if (str.charAt(str.length()-1) == '1'){
                str = str.substring(0,str.length()-1);
                B = Integer.parseInt(str);
            }
            else{
                System.out.println(-1);
                return;
            }
            cnt ++;
        }

        System.out.println(cnt+1);

    }
}