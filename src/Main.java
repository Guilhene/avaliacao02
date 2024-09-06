import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro crr = new Carro();

        Scanner sc = new Scanner(System.in);
        boolean desligar = false;

        while (!desligar){

            System.out.print("\nAcelera: ");
            int acelera = sc.nextInt();
            crr.setAcelera(acelera);

            System.out.print("freia: ");
            int freia = sc.nextInt();
            crr.setFreio(freia);

            System.out.print("Desligar: ");
            desligar = sc.nextBoolean();

            System.out.print("Velocidade Atual: " + crr.getExibirVelocidade());


        }
    }
}
