package met;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo<ReplaceRange> {
	
	public void inserir(String texto) throws IOException {
		//Gravação
		 FileWriter arq = new FileWriter("d:\\tati.txt", true);
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 gravarArq.println(texto); 

		 arq.close();
	}
	
	public void leitura(String texto) throws IOException {
		//Leitura
		 FileReader arqleitura = new FileReader("d:\\tati.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains(texto)) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     arqleitura.close();
	}
	
	public void atualizar(String texto, String textNew) throws IOException {
		//Atualizar
		FileReader arqleitura = new FileReader("d:\\teste.txt");
		BufferedReader lerArq = new BufferedReader (arqleitura);
	 
		String linha = lerArq.readLine(); 
		int i = 0;
		String textOld = "";
	     
		while (linha != null) {
			i++;
			
	    	if(linha.contains(texto))
	    	{
	    		textOld.replace() += textNew + "/n";
	    	}
	    	else
	    	{
	    		textOld.replace() += linha + "/n";
	    	}
	    	
	    	linha = lerArq.readLine();
		}
	     
		System.out.println(textOld);
		arqleitura.close();
	}
	
	public void excluir(String texto) throws IOException {
		//Substituir
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains(texto)) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	}
	
	public static void main(String args[]) throws Exception {
		Arquivo arq = new Arquivo();
		//arq.inserir("Tatiane");
		//arq.leitura("Tati");
		arq.atualizar("Tati","Tatiane Sararoli de Souza");
	}
}
