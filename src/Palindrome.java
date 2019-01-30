import java.sql.Array;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 136,reversedInteger = 0,OriginalInteger,remainder;
		
		OriginalInteger=num;
		
		   while(num!=0)
		   {
			   remainder=num%10;
			   
			   System.out.println(remainder);
			   reversedInteger=reversedInteger*10+remainder;
			   
			   System.out.println(reversedInteger);
			   num /=10;
			   System.out.println(num);
		   }
		
		   System.out.println(reversedInteger);
		
			// palindrome if orignalInteger and reversedInteger are equal
	        if (OriginalInteger == reversedInteger)
	            System.out.println(OriginalInteger + " is a palindrome.");
	        else
	            System.out.println(OriginalInteger + " is not a palindrome.");
		
	
	}

}
