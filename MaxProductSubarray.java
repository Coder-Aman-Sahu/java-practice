
public class MaxProductSubarray{
 public static void main(String []args){
    int arr[]={-1,5,0,4,3,-2}; //{2,-5,0,-1,4,-3};
    int left = 1, right = 1, max = arr[0];

    for (int i = 0; i < arr.length; i++){
      left = left * arr [i];
      right = right * arr[arr.length-1-i];
      max = Math.max (max, Math.max (left, right));
	  if(left==0)  left= 1;
	  if(right==0) right= 1;
      }

      System.out.print(result);
  }
}