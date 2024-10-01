package SistemaBAncoAbstract;

public class ContaLimite extends Conta{
	private double limite=500;

	public boolean sacar(double valor) {
		double limiteTotal = this.saldo+limite;
		if(valor<=limiteTotal) {
			limiteTotal-=valor;
			
			if(limiteTotal>limite) {
				this.saldo = limiteTotal-limite;
			}else {
				limite=limiteTotal;
				this.saldo=0;
			}
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
