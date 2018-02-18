import java.util.*;

public class UniqueString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a string or type Exit to stop.");
            String word = sc.next();
            if(word.equals("Exit") || word.equals("exit")){
                System.out.println("The program has been terminated.");
                break;
            }
            int answer = Check(word.toCharArray());
            if(answer == 0){
                System.out.println("The string is unique");
            }else{
                System.out.println("The string is not unique");
            }
        }
    }

    private static int Check(char Word[]) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(char c: Word){
            if(map.containsKey(c)){
                return (1);
            }
            map.put(c, 1);
        }
        return (0);
    }
}