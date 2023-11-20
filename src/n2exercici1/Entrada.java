package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada{
    public static byte llegirByte(String missatge) throws InputMismatchException{
        byte bt = 0;

        while (true)
        {
            try{
                System.out.println(missatge);
                Scanner scanner = new Scanner(System.in);
                bt = scanner.nextByte();
                break ;
            } catch (InputMismatchException e){
                System.out.println("Formato fallido");
                System.out.println(e.getMessage());
            }
        }
        return bt;
    }
    public static int llegirInt(String missatge) throws InputMismatchException{
        int integ = 0;

        while (true)
        {
            try{
                System.out.println(missatge);
                Scanner scanner = new Scanner(System.in);
                integ = scanner.nextInt();
                break ;
            } catch (InputMismatchException e){
                System.out.println("Formato fallido");
                System.out.println(e.getMessage());
            }
        }
        return integ;
    }
    public static float llegirFloat(String missatge) throws InputMismatchException{
        float ft = 0;

        while (true)
        {
            try{
                System.out.println(missatge);
                Scanner scanner = new Scanner(System.in);
                ft = scanner.nextFloat();
                break ;
            } catch (InputMismatchException e){
                System.out.println("Formato fallido");
                System.out.println(e.getMessage());
            }
        }
        return ft;
    }
    public static double llegirDouble(String missatge) throws InputMismatchException{
        double db = 0;

        while (true)
        {
            try{
                System.out.println(missatge);
                Scanner scanner = new Scanner(System.in);
                db = scanner.nextDouble();
                break ;
            } catch (InputMismatchException e){
                System.out.println("Formato fallido");
                System.out.println(e.getMessage());
            }
        }
        return db;
    }

    public static char llegirChar(String missatge) throws Exception{
        char ch = 'a';

        while (true)
        {
            try{
                System.out.println(missatge);
                Scanner scanner = new Scanner(System.in);
                ch = scanner.next().charAt(0);
                break ;
            } catch (Exception e){
                System.out.println("Formato fallido");
                System.out.println(e.getMessage());
            }
        }

        return ch;
    }
    public static String llegirString(String missatge) throws Exception{
        String string = "Fail";

        while (true)
        {
            try{
                System.out.println(missatge);
                Scanner scanner = new Scanner(System.in);
                string = scanner.next();
                break ;
            } catch (Exception e) {
                System.out.println("Formato fallido");
                System.out.println(e.getMessage());
            }
        }

        return string;
    }
    public static boolean llegirSiNo(String missatge) throws Exception{
        boolean bul = false;

        while (true)
        {
            try{
                System.out.println(missatge);
                Scanner scanner = new Scanner(System.in);
                if (scanner.next().charAt(0) == 's')
                    bul = true;
                else if (scanner.next().charAt(0) == 'n')
                    bul = false;
                else
                    scanner.nextBoolean();
                break ;
            } catch (Exception e){
                System.out.println("Formato fallido");
                System.out.println(e.getMessage());
            }
        }

        return bul;
    }
}
