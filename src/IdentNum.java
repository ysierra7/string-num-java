public class IdentNum {
    
    public static void main(String args[]){
        String cadena = "     1  2          3         14        5  y  u      6   7             ";
        String[ ] arrayCadena = cadena.trim().split("\\s+"); // Con expresiones regulares quitamos los espacios del string

        int numeroTotal = 0;

        for (int i = 0; i < arrayCadena.length; i++){

            String caracter = arrayCadena[i];

            if (esNumero(caracter) == true) {

                int numero = Integer.parseInt(caracter);
                numeroTotal = numero + numeroTotal;

            }else {
                System.err.println(caracter + " No es un número");
            }
        }

        System.out.println("La suma de los números de la cadena es: " + numeroTotal);




    }

    public static boolean esNumero(String cadena) {
        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException exception) {
            resultado = false;
        }

        return resultado;

    }
}
