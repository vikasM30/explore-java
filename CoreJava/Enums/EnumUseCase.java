package CoreJava.Enums;

enum PhoneBrand {
    IPhone15(90000), SamsungS4(34000), Motorola;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private PhoneBrand() {
        this.price = 15000;
    }

    private PhoneBrand(int price) {
        this.price = price;
    }
}
public class EnumUseCase {
    
    public static void main(String[] args) {
        for (PhoneBrand val : PhoneBrand.values()) {
            System.out.println("Brand: " + val + ", Price: " + val.getPrice());
        }
    }
    
}
