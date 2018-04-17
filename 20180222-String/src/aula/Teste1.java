package aula;

public class Teste1 {
	public static void main (String[] args) {
		String str = "Isto é uma String do Java";
		String [] palavras = str.split (" ");
		System.out.println(palavras [1]);
		
		int i = str.indexOf ("uma");
		System.out.println(i);
		
		
		if (str.startsWith ("Olá") || str.endsWith ("Mundo!")) {
		}
		System.out.println(str);
		
		
		str = str.trim ();
		System.out.println(str);
		
		
		str = str.replace ('a','@');
		System.out.println(str);
		
		
		str = str.replaceAll ("String","Cadeia de Caracteres");
		System.out.println(str);
		
	}
	
}