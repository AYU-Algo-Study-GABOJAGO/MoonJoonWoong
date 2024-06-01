package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        int card[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int sang[] = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            sang[i] = Integer.parseInt(st.nextToken());
        }

        int result[] = new int[M];

        Arrays.sort(card);
        for(int i=0;i<M;i++){
            int low = 0, high = card.length-1;
            while ( low <= high ){
                int mid = (low+high)/2;
                if(card[mid] == sang[i]){
                    result[i] = 1;
                    break;
                }else if( card[mid] < sang[i]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

        for(int i=0;i<M;i++){
            System.out.print(result[i]+" ");
        }
    }
}
