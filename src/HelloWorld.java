
public class HelloWorld {
	
	
	

	public static void main(String[] args) {
		int j = 2;
		for(j = 2; j < 100; j++);{
		
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(j) && isPrime; i ++){
			if(j%i == 0)
			{isPrime = false;}
		}
		if(isPrime){System.out.println(j);}
		
		}
		
		
		
		
		
		
		
	}

}