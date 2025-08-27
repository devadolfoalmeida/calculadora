package com.codewithadolfo;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

       // System.out.print("Digite o primeiro número: ");
       // double num1 = scanner.nextDouble();

        //System.out.print("Digite o segundo número: ");
        //double num2 = scanner.nextDouble();

        //System.out.print("Digite o segundo número: ");
        //double num3 = scanner.nextDouble();

       // Calculadora calc1 = new Calculadora(numero10, numero20, numero30);

       // Calculadora calc2 = new Calculadora(numero10, numero20, numero30);



        Calculadora calc1 = new Calculadora();

        Calculadora calc2 = new Calculadora();

       calc1.numero3 = 15;
       calc1.numero2 = 15;
       calc1.numero1 = 100;
       calc1.modelo = "Calculadora Cientifica";
       calc1.status();


        calc2.numero1 = 1;
        calc2.numero2 = 2;
        calc2.numero3 = 5;
        calc2.modelo = "Calculadora Normal";
        calc2.status();


        double valorgerado1 = calc1.somar();
        double valorgerado2 = calc2.somar();

       // double valordivisao = calc1.dividir();
        System.out.println("Soma1: " + valorgerado1);
        System.out.println("Soma2: " + valorgerado2);
     //   System.out.println("divisao: " + valordivisao);
        GerenciadorArquivo gerenciador = new GerenciadorArquivo("resultado.txt");
        GerenciadorArquivo gerenciador2 = new GerenciadorArquivo("resultado2.txt");

        gerenciador.salvarResultado(valorgerado1);
        gerenciador2.salvarResultado(valorgerado2);

       // scanner.close();
    }
}