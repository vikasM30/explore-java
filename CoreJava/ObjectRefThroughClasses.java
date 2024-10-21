package CoreJava;

class Phone {
    public void call() {
        System.out.println("calling...");
    }
}

class IPhone extends Phone {
    public void call() {
        System.out.println("IPhone calling...");
    }
}

class Android extends Phone {
    public void call() {
        System.out.println("Android calling...");
    }
}

class Call {
    public void call(Phone phone) {
        phone.call();
    }
}

public class ObjectRefThroughClasses {
 public static void main(String[] args) {
    Phone aPhone = new Android();
    Phone iPhone = new IPhone();

    Call call = new Call();
    call.call(aPhone);
 }   
}
