
package javaapplication1;
import java.util.*;
//author@ NSM
public class JavaApplication1 {
    private static Scanner teclado;
    
    public static void main(String[] args) {
    teclado = new Scanner(System.in);
    //p9();
    //p10();
    //p11();
    //p12();
    //p13();
    //p14();
    p15();
   }
    public static void p9(){
    
        System.out.println("Ingrese un numero entero de 0 al 127");
        int a = teclado.nextByte();
        char c= (char) a;
        System.out.println(a);
        System.out.println(c);
        
    }
    public static void p10(){
    /*
    Modifica el ejercicio anterior, para que en lugar de pedir 
    un número, pida un carácter(char) y muestre su código en la tabla
    ASCII.
    */
   
    System.out.print("Ingrese un caracter: ");
    char ch = teclado.next().charAt(0);
    int intCodigo = (int) ch;
    System.out.println(intCodigo);
    }
    public static void p11(){
        /*
        Lee un número por teclado que pida el precio de un producto
        y calcule el precio final
        con IVA. El IVA sera una constante que sera del 21%.
        */
        System.out.print("Ingrese el precio del producto :");
        int a =teclado.nextInt();
        int iva = 21;
        double precioFinal = a + ((a*iva)/100);
        System.out.println("Precio final :"+precioFinal);
        
        
    }
    
    public static void p12(){
        /*
        Muestra los números del 1 al 100 (ambos incluidos). 
        Usa un bucle while.
        */
        int a=0;
        while(a<100){
            a++;
            System.out.println(a);
        }
    }
    public static void p13(){
        /*
        Haz el mismo ejercicio anterior con un bucle for.
        */
        int i;
       for(i=1;i<=100;i++){
           System.out.println(i);
       }
    }
    public static void p14(){
        /*
        Muestra los números del 1 al 100 (ambos incluidos) 
        divisibles entre 2 y 3. Utiliza el bucle que desees.
        */
         int i;
       for(i=1;i<=100;i++){

           if((i%2== 0) &&(i%3==0)){
              System.out.println("Este numero "+i+" es divisible por 2  "); 
           }
           
       }
    }
    public static void p15(){
        /*
        Realiza una aplicación que nos pida un número de ventas a 
        introducir, después nos pedirá tantas ventas por teclado 
        como número de ventas se hayan indicado. 
        Al final mostrara la suma de todas las ventas.
        */
        int ventas, acum=0;
        double totalVentas = 0;
        double acumVentas = 0;
        System.out.println("Bienvenido ingrese el numero de ventas ");
        ventas = teclado.nextInt();
        while(acum<ventas){
            System.out.println("Ingrese el monto de venta"+acum);
            acumVentas = teclado.nextDouble();
            totalVentas = totalVentas + acumVentas;
            acum++;
                    
        }
        System.out.println("El numero total de las ventas es :"+totalVentas);
    }
    public static void p16(){
        /*
        Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las
        variables a, b y c por teclado.
        */
        int a,b,c;
        double res;
        System.out.println("Bienvenido ingrese la variable a ");
        a = teclado.nextInt();        
        System.out.println("Bienvenido ingrese la variable b ");
        b = teclado.nextInt();        
        System.out.println("Bienvenido ingrese la variable c ");
        c = teclado.nextInt();
        res = (Math.pow)
        
    }
    
}
