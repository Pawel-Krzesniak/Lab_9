package exercise1;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionGenerator.generujNullPointerException();
        } catch (NullPointerException exception) {
            System.out.println("Wystąpił błąd: Próba operacji na obiekcie null!");

            exception.printStackTrace();

            System.out.println("Szczegóły wyjątku: " + exception.toString());
        }
    }
}