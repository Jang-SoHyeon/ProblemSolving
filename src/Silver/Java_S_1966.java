package Silver;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;


public class Java_S_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer[]> que;

        int target; //M 문서를 지칭

        for(int i=0; i<T; i++){
            int count = 0;  // M 문서가 몇 번째로 인쇄되는지 측정하는 count
            que = new LinkedList<>();
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                que.offer(new Integer[]{j, Integer.parseInt(st.nextToken())} ); //j index에 st.nextToken()을 넣겟다.
            }
            target = que.get(M)[0]; //M index의 문서가 계속 변하기 때문에 M index에 있는 문서를 target으로 고정
            int current = 0;
            Loop1:
            while(!que.isEmpty() ){ //큐가 비기 전까지 반복

                boolean isNotMax = false; //첫 번째 문서의 우선순위가 최댓값이 아님을 말함(즉, 출력되지 않고 뒤로 가야할 문서)
                for(int next=current+1; next<que.size() ; next++){ //1부터 시작
                    if(que.get(current)[1]<que.get(next)[1]){ //que 전체 문서 중에 첫 번째 문서의 우선순위보다 큰 것이 있다면 출력x 뒤로 갈 것
                        isNotMax = true;
                        break;
                    }

                }
                if(isNotMax){
                    que.offerLast(que.pollFirst());
                }
                else{ // 첫 번째 문서의 우선순위가 최댓값일 경우 출력, count +1
                    if(que.getFirst()[0].equals(target)){ //만약 출력할 문서가 target 문서와 동일하면 while문 탈출
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
