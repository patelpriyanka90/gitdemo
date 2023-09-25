package Practice_Basics;

import java.util.ArrayList;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="asdfghfdasdasd";
		
		ArrayList<String> a = new ArrayList<String>();
		
		for(int i=0;i<s1.length();i++) 
		{
			int count =0;
			
			for (int j=i+1;j<s1.length();j++)
				
			{
				if(s1.charAt(i)==s1.charAt(j))
					
					
					a.add(i, s1);
				  count++;
					
			}
				
		System.out.println(count);
			
		}
			

}
	
}