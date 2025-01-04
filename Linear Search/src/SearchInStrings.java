import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Naman";
        char target = 'm';
        System.out.println(search2(name,target));
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name);


    }

    static boolean search2(String str, char tar){
        if(str.isEmpty()){
            return false;
        }
        for(char ch: str.toCharArray()){
            return true;
        }
        return false;
    }

    static boolean search(String str,char tar){
        if(str.isEmpty()){
            return false;
        }
        for(int i = 0; i<str.length(); i++){
            if(tar == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
