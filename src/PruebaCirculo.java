public class PruebaCirculo {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        System.out.println("=== Círculo 1 (Constructor por defecto) ===");
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Área: " + circulo1.getArea());
        System.out.println();


        Circulo circulo2 = new Circulo(5.0);
        System.out.println("=== Círculo 2 (Constructor con radio = 5.0) ===");
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Área: " + circulo2.getArea());
        System.out.println();


        Circulo circulo3 = new Circulo(7.5);
        System.out.println("=== Círculo 3 (Constructor con radio = 7.5) ===");
        System.out.println("Radio: " + circulo3.getRadio());
        System.out.println("Área: " + circulo3.getArea());
    }
}