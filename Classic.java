import java.util.ArrayList;

public class Classic {
    ArrayList<Shoes> classic_shoes = new ArrayList<>();

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
}
