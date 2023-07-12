package Silver;

import java.io.*;
import java.util.*;
public class Java_S_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
//        sb.append("<");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int j = 1;
        Deque<Integer> que = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            que.add(i+1);
        }
        while(que.size()>1){
            if(j != K ){
                int tmp = que.pollFirst();
                que.addLast(tmp);
                j++;
            }
            else{
                sb.append(que.pollFirst()+", ");
                j = 1;
            }
        }
        sb.append(que.pollFirst());
        System.out.println("<"+sb+">");

    }
}
