
public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		if (args.length == 0) {
			System.out.println("Please enter an integer number");
			System.exit(0);
		}
		
		else {
			count = Integer.parseInt(args[0]);
		}
		System.out.println("Using For Loop :");
		for(int i = 1; i <= count; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("Using While Loop :");
		int i = count, j;													
		while(i >= 1){
		    j = i;
		    while(j <= count){
		    	System.out.print("*");
		        j++;
		    }
		    i--;
		    System.out.println(" ");
		}

	}

}
