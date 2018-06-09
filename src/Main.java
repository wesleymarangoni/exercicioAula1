import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        int numero =1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        System.out.println(converteAlgarismos(numero));

    }


    public static String converteAlgarismos(int numero){
        String numeroConvertido = "";

            switch (numero) {
                case 1:
                    numeroConvertido = ("I");
                    break;
                case 2:
                    numeroConvertido = ("II");
                    break;
                case 3:
                    numeroConvertido = ("III");
                    break;
                case 4:
                    numeroConvertido = ("IV");
                    break;
                case 5:
                    numeroConvertido = ("V");
                    break;
                case 6:
                    numeroConvertido = ("VI");
                    break;
                case 7:
                    numeroConvertido = ("VII");
                    break;
                case 8:
                    numeroConvertido = ("VIII");
                    break;
                case 9:
                    numeroConvertido = ("IX");
                    break;
                case 10:
                    numeroConvertido = ("X");
                    break;
                default:
                    numeroConvertido = "Nuvero Invalido";
            }

        return (numeroConvertido);
    }
}
