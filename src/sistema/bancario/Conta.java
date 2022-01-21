/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.bancario;

/**
 *
 * @author Wanderley Patrício
 */
public class Conta implements IConta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIA = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    void conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIA++;
    }

    @Override
    public double saldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        if(saldo > valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
}
