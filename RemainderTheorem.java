
public class RemainderTheorem {
	public static void main(String[] args){
		int a[]={2,3,1}, m[]={3,4,5},n=a.length,Mi[]= new int[n],inv[]=new int[n];
		int pro=1,x=0;
		int i,j;
		
		for(i=0;i<n;i++)
		 pro=pro*m[i];
		
		for(i=0;i<n;i++)
		Mi[i]=pro/m[i];

		for(i=0;i<n;i++){
		 for(j=1;j<m[i];j++)
		  if((Mi[i]*j)%m[i]==1)
		   inv[i]=j;}
		   
		 for(i=0;i<n;i++)
		  x=x+(a[i]*Mi[i]*inv[i]);
		 
		 x=x%pro;
		 System.out.println(x);
	}
}
