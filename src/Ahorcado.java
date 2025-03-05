import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligenica";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinada = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinada.length; i++) {
            letrasAdivinada[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("palabra a adivinar:" + String.valueOf(letrasAdivinada)+ "( " + palabraSecreta.length() + " letras)");	
            System.out.println("Introduce una letra porfavor");
            char letra = Character.toLowerCase(scanner.next().charAt(0)) ;
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinada[i] = letra;
                    letraCorrecta = true;

                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.err.println("Incorrecto t quedan: " + (intentosMaximos - intentos) + "intentos");

            }
            if (String.valueOf(letrasAdivinada).equals(palabraSecreta)) {

                palabraAdivinada = true;
                System.out.println("!Felicidades has adivinado la palabra  secreta: x" + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("Error perdite no es la palabra correcta te quedaste sin intentos ");

        }
        scanner.close();
    }
}
