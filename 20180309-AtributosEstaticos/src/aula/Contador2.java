package aula;

public class Contador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c= new Contador();
		c.incrementar();
		System.out.println( Contador.count );
		Contador.count++;
		System.out.println( c.count );
	}

}
