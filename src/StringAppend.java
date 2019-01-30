
public class StringAppend {
	
	public static void main (String args[])
	{
		String str= "abc";
	String	str1 =str.concat("d");
		
		System.out.println(str);
		
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer("abc");
		
		str2.append("d");
		
		System.out.println(str2);
		
	}

}
