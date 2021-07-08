
package cálculotrapézio;

import java.util.Scanner;

public class CálculoTrapézio {

    public static void main(String[] args) {
    float BaseMaior,BaseMenor,Altura;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Para cálcular a área do trapézio digite:\nBase Maior");
        BaseMaior = teclado.nextFloat();
        System.out.println("Base Menor");
        BaseMenor = teclado.nextFloat();
        System.out.println("Altura");
        Altura = teclado.nextFloat();
        System.out.println("Área do Trapézio");
        
        float r = (BaseMaior+BaseMenor)*Altura/2;
        
        System.out.println(r);
                        
    }
    
}

