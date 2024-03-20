import java.util.ArrayList;
import java.util.Scanner;

public class Classic {
    Scanner sc = new Scanner(System.in);
    ArrayList<Shoes> classic_shoes = new ArrayList<>();
    ArrayList<Shoes> shoes_number_color = new ArrayList<>();

    public ArrayList<Shoes> addclassicShoes(){
        classic_shoes.add(new Shoes("1234", 100f, 38, "none", true, 2));
        classic_shoes.add(new Shoes("2345", 200f, 0, "none", false, 0));
        return classic_shoes;
    }
    public String showInformationShoes(){
        String information = "";
        for (int i = 0; i < classic_shoes.size(); i++) {
            information += "Referencia: " + classic_shoes.get(i).getReference() +
            " Precio: "+ classic_shoes.get(i).getPrice() + " Tamaño: "+ classic_shoes.get(i).getSize()+
            " Foto: "+classic_shoes.get(i).getPhoto_route()+" Envío: "+classic_shoes.get(i).isSend_method() +
            " Numero de colores: "+classic_shoes.get(i).getCant_colors()+ "\n";
        }
        return information;
    }
        // 2. Listar todos los tennis classic que tengan más de 5 colores disponible
    public void shoesNumberColors(){
        System.out.println("Cuantos colores deseas en el Tennis");
        int numero_colores = sc.nextInt();

        for (int i = 0; i < classic_shoes.size(); i++) {
            if(classic_shoes.get(i).getCant_colors()>=numero_colores){
                shoes_number_color.add(classic_shoes.get(i)); 
            }
        }
    }
    public void imprimirArreglo(){
        for (int i = 0; i < shoes_number_color.size(); i++) {
            System.out.println("Referencia: " + shoes_number_color.get(i).getReference() +
            " Precio: "+ shoes_number_color.get(i).getPrice() + " Tamaño: "+ shoes_number_color.get(i).getSize()+
            " Foto: "+shoes_number_color.get(i).getPhoto_route()+" Envío: "+shoes_number_color.get(i).isSend_method() +
            " Numero de colores: "+shoes_number_color.get(i).getCant_colors()+ "\n");
        }
    }

    public ArrayList<Shoes> tennisByPrice(){
        ArrayList<Shoes> tennisPrice = new ArrayList<>();
        System.out.println("Indique el precio minimo para los Tennis");
        int minPrice = sc.nextInt(); 

        for (int i = 0; i < classic_shoes.size(); i++) {
            if (classic_shoes.get(i).getPrice()>minPrice){
                tennisPrice.add(classic_shoes.get(i));
            }
        }

        return tennisPrice;
    }
}
