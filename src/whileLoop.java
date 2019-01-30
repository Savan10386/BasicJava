
public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int a[]= {1,2,3,4,5,6,7};
		while ( i <a.length)
		{
		System.out.println(a[i]);
		i++;
		}
		
		do {
			System.out.print('*');
			System.out.println(' ');
			j++;
		}while (j<=5);
			
}
}