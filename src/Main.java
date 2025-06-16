class Outer{
    String outm = "오이시";
    public class Iner {
        void showMessage() {
            System.out.println(outm);
        }
    }

}
public class Main {
    String outerMessage = "Hello from Outer";

    class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        Main.Inner inner = main.new Inner();

        inner.showMessage();

        Outer outer = new Outer();

        Outer.Iner inn = outer.new Iner();

    }
}