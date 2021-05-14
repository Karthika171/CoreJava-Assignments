package test;

public class bub {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
		
		    for(int j=0;j<a.length-1;j++)
		    {
		    	if(a[j]>a[j+1])
		    	{
		       temp=a[j];
		       a[j]=a[j+1];
		       a[j+1]=temp;
		    	}
		    }
		    
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			
			System.out.print(" "+a[i]);
		}
		
		

	}

}