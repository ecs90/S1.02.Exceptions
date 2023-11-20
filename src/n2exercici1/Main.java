package n2exercici1;

public class Main {
    public static void main(String[] args) throws Exception {
        byte bt = Entrada.llegirByte("Ingrese una byte:");
        int i = Entrada.llegirInt("Ingrese el numero del día de su cumpleaños");
        Double db = Entrada.llegirDouble("Ingrese su numero irracional favorito (hasta 15 digitos post coma):");
        float ft = Entrada.llegirFloat("Ingrese su segundo numero irracional favorito (hasta 7 digitos post coma)");
        char ch = Entrada.llegirChar("Ingrese la inicial de su nombre:");
        String st = Entrada.llegirString("Ingrese mes de cumpleaños");
        boolean bul = Entrada.llegirSiNo("Usted es felíz? Para Si pulse \'s\', para No, \'n\'");

        System.out.println("El byte ingresado fue: " + bt);
        System.out.println("Su cumpleaños es el día: " + i);
        System.out.println("Su irracional favorito (double) es: " + db);
        System.out.println("Su segundo irracional favorito (float) es: " + ft);
        System.out.println("Su nombre comienza por: " + ch);
        System.out.println("Su cumpleaños es en: " + st);
        System.out.println("Usted afirma ser feliz? " + (bul ? "Si" : "No"));
    }
}
