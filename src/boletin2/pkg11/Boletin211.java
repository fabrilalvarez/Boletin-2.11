/* Calcular sueldo líquido a percibir por una persona sabiendo
que el sueldo total inclute los siguientes conceptos.*/

package boletin2.pkg11;

import java.util.Scanner;

public class Boletin211 {

    public static void main(String[] args) {
        // Codigo de la aplicación.
        // st=sueldoTotal sf=SueldoFijo c=comisión km=km d=dietas
        float st,sf,c,km,d,D=0.05f;
    
    System.out.println ("Introduzca sus datos: ");
        Scanner dato=new Scanner (System.in);
            System.out.println ("Comisión: ");
                c=dato.nextFloat ();
            System.out.println ("Sueldo Fijo: ");
                sf=dato.nextFloat ();
            System.out.println ("Kilometraje: ");
                km=dato.nextFloat ();
            System.out.println ("dietas: ");
                d=dato.nextFloat ();
                
        c=c*D;
        st=sf+c+km*2+d*30;
        
        imprimir (st);
        
    }

    private static void imprimir(float st) {
        System.out.println ("Sueldo Total: "+((st-36)*0.82));
    }
    
}
