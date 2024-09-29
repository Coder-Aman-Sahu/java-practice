

public class LeadersInArray{
	public static void main(String[] args) {
		int arr[]= {16,17,4,3,5,2};
        int n= arr.length, i;
		int max= arr[n-1];

		for(i=n-1;i>=0;i--){
		    max= Math.max(max, arr[i]);

		    if(max == arr[i])
		        System.out.print(max+" ");
		}
	}
}
