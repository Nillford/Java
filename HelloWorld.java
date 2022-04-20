public class HelloWorld {
    public static void main(String[] args) {

        if (args.length != 0) {
            System.out.println("Вы ввели " + args.length + " параметров");
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Вы не передавали параметров");
            System.out.println("Hello World");
        }
    }
}
