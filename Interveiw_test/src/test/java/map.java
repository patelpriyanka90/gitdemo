
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
	int n = 10;
	StringBuffer BN = new StringBuffer();
	while(n>0)
	{
	int r = n%2;

	n = n/2;
	BN = BN.append(r);
	
	}
	
	BN = BN.reverse();
	System.out.println(BN);
	
	}
}
