/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediaaluno;



/**
 * média alunos.......... 
 * @author antro
 */
public class Media_Aluno {
 public static void main(String[] args) {
       
        double[] notasAluno1 = {7.5, 8.0, 6.5};
        double[] notasAluno2 = {6.0, 7.0, 8.5};
        double[] notasAluno3 = {8.5, 9.0, 7.0};
        double[] notasAluno4 = {7.0, 7.5, 6.0};

        
        double mediaAluno1 = calcularMedia(notasAluno1);
        double mediaAluno2 = calcularMedia(notasAluno2);
        double mediaAluno3 = calcularMedia(notasAluno3);
        double mediaAluno4 = calcularMedia(notasAluno4);

        
        System.out.println("Média Aluno 1: " + mediaAluno1);
        System.out.println("Média Aluno 2: " + mediaAluno2);
        System.out.println("Média Aluno 3: " + mediaAluno3);
        System.out.println("Média Aluno 4: " + mediaAluno4);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
    
    