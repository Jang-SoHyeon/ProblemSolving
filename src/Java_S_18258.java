//시간복잡도가 o(1)인 것이 문

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class Java_S_18258{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String str;
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> arr = new LinkedList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            str = st.nextToken();
            switch(str){
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    arr.add(num);
                    break;

                case "front" :
                    if (arr.size()>0)
                        sb.append(arr.get(0)+"\n");
                    else
                        sb.append(-1+"\n");
                    break;

                case "back" :
                    if(arr.size()>0)
                        sb.append(arr.get(arr.size()-1)+"\n");
                    else
                        sb.append(-1+"\n");
                    break;

                case "size":
                    sb.append(arr.size()+"\n");
                    break;

                case "empty":
                    if(arr.size()>0) {
                        sb.append(0+ "\n");
                    }
                    else{
                        sb.append(1+"\n");
                    }
                    break;

                case "pop":
                    if(arr.size()==0){
                        sb.append(-1+"\n");
                        ;
                    }
                    else {
                        sb.append(arr.get(0)+"\n");
                        arr.remove(0);
                    }
                    break;
            }

        }

        System.out.println(sb);

    }
}

