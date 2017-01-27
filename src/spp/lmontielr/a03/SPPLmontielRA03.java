/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lmontielr.a03;

import java.util.*;
/**
 *Este programa sirve para sacar la hipotenusa dados los dos catetos 
 * @author monti
 */
public class SPPLmontielRA03{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //primer cateto segundo cateto e hipotenusa donde se va a guardar el resultado
    double primerCat,segundoCat,hipotenusa;
    primerCat=pedirCat("Escribe la medida del primer cateto");
    segundoCat=pedirCat("Escribe la medido del segundo cateto");
    hipotenusa=operaHip(primerCat,segundoCat);
    mostrarHip(primerCat,segundoCat,hipotenusa);
    }
    public static double pedirCat(String Cat){
    double cat;//pido dos catetos en un solo metodo
    Scanner teclear=new Scanner(System.in);
    System.out.println(Cat);
    cat=teclear.nextDouble();
    return cat;
    }
    public static double operaHip(double primer, double segundo){
    double hip=Math.pow(primer,2)+Math.pow(segundo,2),hipo=Math.sqrt(hip);
    return hipo;//hago las operaciones y devuelvo el resultado
    }
    public static void mostrarHip(double prim,double seg,double hipo){ 
        //despliego el resultado
        System.out.println("La hipotenusa de dos catetos con las medidas :  "+prim+" y "+seg+"  es  "+hipo);
    }
}