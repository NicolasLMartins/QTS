public class Main {
    public static void main(String[] args) throws Exception {
        
        String textoExemplo = "abcde FGHIJ ABC abc DEFG     ";
        
        String t01 = textoExemplo.toLowerCase();
        String t02 = textoExemplo.toUpperCase();
        String t03 = textoExemplo.trim();

        String t04 = textoExemplo.substring(2);
        String t05 = textoExemplo.substring(2, 9);

        String t06 = textoExemplo.replace('a', 'x');
        String t07 = textoExemplo.replace("abc", "xy");

        int x = textoExemplo.indexOf("bc");
        int y = textoExemplo.lastIndexOf("bc");

        System.out.println("Texto exemplo: -" + textoExemplo + "-");
        System.out.println("toLowerCase: -" + t01 + "-");
        System.out.println("toUpperCase: -" + t02 + "-");
        System.out.println("trim: -" + t03 + "-");
        
        System.out.println("substring(2): -" + t04 + "-");
        System.out.println("substring(2, 9): -" + t05 + "-");

        System.out.println("replace('a', 'x'): -" + t06 + "-");
        System.out.println("replace(\"abc\", \"xy\"): -" + t07 + "-");

        System.out.println("indexOf(\"bc\"): " + x);
        System.out.println("lastIndexOf(\"bc\"): " + y);
    }
}
