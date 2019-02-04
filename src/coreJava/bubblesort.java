package coreJava;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  arr[]= {100,80,50,60,10,5,2,1},Temp;
				
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Before Bubble sort is"+arr[i]);
		
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				 System.out.println("1 Bubble sort is"+arr[i]);
				 
				 System.out.println("2 Bubble sort is"+arr[j]);
				 Temp=arr[j];
				 arr[j]=arr[i];
				 arr[i]=Temp;
			 }
		 }
		
		}
		
		for(int k=0;k<arr.length;k++)
		{
		
		System.out.println("After Bubble sort"+arr[k]);

	}

}
}
