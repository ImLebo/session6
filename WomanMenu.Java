import java.util.Scanner;

public class WomanMenu {

    Scanner sc = new Scanner(System.in);
    public WomanMenu(){}

    public void option_menu(){
    int option = 0;
    option = sc.nextInt();

    switch (option) {
        case 1:
            System.out.println("Calzado");
            break;
        case 2:
            System.out.println("Productos destacados");
            break;
        case 3:
            System.out.println("Ropa");
            break;
        case 4:
            System.out.println("Accesorios");
            break;
        case 5:
            System.out.println("Deporte");
            break;
        default:
            System.out.println("Opcion no valida!");
            break;
    }



    }
}
