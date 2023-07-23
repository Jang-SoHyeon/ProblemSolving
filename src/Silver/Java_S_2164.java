package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_S_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<N;i++){
            queue.add(i+1);
        }
        boolean first = false; //false이면 삭제할 값 true이면 뒤로 갈 값
        while(queue.size() != 1){
            if(!first) {
                queue.remove();
                first = true;
            }
            else{
                queue.addLast(queue.poll());
                first = false;
            }
        }
        System.out.println(queue.peek());

    }
}
