import java.util.ArrayList;
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

    ArrayList<Shoes> shoesByPrice = new ArrayList<>();

    switch (option) {
        case 1:
            System.out.println("Calzado");
            System.out.println("1. Running / 2.Classic / 3. Salir");
            int new_option = sc.nextInt();
            if(new_option==1){
            Running intance_Running = new Running();
            intance_Running.addRunningShoes();
            System.out.println(intance_Running.showInformationShoes()); 
            //Solucion ejercicio 1
            intance_Running.showSize();
            intance_Running.imprimirArreglo();
            //Solucion del ejercicio 3
            shoesByPrice = intance_Running.tennisByPrice();
            imprimirArreglos(shoesByPrice);
            //Solucion del ejercicio 4
            System.out.println("Tennis con envio no disponible");
            intance_Running.envio_nodispo();
            intance_Running.impenvio_nodispo();
            }
            else if(new_option==2){
            Classic intance_Classic = new Classic();
            intance_Classic.addclassicShoes();
            System.out.println(intance_Classic.showInformationShoes());
            //Solucion Ejercicio 2
            intance_Classic.shoesNumberColors();
            intance_Classic.imprimirArreglo();
            //Solucion del Ejercicio 3
            shoesByPrice = intance_Classic.tennisByPrice();
            imprimirArreglos(shoesByPrice);
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
    public void imprimirArreglos(ArrayList<Shoes> arrayList){

        for (Shoes shoes : arrayList) {
            System.out.println(shoes.price);
        }
    }
}
