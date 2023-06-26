package org.arry;

public class averageElement
{
	public static void main(String[] args) 
	{
	int	  a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	double avg=0;
	
	for(int i=0; i<a.length; i++)
	{
		avg+=a[i];
	}
	System.out.println(avg/a.length);
		
	}

}
