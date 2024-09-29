import java.util.*;
public class BalancedParanthesis{

        private static boolean isValidParanthesis(String str){
            Stack <Character> stk = new Stack<>();
            char [] ch = str.toCharArray();
            for(char c : ch){
                if(c == '{' || c == '(' || c == '['){
                    stk.push(c);
                }

                else if(stk.isEmpty() || !comparePara(stk.pop(), c)){
                  return false;
                }
            }
            return stk.isEmpty();
        }

        private static boolean comparePara(char pop, char d){
            if((pop == '{' && d == '}' )|| (pop == '(' && d == ')' )|| (pop == '[' && d==']')){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if(isValidParanthesis(str))
            {
                System.out.println("Valid Para");
            }
            else{
                System.out.println("Not Valid");
            }

            sc.close();

    }
}