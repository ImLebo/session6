import java.util.ArrayList;

public class Running {
    ArrayList<Shoes> running_shoes = new ArrayList<>();

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
}
