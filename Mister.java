public class Mister {
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        if ((args[0].equals("Mister")) && (args[1].equals("12345"))) {
            System.out.println("Вас узнали. Добро пожаловать");
        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещён");
        }
    }
}
