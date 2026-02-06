public class MediaPlayer{
    private String brand;
    private String make;
    private double price;

    public MediaPlayer(String brand, String make, double price){
        this.brand=brand;
        this.make=make;
        this.price=price;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public void displayMediaPlayerInfo(){
        System.out.println("MediaPlayer Info");
        System.out.println("--------------------");
        System.out.println("Brand : "+getBrand());
        System.out.println("Make: "+getMake());
        System.out.println("Price: "+getPrice());
        System.out.println();
    }
}