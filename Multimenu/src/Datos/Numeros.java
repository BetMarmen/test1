/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author CCBB
 */
public class Numeros {
    public static void sumaDe_dosnumeros(String num_1, String num_2){
        try{
        Double suma;
        Double a= Double.parseDouble(num_1);
        Double b= Double.parseDouble(num_2);
        suma= a+b;
            System.out.println("El resultado de la suma es: "+suma);
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
    public static void Restadosnumeros(String num1, String num2){
        try{
        Double resta;
        Double a= Double.parseDouble(num1);
        Double b= Double.parseDouble(num2);
        resta= a-b;
            System.out.println("El resultado de la resta es: "+resta);
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
     public static void Producto_dosnumeros(String num1, String num2){
        try{
        Double producto;
        Double x= Double.parseDouble(num1);
        Double y= Double.parseDouble(num2);
        producto= x*y;
            System.out.println("El resultado de la multiplicacion es: "+producto);
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
     public static void division_de_dos_numeros(String num1, String num2){
        try{
        Double division;
        Double a= Double.parseDouble(num1);
        Double b= Double.parseDouble(num2);
        division= a/b;
            System.out.println("El resultado de la division es: "+division);
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
     public static void area_de_Circulo( String radio){
    Double area;
    try{
    Double r = Double.parseDouble(radio);
    area = Math.PI*(Math.pow(r, 2));
        if(r==0){
            System.out.println("No puede ser cero");
        }
        else{
            System.out.println("El area del circulo es:" +area);
        }
    }
    catch(Exception variable){
        System.out.println(variable.getMessage());
    }
    }
     public static void factura_producto(String costo, String Cantidad){
       Double total;
      try{
            Double costo1 = Double.parseDouble(costo);
            Double cantidad1 = Double.parseDouble(Cantidad);
            Double subtotal= costo1*cantidad1;
            Double descuento= subtotal*0.25;
            total= subtotal-descuento;
            System.out.println(": "+total);
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        
        }
     }
}
