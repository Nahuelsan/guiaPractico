
package guiapractica;
import java.util.*;

/**
 *
 * @author NSM
 */
public class GuiaPractica {
private static Scanner teclado;

    public static void main(String[] args) {
    teclado = new Scanner(System.in);
    p9();
    }
    
    public void ejercicio1 () {
    
    }
    
    public static void suma(){
        System.out.println("Ingrese un numero");
        double num1 = teclado .nextDouble();
        System.out.println("Ingrese otro numero");
        double num2 = teclado .nextDouble();
        System.out.println("La suma de los numeros es "+(num1+num2));
    
    }
    
    public static void p3(){
        /*
        Instrucciones de asignación (entender los cambios en las posiciones de memoria)
        a. Escribir un programa que: - Declare e inicialice 3 variables enteras a, b, c con
        los siguientes valores: a=10; b=-8; c = 36
        i. Visualice el contenido de las tres variables
        ii. Realice las siguientes operaciones de asignación: a=b; b=c; c = a;
        iii. Visualice nuevamente el contenido de las tres variables.
        b. Ejecute el programa
        c. Explique los cambios en los valores de las variables.
        */
        int a = 10;
        int b = -8;
        int c = 36;
        //i. Visualice el contenido de las tres variables
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
        System.out.println("El valor de c es: "+c);
        //ii. Realice las siguientes operaciones de asignación: a=b; b=c; c = a a=-8 b=36 c=10;
        //iii. Visualice nuevamente el contenido de las tres variables.
        int aux;
        aux = a;
        a = b;
        b = c;
        c = aux;
        System.out.println("El valor anterior de la variable a era 10 ahora es: "+a);
        System.out.println("El valor anterior de la variable b era -8 ahora es: "+b);
        System.out.println("El valor anterior de la variable c era 36 ahora es: "+c);

    }
    public static void p4(){
        /*
        Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los
        dos. Si son iguales indicarlo también. Cambiar los valores para comprobar que
        funciona.
        */
        System.out.println("Ingrese un número");
        double a = teclado .nextDouble();
        System.out.println("Ingrese un número");
        double b = teclado .nextDouble();
        if(a>b){
          System.out.println("La variable a es mayor que la variable b");
        }else if(b>a){
            System.out.println("La variable b es mayor que la variable a");
        }else{
            System.out.println("Las variables son iguales");
        }            
        
    }
    public static void p5(){
        /*
        Declara un String que contenga tu nombre, después muestra un mensaje de
        bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca
        “Bienvenido Fernando”.
        */
        String nombre = teclado.next();
        System.out.println("Bienvenido "+nombre+ ", sigue programando");
        
        
    }
    public static void p6(){
        /*
        Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
        por teclado.
        */
       System.out.println("Introduzca su nombre");       
       String nombre = teclado.next();
       System.out.println("Bienvenido "+nombre+ ", sigue programando");
    }
    public static void p7(){
        /*
        Haz una aplicación que calcule el área de un círculo (pi*R2). El radio se pedirá por
        teclado.
        */
        System.out.println("Ingrese un radio");
        double radio = teclado.nextDouble();
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("El area es :"+area);
    }
    public static void p8(){
        /*
        Lee un número por teclado e indica si es divisible entre 2. Si no lo es, también
        debemos indicarlo.
        */
        System.out.println("Ingrese un numero");
        int num = teclado.nextInt();
        num=num%2;
        if(num==0){
            System.out.println("Es divisible por 2");
        }else{
            System.out.println("No es divisible por 2");
        }
    }
    public static void p9(){
        /*
        Lee un número por teclado y muestra por consola, el carácter al que pertenece en la
        tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
        */
        System.out.println("Ingrese un numero");
        byte num = teclado.nextByte();
        char ch = (char) num;
        System.out.println(ch);
    }
    public static void p10(){
        /*
        Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter
        (char) y muestre su código en la tabla ASCII.
        */
        System.out.println("Ingrese un caracter");
        String num = teclado.next();

        System.out.println(ch);

    }
}
