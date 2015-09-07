import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Permutation {
  public static void main(String[] args){
    System.out.println(isPerm("hello", "lleho") == true);
    System.out.println(isPerm("hello", "llo") == false);
    System.out.println(isPerm("hello", "") == false);
  }

  public static boolean isPerm(String str1, String str2){
    Map<String, Integer> map1 = mapString(str1);
    Map<String, Integer> map2 = mapString(str2);

    return map1.equals(map2);
  }

  private static Map<String, Integer> mapString(String str){
    Map<String, Integer> map = new HashMap<String, Integer>();

    for(char c : str.toCharArray()){
      String character = new Character(c).toString();
      Integer value = map.get(character);

      if(value == null)
        map.put(character, 1);
      else
        map.put(character, value + 1);
    }

    return map;
  }
}
