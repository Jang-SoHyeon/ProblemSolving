package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_S_16139_again {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());
//        int[] alphabetTmp = new int[26];
        int[][] alphabetCount = new int[26][S.length()];
        for(int i=0; i<S.length(); i++){

        }
        for(int i=0; i<q; i++){
            st = new StringTokenizer(br.readLine()," ");
            char alphabet = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int count = 0;
            for(int j=start; j<=end; j++){
                if(S.charAt(j) == alphabet){
                    count++;
                }
            }
            sb.append(count+"\n");
        }

        System.out.println(sb);
    }
}
