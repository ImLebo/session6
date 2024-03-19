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

    public int getSize() {
        return size;
    }

    public String getPhoto_route() {
        return photo_route;
    }

    public boolean isSend_method() {
        return send_method;
    }

    public int getCant_colors() {
        return cant_colors;
    }
    
}
