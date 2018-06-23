package met;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	public void inserir(String texto) throws IOException {
		//Gravação
		 FileWriter arq = new FileWriter("d:\\teste.txt", true);
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 gravarArq.println(texto); 

		 arq.close();
	}
	
	public void atualizar(String texto, String textNew) throws IOException {
		//Leitura
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     String textOld = "";
	     
	     while (linha != null) {
	    	i++;
	    	if(linha.contains(texto))
	    	{
	    		textOld += textNew = "/n";
	    	}
	    	else
	    	{
	    		textOld += linha = "/n";
	    	}
	    	
	    	linha = lerArq.readLine();
	     }
	     
	     System.out.println(textOld);
	     arqleitura.close();
	}
	
	public static void main(String args[]) throws Exception {
		Arquivo arq = new Arquivo();
		arq.atualizar("Anderson", "Maria");
		//arq.leitura("Jeferson Roberto de Lima");
	}
}
