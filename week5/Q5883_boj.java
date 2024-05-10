package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5883_boj {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int q[] = new int[10];
        int arr[] = new int[];

        for(int i=0;i<q.length;i++){
            q[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for(int i=0;i<6;i++){
            for(int j=i+1;j<7;j++){
                for(int k=j+1;k<8;k++){
                    for(int l=k+1;l<9;l++){
                        for(int n=l+1;n<10;n++){

                            arr[0] = i;
                            arr[1] = j;
                            arr[2] = k;
                            arr[3] = l;
                            arr[4] = n;

                            count++;

                            for(int d=0;d<3;d++){
                                if(q[arr[d]] == q[arr[d+1]] && q[arr[d]] == q[arr[d+2]]){
                                    count--;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
        arr = new int[6];

        for(int e=0;e<5;e++){
            for(int i=e+1;i<6;i++){
                for(int j=i+1;j<7;j++){
                    for(int k=j+1;k<8;k++){
                        for(int l=k+1;l<9;l++){
                            for(int n=l+1;n<10;n++){

                                count++;

                                arr[0] = e;
                                arr[1] = i;
                                arr[2] = j;
                                arr[3] = k;
                                arr[4] = l;
                                arr[5] = n;

                                for(int d=0;d<4;d++){
                                    if(q[arr[d]] == q[arr[d+1]] && q[arr[d]] == q[arr[d+2]]){
                                        count--;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
        arr = new int[7];

        for(int u=0;u<4;u++){
            for(int e=u+1;e<5;e++){
                for(int i=e+1;i<6;i++){
                    for(int j=i+1;j<7;j++){
                        for(int k=j+1;k<8;k++){
                            for(int l=k+1;l<9;l++){
                                for(int n=l+1;n<10;n++){

                                    arr[0] = u;
                                    arr[1] = e;
                                    arr[2] = i;
                                    arr[3] = j;
                                    arr[4] = k;
                                    arr[5] = l;
                                    arr[6] = n;

                                    count++;

                                    for(int d=0;d<5;d++){
                                        if(q[arr[d]] == q[arr[d+1]] && q[arr[d+1]] == q[arr[d+2]]){
                                            count--;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
