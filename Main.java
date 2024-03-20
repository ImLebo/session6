import java.util.Scanner;


public class Main{

    static Scanner sc = new Scanner(System.in);

    // Actividad calificable:
    // 1. Listar todos los tennis running de talla 38
    // 2. Listar todos los tennis classic que tengan más de 5 colores disponible
    // 3. Listar todos los tennis running y classic que tengan un precio mayor a USD150
    // 4. Listar todos los tennis running cuyo envio a casa no este disponible


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
            intance_woman.option_menu();
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
