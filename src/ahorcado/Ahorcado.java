package ahorcado;

import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String palabSecret = "inteligencia";
        int intentMax = 10, intentos = 0;
        boolean isGuessed = false;
        
       char [] letrasAdivinadas = new char [palabSecret.length()];
       
        for (int i =0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_' ;
        }
        
        while(!isGuessed && intentos < intentMax) {
            
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabSecret.length() + " letras)" );
            System.out.println("Introduce una letra, por favor.");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            
            boolean letraCorrecta = false;
            // Estructura de control: Iteratica (bucle)
            for (int i = 0; i < palabSecret.length(); i++) {
                // Estructura de control: condicional
                if (palabSecret.charAt(i) == letra){
                    letrasAdivinadas [i] = letra;
                    letraCorrecta = true;
                }
            
            }
            
        if (!letraCorrecta) {
            intentos++;
            System.out.println("¡Incorrecto! Te quedan " + (intentMax - intentos) + " intentos.");
        }
        
        if (String.valueOf(letrasAdivinadas).equals(palabSecret)) {
            isGuessed = true;
            System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabSecret);
        }
        
        }
        
        if (!isGuessed){
            System.out.println("¡Que pena te has quedado sin intentos! GAME OVER");
        }
        
        scanner.close();

    }
    
}
