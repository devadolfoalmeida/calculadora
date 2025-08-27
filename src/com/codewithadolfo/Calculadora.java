package com.codewithadolfo;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {
public double numero1;
public double numero2;
public double numero3;
public String modelo;

   public void status () {
       System.out.println(this.modelo);
   }

//public Calculadora(double numero1, double numero2, double numero3)
//{
  //  this.numero1 = numero1;
  //  this.numero2 = numero2;
    //this.numero3 = numero3;
//}


public double somar () {
    return numero1 + numero2 + numero3;
}


}
