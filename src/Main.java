import com.xjgv.appPersonas.modelo.*;

public class Main {
    public static void main(String[] args) {
            Persona persona = new Persona("Carlos", "Mora", "1234abc", "Calle Olmos 123");
            Empleado empleado = new Empleado("Elias", "Mancilla", "9876bcd", "Calle Encino 222", 1000.00);

        Empleado empleadoNuevo = new Empleado("Fernando", "Montes", "9127xyz", "Calle Abetos 333", 9000.00);
        Gerente gerente = new Gerente("Ricardo", "Serna", "4241kji", "Calle Robles 829", 3000, 10000.00);

        System.out.println(persona);
        System.out.println("*********************");
        System.out.println();
        System.out.println(empleado);
        System.out.println("*********************");
        System.out.println();
        System.out.println(empleadoNuevo);
        System.out.println("*********************");
        System.out.println();
        System.out.println(gerente);
        }
    }
