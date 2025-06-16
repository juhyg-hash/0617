class Person{
    public static void greet(){
        System.out.println("Holly sheet");
    }
    public void sayHello(){
        System.out.println("HOlly molly");
    }
}
public class Main {
    public static void main(String[] args) {
        //static 함수일때는 이게 호출
        Person.greet();

        Person p = new Person();
        p.sayHello();
//        p.greet();

    }
}