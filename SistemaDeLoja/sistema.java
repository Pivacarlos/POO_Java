public class sistema { 

    public static void main (String[] args) {
        Cliente C1 = new Cliente ("123.123.123-33", "Jorge", "Jorge@gmail.com", "Rua Tal");
        C1.toString();

        Produto P1 = new Produto (1, "Arroz", 10.00);
        P1.toString(0.9); // 10% de desconto

    }
}


