import java.util.ArrayList;
import java.util.Scanner;

public class Running {
    ArrayList<Shoes> running_shoes = new ArrayList<>();
    ArrayList<Shoes> shoes_size = new ArrayList<>();
    ArrayList<Shoes> envio_nodisp = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ArrayList<Shoes> addRunningShoes(){
        running_shoes.add(new Shoes("1234", 100f, 38, "none", true, 2));
        running_shoes.add(new Shoes("2345", 200f, 0, "none", false, 0));
        return running_shoes;
    }
    public String showInformationShoes(){
        String information = "";
        for (int i = 0; i < running_shoes.size(); i++) {
            information += "Referencia: " + running_shoes.get(i).getReference() +
            " Precio: "+ running_shoes.get(i).getPrice() + " Tamaño: "+ running_shoes.get(i).getSize()+
            " Foto: "+running_shoes.get(i).getPhoto_route()+" Envío: "+running_shoes.get(i).isSend_method() +
            " Numero de colores: "+running_shoes.get(i).getCant_colors()+ "\n";
        }
        return information;
    }
    // 1. Listar todos los tennis running de talla 38
    public void showSize(){
        System.out.println("Indique los tennis que desea consultar por talla");
        int talla = sc.nextInt();

        for (int i = 0; i < running_shoes.size(); i++) {
            if (running_shoes.get(i).getSize()==talla) {
                shoes_size.add(running_shoes.get(i));
            }
        }
    }

    public void imprimirArreglo(){
        for (int i = 0; i < shoes_size.size(); i++) {
            System.out.println("Referencia: " + shoes_size.get(i).getReference() +
            " Precio: "+ shoes_size.get(i).getPrice() + " Tamaño: "+ shoes_size.get(i).getSize()+
            " Foto: "+shoes_size.get(i).getPhoto_route()+" Envío: "+shoes_size.get(i).isSend_method() +
            " Numero de colores: "+shoes_size.get(i).getCant_colors()+ "\n");
        }
    }

    public ArrayList<Shoes> tennisByPrice(){
        ArrayList<Shoes> tennisPrice = new ArrayList<>();
        System.out.println("Indique el precio minimo para los Tennis");
        int minPrice = sc.nextInt(); 

        for (int i = 0; i < running_shoes.size(); i++) {
            if (running_shoes.get(i).getPrice()>minPrice){
                tennisPrice.add(running_shoes.get(i));
            }
        }

        return tennisPrice;
    }

    public void envio_nodispo(){

    for (int i = 0; i < running_shoes.size(); i++) {
        if (running_shoes.get(i).isSend_method()==false) {
            envio_nodisp.add(running_shoes.get(i));
        }
    }

    }

    public void impenvio_nodispo(){

        for (int i = 0; i < envio_nodisp.size(); i++) {
        System.out.println("Referencia: " + envio_nodisp.get(i).getReference() +
            " Precio: "+ envio_nodisp.get(i).getPrice() + " Tamaño: "+ envio_nodisp.get(i).getSize()+
            " Foto: "+envio_nodisp.get(i).getPhoto_route()+" Envío: "+envio_nodisp.get(i).isSend_method() +
            " Numero de colores: "+envio_nodisp.get(i).getCant_colors()+ "\n");
        }
    }
}
