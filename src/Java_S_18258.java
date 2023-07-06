/*
    시간 복잡도가 O(1)이었던 문제
    처음에는 ArrayList로 배열을 만들어 풀었지만 시간초과로 실패
    ArrayList 역시 큐처럼 사용할 수 있지만 삽입 삭제가 많아서 LinkedList보다 효율이 좋지 않다.
    때문에 ArrayList를 LinkedList로 변경하여 문제 해결
    (혹은 ArrayQueue사용)
*/
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

