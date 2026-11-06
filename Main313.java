import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora: ");
        String hora = sc.next();
        String[] partes = hora.split(":");

        int parte0 = Integer.parseInt(partes[0]);
        int parte1 = Integer.parseInt(partes[1]);


        if (parte0 >= 6 && parte0 <= 11 || hora.equals("12:00")) {
            if (parte1 <= 59 && parte1 >= 0) {
                System.out.println("Buenos días");
            } else {
                System.out.println("Introduce una hora correcta");
            }
        } else if (parte0 >= 12 && parte0 <= 19 || hora.equals("20:00")) {
            if (parte1 <= 59 && parte1 >= 0) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Introduce una hora válida");
            }
        } else if (parte0 >= 20 && parte0 <= 23 || parte0 < 6) {
            if (parte1 <= 59 && parte1 >= 1) {
                System.out.println("Buenas noches");
            } else {
                System.out.println("Introduce una hora válida");
            }
        }
    }

    }
