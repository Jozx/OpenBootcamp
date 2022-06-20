public class Main {
    public static void main(String[] args) {

        int resultado = suma(3,2,5) ;
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.addPuertas();

        System.out.println(miCoche.puertas);

    }

    static int suma (int a, int b, int c) {
        return a + b + c;
    }

    static class Coche {
    public int puertas = 0;


    public void addPuertas(){
        this.puertas++;
    }
    }
}

