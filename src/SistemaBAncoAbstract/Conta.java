package SistemaBAncoAbstract;

public abstract class Conta {
	protected int nConta;
	protected String titular;
	protected double saldo;

	public abstract boolean sacar(double valor);

	public abstract boolean depositar(double valor);

	public abstract boolean transferir(double valor,Conta outra);
	
	

	public int getnConta() {
		return nConta;
	}

	public void setnConta(int nConta) {
		this.nConta = nConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [nConta=" + nConta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

}
