public class Main {
    public static void main(String[] args) {

        //IF
        int numeroIf = -10;

        if (numeroIf > 0) {
            System.out.println("Numero positivo");
        } else if (numeroIf < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("El numero es 0 (cero)");
        }

        //While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Do while
        do {
            System.out.println("Do while");
            System.out.println(numeroWhile);
        } while (numeroWhile<3);

        //For
        System.out.println("For");
        for(int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println((numeroFor));
        }

        //Switch
        String estacion = "Otono";
        switch (estacion){
            case "Verano":
                System.out.println("Elegiste verano");
                break;
            case "Invierno":
                System.out.println("Elegiste invierno");
                break;
            case "Primavera":
                System.out.println("Elegiste primavera");
                break;
            case "Otono":
                System.out.println("Elegiste otono");
                break;
            default:
                System.out.println("No es una estacion");


        }
    }
}