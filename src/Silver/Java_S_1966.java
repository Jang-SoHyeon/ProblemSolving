package Silver;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;


public class Java_S_{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer[]> que;

        int target;

        for(int i=0; i<T; i++){
            int count = 0;  // M 문서가 몇 번째로 인쇄되는지 측정하는 count
            que = new LinkedList<>();
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                que.offer(new Integer[]{j, Integer.parseInt(st.nextToken())} );
            }
            target = que.get(M)[0];
            int current = 0;
            Loop1:
            while(!que.isEmpty() ){ //큐가 비기 전까지 반복

                boolean isNotMax = false;
                for(int next=current+1; next<que.size() ; next++){
                    if(que.get(current)[1]<que.get(next)[1]){
                        isNotMax = true;
                        break;
                    }

                }
                if(isNotMax){
                    que.offerLast(que.pollFirst());

                }
                else{
                    if(que.getFirst()[0].equals(target)){
                        count++;
                        break Loop1;
                    }
                    que.pollFirst();
                    count++;
                }

            }
            sb.append(count + "\n");
        }

        System.out.println(sb);

    }
}
