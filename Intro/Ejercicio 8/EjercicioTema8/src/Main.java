public class Main {
    public static void main(String[] args) {

        Persona nuevaPersona = new Persona();
        nuevaPersona.setEdad(20);
        nuevaPersona.setNombre("Juan");
        nuevaPersona.setTelefono("001-500-000");

        System.out.println(nuevaPersona.getEdad());
        System.out.println(nuevaPersona.getNombre());
        System.out.println(nuevaPersona.getTelefono());
    }

    public static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
}