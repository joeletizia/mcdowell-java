public class ReplaceSpaces {
  public static void main(String[] args){
    System.out.println(replaceSpaces("hel lo  "));
    System.out.println(replaceSpaces("hello"));
    System.out.println(replaceSpaces(""));
    System.out.println(replaceSpaces("the big short    "));
    System.out.println(replaceSpaces("   "));
  }

  public static char[] replaceSpaces(String str){
    char[] charArray = str.toCharArray();

    if(charArray.length == 0)
      return charArray;

    int currentIndex = indexOfLastChar(charArray);

    if(currentIndex == 0)
      return charArray;

    int trailingIndex = str.length() - 1;

    for (int iterator = currentIndex; iterator >= 0; iterator--) {
      if(charArray[iterator] == ' '){
        insertStringReplacement(charArray, trailingIndex);
        trailingIndex -= 3;
      }
      else{
        swap(charArray, iterator, trailingIndex);
        trailingIndex--;
      }
    }

    return charArray;
  }

  private static void insertStringReplacement(char[] arr, int index){
    arr[index] = '0';
    arr[index - 1] = '2';
    arr[index - 2] = '%';

    return;
  }

  private static int indexOfLastChar(char[] arr){
    int count = arr.length - 1;
    while(count >= 0 && arr[count] == ' '){
      count--;
    }

    return count;
  }

  private static void swap(char[] str, int x, int y){
    char tmp = str[x];
    str[x] = str[y];
    str[y] = tmp;

    return;
  }
}
