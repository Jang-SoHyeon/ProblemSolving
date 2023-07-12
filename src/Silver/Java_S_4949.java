package Silver;/*
    if(stack.size()>0&&stack.peek()=='[')과
    if(stack.peek()=='['&&stack.size()>0)의 차이와
    StringTokneizer를 쓰면 "." 전에 분류가 되어서 .을 종료 조건으로 하려면 아래와 같이 써야된다는 것을 알았다.
     String checking = br.readLine();
     if(checking.equals("."))
         break;
     else {
         st  = new StringTokenizer(checking,".");
     }
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_S_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String checking; //"."인지 체크하는 String
        StringTokenizer st;
        String s;
        Stack<Character> stack = new Stack<>();

        Loop1:
        while(true){
            stack.clear();
            checking = br.readLine();
            if(checking.equals("."))
                break;
            else {
                st  = new StringTokenizer(checking,".");
                s = st.nextToken();
                for(int i=0; i<s.length(); i++){
                    if(s.charAt(i)=='('){
                        stack.push('(');
                    }
                    else if(s.charAt(i)=='['){
                        stack.push('[');
                    }

                    else if(s.charAt(i)==']'){
                        if(stack.size()>0&&stack.peek()=='[')
                            stack.pop();
                        else  {
                            stack.push('n');
                            break;
                        }

                    }
                    else if(s.charAt(i)==')') {
                        if (stack.size()>0&&stack.peek() == '(')
                            stack.pop();
                        else {
                            stack.push('n');
                            break;

                        }
                    }

                }
                if(stack.size()==0){
                    sb.append("yes"+"\n");
                }
                else{
                    sb.append("no" + "\n");
                }
            }

        }

        System.out.println(sb);

    }
}