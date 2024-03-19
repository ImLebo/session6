public class Shoes {
    String reference = "";
    float price = 0f;
    int size = 0;
    String photo_route = "";
    boolean send_method = false;
    int cant_colors = 0;

    public Shoes(String reference, float price, int size, String photo_route, boolean send_method, int cant_colors) {
        this.reference = reference;
        this.price = price;
        this.size = size;
        this.photo_route = photo_route;
        this.send_method = send_method;
        this.cant_colors = cant_colors;
    }

    public String getReference() {
        return reference;
    }

    public float getPrice() {
        return price;
    }
    
}
