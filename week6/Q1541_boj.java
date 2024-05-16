package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1541_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("-");
        int result = Integer.MAX_VALUE;


        for(int i=1;i<arr.length;i++){
            String[] plus = arr[i].split("\\+");
            int tmp = 0;
            for(String s : plus){
                tmp += Integer.parseInt(s);
            }
            if(result == Integer.MAX_VALUE){
                result = tmp;
            }else{
                result -= tmp;
            }
        }
        System.out.println(result);
    }
}
