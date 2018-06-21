package classes;

public class Empregado extends Pessoa{
    
    private String endereco;
    private float salario;
    
    public Empregado(String nome)
    {
        this.setNome(nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
        
      public String exibirDados(){
        System.out.println ("Dados do Empregado:");
        System.out.println ("Nome: " + this.getNome());
        System.out.println ("CPF: " + this.getCpf());
        System.out.println ("Idade: " + this.getIdade());
        System.out.println ("Endereço: " + this.getEndereco());
        System.out.println ("Salário: " + this.getSalario());
        return null;
    }
      
      public void atualizarDados(){
          this.setNome("Tatiane Sararoli");
          this.setCpf("29845915850");
          this.setIdade(36);
          this.setEndereco("Avenida Águia de Haia");
          this.setSalario(50000);
      }
    
}
