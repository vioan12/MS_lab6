import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try {

            CoffeeMachine CM = new CoffeeMachine();
            Scanner scanner = new Scanner(System.in);
            String input;
            String suma1,suma2;
            System.out.println("Puteti cumpara urmatoarele produse:");
            System.out.println("Ciocolata cu lapte: 10 bani");
            System.out.println("Espresso scurt: 15 bani");
            System.out.println("Puteti folosti numai monede de 10 si 5 bani");
            System.out.println("");
            System.out.println("Introduceti optiunea dorita:");
            input = scanner.next();
            while (!input.equals("$")) {
                suma1=CM.taglocatiejeton();
                CM.exec(input);
                suma2=CM.taglocatiejeton();
                if(Integer.parseInt(suma1)-Integer.parseInt(suma2)==10){
                    System.out.println("Ciocolata cu lapte va este servita");
                }
                if(Integer.parseInt(suma1)-Integer.parseInt(suma2)==15){
                    System.out.println("Espresso scurt va este servit");
                }
                System.out.println("Suma actuala:"+CM.taglocatiejeton());
                System.out.println("");
                System.out.println("Introduceti optiunea dorita:");
                input = scanner.next();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
