/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.teste;

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class Teste {

   
    public static void main(String[] args) {
                
        TicketMachine tm = new TicketMachine(20); //valor do produto
        
        try {
            //Modo implementado: apenas um ticket pode ser comprado.
            
            tm.inserir(50); //insere 5 reais na maquina
            //tm.inserir(20);
            //tm.inserir(10);
            System.out.println("Saldo: " + tm.getSaldo()); //saldo
            System.out.println("");
            System.out.println("Ticket comprado!!!");
            System.out.println(tm.imprimir()); //printa o ticket comprado
            System.out.println("Troco: " + tm.getSaldo()); //saldo atual, após a compra
            System.out.println("");
            
        } catch (PapelMoedaInvalidaException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SaldoInsuficienteException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
