package calculos;

public class FuncoesMatematicas {
	public double soma(double a, double b) {
		return a+b;
	}
	public double subtrai(double a, double b) {
		return a-b;
	}
	public double multiplica(double a, double b) {
		return a*b;
	}
	public double divide(double a, double b) {
		return a/b;
	}
	public double maismenos(double a) {
		return a-a-a;
	}
	public double raiz(double a) {
		return Math.sqrt(a);
	}
	public double porc(double a, double b) {
		return a*(b/100);
	}
	public double fracao(double a) {
		return 1/a;
	}

}
