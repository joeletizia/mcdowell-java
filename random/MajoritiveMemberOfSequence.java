// https://www.reddit.com/r/CS_Questions/comments/met6v/an_element_occurs_more_than_n2_times_in_a/
//

import java.util.Arrays;

public class MajoritiveMemberOfSequence {
  public static void main(String[] args){
    int[] arr = {1,44,3,2,5,1,1,1,1,1,1,1,1};
    System.out.println(majoritiveMemberOfSequence(arr) == 1);
    int[] arr2 = {2,3,2,2,2,2,2,2};
    System.out.println(majoritiveMemberOfSequence(arr2) == 2);

    System.out.println(majoritiveMemberOfSequenceNoSort(arr) == 1);
    System.out.println(majoritiveMemberOfSequenceNoSort(arr2) == 2);
  }

  public static int majoritiveMemberOfSequence(int[] arr) {
    Arrays.sort(arr);
    if(arr[0] == arr[arr.length/2 + 1])
      return arr[0];
    else
      return arr[arr.length/2 +1];
  }

  public static int majoritiveMemberOfSequenceNoSort(int[] arr) {
    int currentCandidate = 0;
    int currentCandidateCount = 0;

    for(int x = 0; x < arr.length; x++) {
      if(currentCandidateCount == 0){
        currentCandidate = arr[x];
        currentCandidateCount = 1;
        continue;
      }

      if(currentCandidate == arr[x])
        currentCandidateCount += 1;
      else
        currentCandidateCount -= 1;
    }

    return currentCandidate;
  }

}

