public class Persona {
    protected int edad;
    protected String nombre;
    protected int telefono;

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}

public class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, int telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

public class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, int telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(30, "Juan", "123456789", 5000.0);
        System.out.println("Cliente:");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Teléfono: " + cliente1.getTelefono());
        System.out.println("Crédito: " + cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador(25, "Ana", "987654321", 8000.0);
        System.out.println("Trabajador:");
        System.out.println("Nombre: " + trabajador1.getNombre());
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Teléfono: " + trabajador1.getTelefono());
        System.out.println("Salario: " + trabajador1.getSalario());
    }
}
