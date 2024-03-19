import java.util.Scanner;


public class Main{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    int menu_option = 0;
    System.out.println("Seleccione una opción del menú");
    System.out.println("1. Mujer");
    System.out.println("2. Hombre");
    System.out.println("3. Salir");

    menu_option = sc.nextInt();
        
    switch (menu_option) {
        case 1:
            WomanMenu intance_woman = new WomanMenu();
            break;
        case 2:
            MenMenu intance_man = new MenMenu();
            break;
        case 3:
            System.out.println("Has salido del menu!");
            break;    
        default:
            break;
    }
    }
}
