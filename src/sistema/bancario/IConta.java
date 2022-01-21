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
public interface IConta {
    
    double saldo();
    
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(Conta contaDestino, double valor);
}
