package stringtopic.methodstopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{	
		int no1,no2;

		no1 =10;
		no2=20;
		
		String value1 = String.valueOf(no1);
		String value2 = String.valueOf(no2);
		
		System.out.println(value1+value2);
		
		
//		String s1=" java point ";  
//		String s2 = s1.trim();
//		System.out.println(s1.length() + " " +s2.length());
		
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());

//		char n[] = s1.toCharArray();
//		for (int i = 0; i < n.length; i++) 
//		{
//			System.out.println(n[i]);
//		}
		
		
//		System.out.println(s1.substring(2,4));//returns va  
//		System.out.println(s1.substring(2));//returns vatpoint  
		
//		String s1="java string split method by javatpoint";  
//		String[] words = s1.split("\\s");//splits the string based on whitespace  
//		//using java foreach loop to print elements of string array  
//		for ( String value : words) 
//		{
//			System.out.println(value);
//		}
		
		
		
//		String s1="javatpoint is a very good website";  
//		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
//		System.out.println(replaceString); 
		
//		String s1="this is index of example";//there are 2 's' characters in this sentence  
//		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
//		System.out.println(index1);//6  
		
		
//		String joinString1 = String.join("-","welcome","to","javatpoint");  
//		System.out.println(joinString1);  
		
		
//		String name1=null;
//		System.out.println(name1.isEmpty());
//		String name1="royal";
//		String name2=new String("royal").intern();
//		System.out.println(name1==name2);
		
		
		
//		String s1="this is index of example";  
//		//passing substring  
//		int index1=s1.indexOf("is");//returns the index of is substring  
//		int index2=s1.indexOf("index");//returns the index of index substring  
//		System.out.println(index1+"  "+index2);//2 8  
//		//passing substring with from index  
//		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
//		System.out.println(index3);//5 i.e. the index of another is  
//		//passing char value  
//		int index4=s1.indexOf('s');//returns the index of s char value  
//		System.out.println(index4);//3  
		
//		 String str = new String("hello javatpoint how r u");  
//		 char[] ch = new char[10];  
//	     str.getChars(6, 17, ch, 0);  
//	     System.out.println(ch);  
		
//		String name1="abcd";
//		
//		byte b[] = name1.getBytes();// ASCII
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
//		String name="sonoo";  
//		String sf1 = String.format("name is %s",name);  
//		String sf2=String.format("value is %f",32.33434);  
//		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
//		System.out.println(sf1);  
//		System.out.println(sf2);  
//		System.out.println(sf3);  
		
		
		
//		String name1 = "admin";
//		String name2 = "ADMIN";

//		System.out.println(name1.equalsIgnoreCase(name2));
		
		
		
//		String s1="java by javatpoint";  
//		System.out.println(s1.endsWith("t"));  
//		System.out.println(s1.endsWith("Pint"));  
		
//		String name="what do you know about me";  
//		System.out.println(name.contains("do you know")); // true 
//		System.out.println(name.contains("about"));// true  
//		System.out.println(name.contains("hello"));// false 
		
		
		
//		String name1 = "royal";
//		String name2 = "techno";
//		System.out.println(name1.concat(name2));
		
		
//		System.out.println(name1.compareTo(name2));// same --0 , 
		
		
		
//		for (int i = 0; i < name.length(); i++) 
//		{
//			System.out.println(name.charAt(12));
//		}
	}
}
