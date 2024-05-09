import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);

        System.out.println("Bienvenido, por favor ingrese su correo:");
        String correo = log.nextLine();

        System.out.println("Ingrese su contraseña:");
        String password = log.nextLine();

        if (correo.equals("patitocuak@gmail.com") && password.equals("jueves2024")) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Correo electrónico o contraseña incorrectos. Por favor, verifica los datos ingresados e inténtelo de nuevo.");
        }
    }
}
