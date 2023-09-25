package Practice_Basics;

public class reversesentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="Avi is my love";
		String s2= "";
		
		String[] s3 = s1.split(" ");
		  
		       for(int i=0;i<s3.length;i++)
	       { 
		    	   s2=s3[i]+' '+s2;
		    	   
		    	   }
		   	System.out.print(s2);    
	}

}