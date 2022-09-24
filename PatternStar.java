package Class_6;

public class PatternStar {

	public static void main(String[] args) {
		 int n = 8;
	        for(int i=0; i<n; i++){
	        	
	        	for(int j = 0; j<15; j++){
	                System.out.print(" ");
	            }

	            for(int j=n-i; j>0; j--){
	               
	                System.out.print(" ");
	            }
	            for(int k = 0; k<=i; k++){
	                System.out.print("* ");
	            }
	            System.out.println();  
	        }
	        
	        for(int i=0; i<n; i++) {
	        	
	        	for(int j=0; j<=i; j++){
		               
	                System.out.print(" ");
	            }
	        	 
		         for(int k =22-i; k>0; k--){
		                System.out.print("* ");
		        }
		         
	        	System.out.println("");
	        }
//	        System.out.println("       * * * * * * * * * * * * * * * * ");
//	        System.out.println("        * * * * * * * * * * * * * * * * ");
//	        System.out.println("        * * * * * * * *  * * * * * * * * ");
//	        
	        for(int i =0; i<=7; i++){
	        	for(int k=6-i; k>=0; k--) {
	        		System.out.print(" ");
	        	}
	        	for(int k=6-i; k>=0; k--) {
	        		System.out.print("* ");
	        	}
	        	//last
	        	for(int k = 0; k<=i; k++){
	                System.out.print("      ");
	            }
	        	
	        	for(int k=6-i; k>=0; k--) {
	        		System.out.print("* ");
	        	}
	        	
	            System.out.println();
	        }

	}

}
