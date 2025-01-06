package exercise3;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Paweł Krześniak", 2000, "9876543210");

        try {
            account.transfer(2500);
        } catch (InsufficientFundsException e) {
            System.out.println("Błąd: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
        } finally {
            System.out.println("Aktualny stan konta: " + account.getBalance());
            System.out.println("Właściciel konta: " + account.getAccountHolder());
        }
    }
}

