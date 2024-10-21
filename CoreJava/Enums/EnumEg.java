package CoreJava.Enums;

enum AndroidPhone {
    Samsung, Moto, Vivo, Intel
}

public class EnumEg {
    public static void main(String[] args) {
        AndroidPhone phone = AndroidPhone.Samsung;
        System.out.println(phone.getClass().getSuperclass());
        System.out.println(phone);
        System.out.println(phone.values());
        System.out.println(phone.ordinal());
        System.out.println(phone.name());
        System.out.println();
        
        for (AndroidPhone brand : phone.values()) {
            System.out.println(brand + " : " + brand.ordinal());
        }
    }
}
