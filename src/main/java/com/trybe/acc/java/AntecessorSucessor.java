package com.trybe.acc.java;

import java.util.Scanner;

/** Imprime na tela o numero antecessor e o sucessor. */
public class AntecessorSucessor {

  /** Ler a entrada de um número pelo console. */
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um número:");
    int numero = scan.nextInt();
    int antecessor = numero - 1;
    int sucessor = numero + 1;
    
    scan.close();
        
    StringBuilder frase = stringBuilder
                                        .append("O número ")
                                        .append(numero)
                                        .append(" tem ")
                                        .append(antecessor)
                                        .append(" como seu antecessor e ")
                                        .append(sucessor)
                                        .append(" como seu sucessor.");

    System.out.println(frase);
  }
}
