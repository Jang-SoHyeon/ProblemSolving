package Silver;

//최대 힙 구현함
//(주의!)ArrayList에 null을 넣으면 ArrayList.size() = 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Java_S_11279{
    private static ArrayList<Integer> arr;
    public static void MyHeap(){
        arr = new ArrayList<>();
        arr.add(null);
    }

    public static void Insert(int val){
        arr.add(val);
        int index = arr.size()-1;
        while(index > 1) {
            if(arr.get(index) > arr.get(index/2)){
                int tmp = arr.get(index/2);
                arr.set(index/2,arr.get(index));
                arr.set(index,tmp);
//                System.out.println("removeTmp "+arr);
            }
            index = index/2;
        }

    }

    public static int delete(){
        if(arr.size()==1){ //비었을 때
            return 0;
        }
        else if(arr.size() == 2){ //값이 하나일 때
            return arr.remove(1);
        }
        else if(arr.size() == 3){ // 값이 두 개일 때
            int result = arr.get(1);
            arr.set(1, arr.remove(arr.size()-1));
            return result;
        }
        else{ //값이 세 개 이상일 때
            int result = arr.get(1);
            arr.set(1,arr.remove(arr.size()-1));
//            System.out.println("remove(1) "+arr.get(1));

            int lastIndex = arr.size()-1;
            int index = 1;
            while(2*index <= lastIndex){
//                System.out.println(arr);
                if(2*index+1>lastIndex){ //자식 수가 2개가 아닐 때
                    int max = arr.get(2*index); //max는 자연히 하나
                    if(arr.get(index)<max){
                        int tmp = arr.get(index);
                        arr.set(index,max);
                        arr.set(2*index,tmp);
                    }
                    index = 2*index;

                }
                else{
                    int max = arr.get(2*index)>arr.get(2*index+1)?arr.get(2*index):arr.get(2*index+1);
                    int maxIndex = arr.get(2*index)>arr.get(2*index+1)?2*index:2*index+1;

                    if(arr.get(index)<max){
                        int tmp = arr.get(index);
                        arr.set(index,max);
                        arr.set(maxIndex,tmp);
                    }
                    index = maxIndex;
                }


            }

            return result;
        }
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
//        long start = System.currentTimeMillis();

        MyHeap();
        for (int i = 0; i < N ; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                sb.append(delete()+"\n");
            }
            else {
                Insert(x);
            }

        }
        System.out.println(sb);
//        long end = System.currentTimeMillis();
//        System.out.println((end-start)/1000.0);


    }
}
