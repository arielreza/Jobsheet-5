import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        
        String emailBenar = "arielreza@gmail.com";
        String passwordBenar = "123";

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        
        if (email.equals(emailBenar) && password.equals(passwordBenar)) {
            System.out.println("Silahkan Masuk!");
        } else {
            System.out.println("Email dan Password Salah.");
        }

    }
}
