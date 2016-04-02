public class Reverse {
  public static void main(String[] args){
    String str = "12345";

    String reversed = reverse(str);
    System.out.println(reversed);
    System.out.println(reversed.equals("54321"));

    str = "12345";
    reversed = reverseRecursive(str);
    System.out.println(reversed);
    System.out.println(reversed.equals("54321"));
  }

  private static String reverse(String str){
    char[] charArray = str.toCharArray();
    int length = str.length();

    for(int x = 0; x < length/2; x++){
      char tmp = charArray[x];
      charArray[x] = charArray[length - x - 1];
      charArray[length - x - 1] = tmp;
    }

    return new String(charArray);
  }

  private static String reverseRecursive(String str){
    int length = str.length();
    if(length == 1 || length == 0)
      return str;

    String substring = str.substring(1, str.length());
    String head = Character.toString(str.charAt(0));

    return reverseRecursive(substring) + head;
  }
}
