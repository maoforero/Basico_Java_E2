public class Main {

    /**
     * Programa diseñado para calcular el precio de un producto con el iva
     * Esta basado en la practica de funciones 
     * @param args
     */
    public static void main(String[] args) {

        int price = getPrice(55);
        System.out.print("El precio total es: " + price);

    }

    static int getPrice (int value){
        int iva = 20;
        int productIva = (value * iva) / 100;
        int totalPrice = productIva + value;
        return totalPrice;
    }
}