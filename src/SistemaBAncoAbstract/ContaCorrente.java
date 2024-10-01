package SistemaBAncoAbstract;

public class ContaCorrente extends Conta{

	public boolean sacar(double valor) {
		if(valor<=this.saldo && valor>=0) {
			this.saldo-=valor;
			return true;
		}else return false;
	}
	public boolean depositar(double valor) {
		if(valor>=0) {
			this.saldo+=valor;
			return true;
		}else return false;
	}
	 
	public boolean transferir(double valor, Conta outra) {
		if(sacar(valor)) {
			outra.depositar(valor);
			return true;
		}else return false;
	}
}