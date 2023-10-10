public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Model123", "Smartphone", 3, 499.99);

        // Afișăm suma facturii
        System.out.println("Suma facturii: " + invoice.getAmount());
    }
}
