package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Java_S_1021{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Deque<Integer> que = new ArrayDeque<>();
        Deque<Integer> cpyQue = new ArrayDeque<>();
        int count = 0; //출력할 값
        int countLeft  ; // 왼쪽부터 해당 값까지 몇 개인지
        int countRight  ; // 오른쪽부터 해당 값까지 몇 개인지

        for(int i=0; i<N; i++){
            que.add(i+1);
        }
        cpyQue.addAll(que);
//        System.out.println(cpyQue);

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int find = Integer.parseInt(st.nextToken());
            countLeft = countRight =  0;

            while(que.getFirst() != find){
                que.addLast(que.removeFirst());
                countLeft++;
            }
            while(cpyQue.getLast() != find){
                cpyQue.addFirst(cpyQue.removeLast());
                countRight++;
            }
            if(countLeft <= countRight){
                count += countLeft;
                que.removeFirst();
                cpyQue.clear();
                cpyQue.addAll(que) ;
            }
            else{
                count += countRight+1;
                cpyQue.removeLast();
                que.clear();
                que.addAll(cpyQue) ;
            }


        }
        System.out.println(count);


    }
}