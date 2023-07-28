package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_B_10811{
    public static void reverseBaskets(int[] basket, int i, int j){
        while(i<j){
            int tmp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = tmp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for(int i=0; i<N;i++){
            basket[i] = i+1;
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            reverseBaskets(basket,first,second);

        }
        for(int i=0; i<N; i++){
            System.out.print(basket[i]+" ");
        }

    }
}
