
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "This Strings is for Testing";
		int i; 
		String reverse="";
		for(i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
		} 
	System.out.println(reverse);	
		
		StringBuffer buffer = new StringBuffer(str);
		StringBuffer reverses =	buffer.reverse();
		System.out.println(reverse);
		
		
		String str1 ="This Strings is for Testing";
		
		String str2 ="This Strings is for Testing";
		
		String str3=" ";
		str3=str2.replace("S", " ");
		
		System.out.println("new string is " + str3);
		//find word in a String
		int j = str1.indexOf("rat");
		System.out.println("Word is  Presnt at"+ j);
		
		 if (j==-1)
		 {
			 System.out.println("Word is not Presnt");
			 
		 }
		 
		 else
		 {
			 System.out.println("Word is  Presnt at"+ j);
		 }
			 
				
}
	
}

