/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploprojeto;

/**
 *
 * @author antro
 */
// Deixando o comentario para avaliar...
public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    
    public Cliente(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    
    public void apresentarCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
    }

    public static void main(String[] args) {
      
        Cliente cliente1 = new Cliente("Maria Silva", "123.456.789-00", "maria@email.com", "(11) 98765-4321");
        cliente1.apresentarCliente();
    }
}

