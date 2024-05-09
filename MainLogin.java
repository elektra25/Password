import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);
        boolean loggedIn = false;

        do {
            System.out.println("Bienvenido, por favor ingrese su correo:");
            String correo = log.nextLine();

            System.out.println("Ingrese su contraseña:");
            String passwordInput = log.nextLine();

            Login login = new Login("jueves2024");

            if (correo.equals("patitocuak@gmail.com") && passwordInput.equals(login.getPassword())) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
                loggedIn = true;
            } else {
                System.out.println("Correo electrónico o contraseña incorrectos. Por favor, verifica los datos ingresados e inténtelo de nuevo.");
            }
        } while (!loggedIn);
    }
}
