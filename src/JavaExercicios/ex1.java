package JavaExercicios;

public class ex1 {
	public static void main (String args[]) {
		float soma = 0;
		int n;
		for(n = 1; n <= 500; n++) {
			if((n%2 != 0) && (n%3 == 0)) {
				soma = soma + n;
				
			}
			
		}
		
		System.out.println(soma);
	}
}
