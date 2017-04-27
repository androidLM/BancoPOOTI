//classe
public class Cliente {
	//atributos
	String nome;
	String cpf;
	String agencia;
	String conta;
	double saldo;
	//construtor
	Cliente() {	
	}
	//tipoDeRetorno nomeDoMetodo (Parametros) {
	//}
	void creditar(double pCredito) {
		saldo = saldo + pCredito;
	}
	
	void debitar(double pDebito) {
		if(saldo > 0 && pDebito <= saldo) {
			saldo = saldo - pDebito;
		} 
	}
	
}
