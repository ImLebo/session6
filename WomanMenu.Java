import java.util.Scanner;

public class WomanMenu {

    Scanner sc = new Scanner(System.in);
    public WomanMenu(){}

    public void option_menu(){
    int option = 0;

    System.out.println("**Opciones para mujer**");
    System.out.println("1. Calzado");
    System.out.println("2. Productos destacados");
    System.out.println("3. Ropa");
    System.out.println("4. Accesorios");
    System.out.println("5. Deporte");

    option = sc.nextInt();

    switch (option) {
        case 1:
            System.out.println("Calzado");
            System.out.println("1. Running / 2.Classic / 3. Salir");
            int new_option = sc.nextInt();
            if(new_option==1){
            Running intance_Running = new Running();
            intance_Running.addRunningShoes();
            System.out.println(intance_Running.showInformationShoes()); 
            }
            else if(new_option==2){
            Classic intance_Classic = new Classic();
            intance_Classic.addclassicShoes();
            System.out.println(intance_Classic.showInformationShoes());
            } else {
            System.out.println("Opcion invalida");
            }
            
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
