public class BucleBuscarEtiqueta {
    public static void main(String[] args) {
        String frase = "Paula fue a la playa y Paula se divirtió en la playa, Paula compró chocolate y Paula fué feliz comiendo mucho chocolate";
        String palabra = "Paula";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        char letra = 'g';
        buscar:
        for (int i = 0; i <= maxFrase;) {
            int k = i;
            for(int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }

            }
            cantidad++;
            i = i + maxPalabra;

        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase");
    }
}
