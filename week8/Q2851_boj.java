package week8;

import java.io.*;

public class Q2851_boj {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum_min = 0;
        int sum_max = 0;
        int result = 0;
        boolean flag = false;
        int count = 0;

        for(int i=0;i<10;i++){
            int n = Integer.parseInt(br.readLine());
            count++;
            System.out.println(count);
            sum_max += n;

            if(sum_max >= 100 && !flag){
                flag = true;
                result = calculate(sum_max, sum_min);
                sum_min += n;
            }

            sum_min += n;
        }
        if(flag == false){
            result = sum_max;
        }
        System.out.println(result);
    }

    public static int calculate(int x, int y){
        if((x-100)==(100-y)){
            return x;
        }else if((x-100)>(100-y)){
            return y;
        }else{
            return x;
        }
    }
}
