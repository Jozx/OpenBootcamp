public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setEdad(20);
        cliente.setNombre("Juan");
        cliente.setTelefono("001-0002-0003");
        cliente.setCredito(800000);

        System.out.println("Edad " + cliente.getEdad());
        System.out.println("Nombre " + cliente.getNombre());
        System.out.println("Telefono " + cliente.getTelefono());
        System.out.println("Credito " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(3400);
        System.out.println("Salario " + trabajador.getSalario());


    }

    static public class Persona {
         int edad;
         String nombre;
         String telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }

   static public class Cliente extends Persona{
        int credito;

       public int getCredito() {
           return credito;
       }

       public void setCredito(int credito) {
           this.credito = credito;
       }
   }

   static public class Trabajador extends Persona {
        int salario;

       public int getSalario() {
           return salario;
       }

       public void setSalario(int salario) {
           this.salario = salario;
       }
   }
}