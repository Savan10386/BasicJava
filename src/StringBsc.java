
public class StringBsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String a="abc";
	String  b= "abc";
   
    
    
    if(a==b)
    {
			
      System.out.println("Matched");
	}
    
    else
    {
    	System.out.println("UmMatched");
    }
    
    if(a.equals(b))
    {
		
    	System.out.println("Matched");

	}
    
    else
    {
    	System.out.println("UmMatched");
    }
    
  String  c=new String("abc");
    if(a==c)
    {
		
    	System.out.println("Matched");

	}
    
    else
    {
    	System.out.println("UmMatched");
    }
    
    if(a.equals(c))
    {
		
    	System.out.println("Matched");

	}
    
    else
    {
    	System.out.println("UmMatched");
    }
    
    
    //String last appreances
    
    String s1="The String for Testing";
    
     int n =  s1.lastIndexOf("String");
     
     System.out.println(n);
     
     String s2 = s1.replace("s", "");
     
     System.out.println(s2);
     
     String s4="The String for Testing";
     
     String s3 = "";

     for (int i=s4.length()-1;i>0;i--)
     {
    	 
    	 s3 = s3+s4.charAt(i);
    	  
       }
     
     System.out.println("Reverse str is "+s3);
    	 
   
}
}
