
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
    //p18();
    //p19();
    p20();
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
        Instrucciones de asignaciÃ³n (entender los cambios en las posiciones de memoria)
        a. Escribir un programa que: - Declare e inicialice 3 variables enteras a, b, c con
        los siguientes valores: a=10; b=-8; c = 36
        i. Visualice el contenido de las tres variables
        ii. Realice las siguientes operaciones de asignaciÃ³n: a=b; b=c; c = a;
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
        //ii. Realice las siguientes operaciones de asignaciÃ³n: a=b; b=c; c = a a=-8 b=36 c=10;
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
        Declara 2 variables numÃ©ricas (con el valor que desees), he indica cual es mayor de los
        dos. Si son iguales indicarlo tambiÃ©n. Cambiar los valores para comprobar que
        funciona.
        */
        System.out.println("Ingrese un nÃºmero");
        double a = teclado .nextDouble();
        System.out.println("Ingrese un nÃºmero");
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
        Declara un String que contenga tu nombre, despuÃ©s muestra un mensaje de
        bienvenida por consola. Por ejemplo: si introduzco â€œFernandoâ€�, me aparezca
        â€œBienvenido Fernandoâ€�.
        */
        String nombre = teclado.next();
        System.out.println("Bienvenido "+nombre+ ", sigue programando");
        
        
    }
    public static void p6(){
        /*
        Modifica la aplicaciÃ³n anterior, para que nos pida el nombre que queremos introducir
        por teclado.
        */
       System.out.println("Introduzca su nombre");       
       String nombre = teclado.next();
       System.out.println("Bienvenido "+nombre+ ", sigue programando");
    }
    public static void p7(){
        /*
        Haz una aplicaciÃ³n que calcule el Ã¡rea de un cÃ­rculo (pi*R2). El radio se pedirÃ¡ por
        teclado.
        */
        System.out.println("Ingrese un radio");
        double radio = teclado.nextDouble();
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("El area es :"+area);
    }
    public static void p8(){
        /*
        Lee un nÃºmero por teclado e indica si es divisible entre 2. Si no lo es, tambiÃ©n
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
        Lee un nÃºmero por teclado y muestra por consola, el carÃ¡cter al que pertenece en la
        tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
        */
        System.out.println("Ingrese un numero");
        byte num = teclado.nextByte();
        char ch = (char) num;
        System.out.println(ch);
    }
    public static void p10(){
        /*
        Modifica el ejercicio anterior, para que en lugar de pedir un nÃºmero, pida un carÃ¡cter
        (char) y muestre su cÃ³digo en la tabla ASCII.
        */
        System.out.println("Ingrese un caracter");
        String num = teclado.next();

        System.out.println(ch);

    }
    public static void p11(){
        double precio, iva = 21;
        System.out.print("Ingrese el precio del articulo");
        precio = teclado.nextDouble();
        iva = precio + ((precio*iva)/100);
        System.out.println("El precio mas IVA es de :"+iva);
    }
    public static void p12(){
        /*
        Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
        */
        int i= 0;
        while (i<100){
            i++;
            System.out.println(i);
        }
    }
    public static void p13(){
        /*
        Haz el mismo ejercicio anterior con un bucle for.
        */
        int i;
        for(i=0;i<100;i++){
            System.out.println(i);
        }
    }
    public static void p14(){
        /*
        14) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y
        3. Utiliza elbucle que desees.
        */
        int i;
        for(i=1;i<100;i++){
            if((i%3==0) && (i%2==0)){
                 System.out.println(i);
            }
        }
    }
    public static void p17(){
        /*
        Lee un número por teclado y comprueba que este número es mayor o igual que cero,
        si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
        */
        int num;
       

        do{
        System.out.println("ingrese un numero");
        num = teclado.nextInt();
        }while(num<=0);
           System.out.println(num);
        
    }
    public static void p18(){
        /*
        Login con 3 intentos.
        */
        int login=0;
        int pass=0;
        int intentos=1;
        int maximo=3;
       
        while ((login!=1809) || (pass!=1234) && (intentos<maximo)){
        System.out.print("introduzca un login: ");
        login= teclado.nextInt();
        System.out.print("Introduzca su pass: ");
        pass=teclado.nextInt();
        if (intentos==3){
            System.out.println("aceeso denegado");
            intentos = intentos-maximo;
        }
        intentos++;
        }
        System.out.println("login y pass, correctos...");
    }
    public static void p19(){
        /*
        Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia
        laboral o no.
        */
        String dia;
        System.out.print("Ingrese un día de la semana");
        dia = teclado.next();
        switch(dia){
            case "lunes": 
                System.out.println("Día laboral");
                break;
            case "martes": 
                System.out.println("Dia laboral");
                break;
            case "miercoles": 
                System.out.println("Dia laboral");
                break;
            case "jueves": 
                System.out.println("Dia laboral");
                break;
            case "viernes": 
                System.out.println("Dia laboral");
                break;
            case "sabado": 
                System.out.println("Dia laboral");
                break;
            case "domingo": 
                System.out.println("Dia no laboral");
                break;
        }
    }
    public static void p20(){
        
        
        System.out.println("Introduce el primero numero");
        int num1=teclado.nextInt();
  
        System.out.println("Introduce el segundo numero");
        int num2=teclado.nextInt();
  
        for (int i=0;i<10;i++){
            //Generamos un numero aleatorio
            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numAleatorio);
        }
    }
}
