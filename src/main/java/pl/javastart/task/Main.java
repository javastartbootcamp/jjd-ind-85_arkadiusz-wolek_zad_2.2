package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        String productName1 = "Mleko";
        String productManufacturer1 = "Mlekowita";
        double productPrice1 = 2.5;
        String productName2 = "Czekolada";
        String productManufacturer2 = "Wedel";
        double productPrice2 = 2.19;
        System.out.println(productName1 + " " + productManufacturer1 + " " + productPrice1 + "zł");
        System.out.println(productName2 + " " + productManufacturer2 + " " + productPrice2 + "zł"); //z printf też działa, po zaimportowaniu import java.util.Locale;: System.out.printf(Locale.US, "%s %s %.2fzł%n", productName2, productManufacturer2, productPrice2);
    }
}
