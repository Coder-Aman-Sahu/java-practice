import java.util.*;
class blockSwap{
    static void swap(int arr[],int r,int f,int s){
        for(int i=0;i<r;i++){
            int t = arr[f+i];
            arr[f+i]=arr[s+i];
            arr[s+i]=t;
            
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length,r=2;
        int i=r,j=n-r;
        if(r!=0 && r!=arr.length){
            while(i!=j){
              if(i>j){
                  swap(arr,j,r-i,r);
                  i=i-j;
              }
              else{
                  swap(arr,i,r-i,r+j-i);
                  j=j-i;
              }
            }
            swap(arr,i,r-i,r+j-i);
        }
        
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
