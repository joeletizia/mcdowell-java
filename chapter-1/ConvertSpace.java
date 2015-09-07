import java.util.Arrays;

public class ConvertSpace {
  public static void main(String[] args){
    char[] value = convertSpace("mr john smith    ".toCharArray());
    System.out.println(Arrays.equals(value, "mr%20john%20smith".toCharArray()));

    char[] value1 = convertSpace("m".toCharArray());
    System.out.println(Arrays.equals(value1, "m".toCharArray()));
  }

  public static char[] convertSpace(char[] str){
    int len = str.length - 1;

    int indexLastNonSpace = lastNonSpace(str);

    for(int i = indexLastNonSpace; i >= 0 ; i--) {
      Character c = new Character(str[i]);
      if(c.toString().equals(" ")){
        str[len] = "0".charAt(0);
        str[len - 1] = "2".charAt(0);
        str[len - 2] = "%".charAt(0);
        len -= 3;
      }
      else{
        str[len] = str[i];
        len -= 1;
      }
    }

    return str;
  }

  private static int lastNonSpace(char[] str){
    int length = str.length;

    for(int x = length -1; x >= 0; x--){
      if(str[x] == " ".charAt(0))
        continue;
      else
        return x;
    }

    return 0;
  }
}
