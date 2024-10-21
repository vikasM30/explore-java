package CoreJava.Interface;

interface Initial {

    void call();

}

interface II extends Initial {

    void camera();
}

interface III {

    void game();
}

class IAA implements II {

    @Override
    public void call() {
        System.out.println("IAA calling...");
    }

    @Override
    public void camera() {
        System.out.println("IAA video...");
    }
}

class IBB implements II, III {

    @Override
    public void call() {
        System.out.println("IBB calling...");
    }

    @Override
    public void camera() {
        System.out.println("IBB video...");
    }

    @Override
    public void game() {
        System.out.println("IBB game...");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Initial ai = new IAA();
        II aii = new IAA();

        ai.call();

        aii.call();
        aii.camera();

        Initial i = new IBB();
        II ii = new IBB();
        III iii = new IBB();

        i.call();

        ii.call();
        ii.camera();

        iii.game();
    }
}
