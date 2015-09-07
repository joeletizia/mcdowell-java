import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class UniqueChars {
  public static void main(String[] args){
    System.out.println(uniqueChars("hello") == false);
    System.out.println(uniqueChars("asdf") == true);
    System.out.println(uniqueChars("") == true);
    
    System.out.println(uniqueCharsNoMap("hello") == false);
    System.out.println(uniqueCharsNoMap("asdf") == true);
    System.out.println(uniqueCharsNoMap("") == true);
  }

  public static boolean uniqueChars(String str) {
    Map<String, Boolean> hash = new HashMap<String, Boolean>();

    for(char ch : str.toCharArray()){
      Character c = new Character(ch);

      if(hash.get(c.toString()) != null)
        return false;
      else {
        hash.put(c.toString(), true);
      }
    }
    return true;
  }

  public static boolean uniqueCharsNoMap(String str) {
    char[] ar = str.toCharArray();
    Arrays.sort(ar);

    for(int x = 0; x < str.length() - 1; x++){
      if(ar[x] == ar[x+1])
        return false;
    }

    return true;
  }
}
