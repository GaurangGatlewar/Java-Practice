import java.util.*;

public class ValidParentheses{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a String or type exit to terminate the program.");
            String input = sc.next();
            if(input.equals("exit")){
                System.out.println("The program is terminated");
                break;
            }
            int answer = valid(input.toCharArray());
            if(answer == 1){
                System.out.println("The parentheses are valid.");
            }else{
                System.out.println("The parentheses are invalid.");
            }
        }
    }

    public static int valid(char[] words){
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');

        Stack<Character> st = new Stack<Character>();
        for(char c:words){
            if(map.containsKey(c)){
                st.push(map.get(c));
            }else{
                try{
                    char temp = st.pop();
                    if(temp != c){
                        return (0);
                    }
                }catch(Exception E){
                    return (0);
                }
            }
        }

        if(st.empty()){
            return (1);
        }else{
            return (0);
        }
    }
}