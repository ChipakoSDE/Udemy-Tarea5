import java.util.Scanner;

public class TanqueGasolina {
    public static void main(String[] args) {
        String[] estado = {"Insuficiente","Suficiente","Medio Estanque","Estanque 3/4", "Estanque Casi LLeno"};
        Double[] min = {1.0,20.0,35.0,40.0,60.0};
        Double[] max = {20.0,35.0,40.0,60.0,70.0};
        String estadoFinal = "Estanque Lleno";

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la medida actual (entre 1 y 70)");
        double medidaActual = s.nextDouble();
        if (medidaActual > 70 || medidaActual < 1){
            System.out.println("Por favor ingresar un valor entre 1 y 70 litros (dimensiones del estanque)");
        } else {
            for(int i = 0; i< estado.length; i++){
                estadoFinal = (min[i] <= medidaActual && medidaActual < max[i]) ? estado[i] : estadoFinal;
            }
            System.out.println("El tanque esta = " + estadoFinal);

        }

    }
}
