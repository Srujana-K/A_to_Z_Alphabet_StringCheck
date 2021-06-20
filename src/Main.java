import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean check = checkForAlphabets(s);
        if(check)
            System.out.println("Given String has all alphabets from a-z");
        else
            System.out.println("Given String doesn't have all alphabets from a-z");
    }
    public static boolean checkForAlphabets(String s){
        boolean result = true;
        if(s.length()<26)
            result = false;
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Boolean> hm = new HashMap<Character, Boolean>();

        //Initializing Hashmap
        for(int i=0;i<alphabets.length();i++){
            hm.put(alphabets.charAt(i),false);
        }

        //Updating Hashmap
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isLetter(ch))
                hm.put(ch,true);
        }

        //Checking Hashmap
        for(Character ch:hm.keySet()){
            if(!hm.get(ch)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
