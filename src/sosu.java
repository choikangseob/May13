
public class sosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		int f ;
		for(n=2; n<=1000; n++) {
			
			for(f=2; f<n ; f++ ) {
				
				if(n%f==0) 	break;
				
				}if(n==f) {
					System.out.println(n+"은(는)소수입니다");
					
				
					
			}
			
		}
	}

}
