package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 정렬 복습하기
public class Java_S_20920{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String,Integer> words = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.length()<M){
                continue;
            }
            int count = words.getOrDefault(str,0);
            words.put(str,count+1);
        }
        List<String> keySet = new ArrayList<>(words.keySet());
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int c1 = words.get(o1);
                int c2 = words.get(o2);
                if(c1 == c2){
                    if(o1.length()==o2.length()){
                        return o1.compareTo(o2);
                    }
                    return o2.length() - o1.length();

                }
                return c2 - c1;
            }
        });

        for(String key : keySet){
            sb.append(key + "\n");
        }
        System.out.println(sb);


    }
}
