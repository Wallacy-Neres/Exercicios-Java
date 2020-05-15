package JavaExercicios;

public class ex2 {
	public static void main (String args[]) {
		int n;
		
		for(n = 1000; n < 1999; n++) {
			if(n%11 == 0 || n%11 == 5){
				System.out.println("Número " + n + " Divisivel por 11 ou com resto 5");
			}
			
		}
		
		
	}
}
