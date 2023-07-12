package Silver;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class Java_S_10866{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String str;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> que = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            str = st.nextToken();
            switch(str){
                case "push_front" :
                    int num = Integer.parseInt(st.nextToken());
                    que.addFirst(num);
                    break;

                case "push_back" :
                    int num2 = Integer.parseInt(st.nextToken());
                    que.addLast(num2);
                    break;

                case "front" :
                    if (que.size()>0)
                        sb.append(que.getFirst()+"\n");
                    else
                        sb.append(-1+"\n");
                    break;

                case "back" :
                    if(que.size()>0)
                        sb.append(que.getLast()+"\n");
                    else
                        sb.append(-1+"\n");
                    break;

                case "size":
                    sb.append(que.size()+"\n");
                    break;

                case "empty":
                    if(que.size()>0) {
                        sb.append(0+ "\n");
                    }
                    else{
                        sb.append(1+"\n");
                    }
                    break;

                case "pop_front":
                    if(que.size()==0){
                        sb.append(-1+"\n");

                    }
                    else {
                        sb.append(que.removeFirst()+"\n");
                        // arr.remove(0);
                    }
                    break;
                case "pop_back" :
                    if(que.size()==0){
                        sb.append(-1 + "\n");
                    }
                    else{
                        sb.append(que.removeLast()+"\n");
                    }
                    break;
            }

        }

        System.out.println(sb);

    }
}