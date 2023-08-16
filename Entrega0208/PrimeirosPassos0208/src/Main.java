import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        
        String product1 = "Computer";
        String product2 = "Office desk";
        
        byte age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0; 
        double price2 = 650.50; 
        double measure = 53.234567; 
        
        System.out.println("Products: ");
        System.out.printf("%s, whose price is $ %.2f%n", product1, price1);
        System.out.printf("%s, whose price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old. Code: %d. Gender: %c%n%n", age, code, gender);		
        System.out.printf("Measure with eight decimal points: %.8f%n", measure);		
        System.out.printf("Rounded (Three decimal points): %.3f%n", measure);
    	Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
