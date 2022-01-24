/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import AbstractDecorator.Chocollat;
import Boisson.AbstractBoisson;
import Boisson.Espresso;
import java.util.Scanner;

/**
 *
 * @author USER-PC
 */
public class Client {
   
    public static void Afficher(String Message)
    {
        System.out.println(Message);
    }
    static  Scanner clavier = new Scanner(System.in);
    public static void main(String[] args)
    {
      AbstractBoisson bs = new Espresso();
         System.out.println("--------------------------------------------");
         System.out.println(bs.getDescription());
         System.out.println(bs.Cout());
         
         bs=new Chocollat(bs);
        System.out.println("--------------------------------------------");
        System.out.println(bs.getDescription());
        System.out.println(bs.Cout());
    }
}
