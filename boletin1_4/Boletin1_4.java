
package boletin1_4;

import java.util.Scanner;


public class Boletin1_4 {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("teclea dos numeros:");
    int num1=sc.nextInt(),num2=sc.nextInt();
    int suma=num1+num2;
    int resta=num1-num2;
    int producto=num1*num2;
    int cociente=num1/num2;
    System.out.println("El valor de la suma es "+suma+", el valor de la resta "
    + "es "+resta+", el valor del producto es "+producto+","
    + " el valor del cociente es "+cociente);
            
    }
    
}
