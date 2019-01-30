
public class Arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4};
	    int b[] =  new int[10];
	    int c[][]= {{1,2,3},{3,4,1},{6,7,10}};
	    
	    
		
		for (int i=0;i<a.length;i++)
		{
					
			System.out.println(a[i]);
			
			b[i]=1;
			
			System.out.println(b[i]);
		}
			
		
		for(int i=0;i<c.length;i++)
		{
			
			for(int j=0;j<c.length;j++)
			{
			System.out.println(c[i][j]);
			}
			
		}
		
		}	


	}


