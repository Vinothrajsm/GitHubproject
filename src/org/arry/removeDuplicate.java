package org.arry;

public class removeDuplicate {
	public static void main(String[] args) {
		
		int a[]={10,10,20,50,60,80,60,50};
		
		int length= a.length;
		
		int j=0;
		
		for(int i=0; i<length-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		}
		a[j++]=a[length-1];
		
		for(int k=0; k<j; k++)
		{
			System.out.println(a[k]);
		}
		
	}
}



