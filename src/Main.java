import java.util.Scanner;
//criar um menu pro cara sair quando quiser
public class Main {
    public static void main(String[] args) {
        double saldo = 1500;
        while (saldo > 0) {
            int escolhaCategoria = 0;
            int escolhaSubCategoria = 0;
            double valorCategoria1Sub1 = 100;
            double valorCategoria1Sub2 = 180;
            double valorCategoria1Sub3 = 160;
            double valorCategoria1Sub4 = 300;
            double valorCategoria1Sub5 = 700;

            double valorCategoria2Sub1 = 100;
            double valorCategoria2Sub2 = 380;
            double valorCategoria2Sub3 = 260;
            double valorCategoria2Sub4 = 500;
            double valorCategoria2Sub5 = 600;

            double valorCategoria3Sub1 = 300;
            double valorCategoria3Sub2 = 180;
            double valorCategoria3Sub3 = 260;
            double valorCategoria3Sub4 = 450;
            double valorCategoria3Sub5 = 600;

            double valorCategoria4Sub1 = 150;
            double valorCategoria4Sub2 = 180;
            double valorCategoria4Sub3 = 110;
            double valorCategoria4Sub4 = 330;
            double valorCategoria4Sub5 = 703;

            double valorCategoria5Sub1 = 102;
            double valorCategoria5Sub2 = 180;
            double valorCategoria5Sub3 = 168;
            double valorCategoria5Sub4 = 110;
            double valorCategoria5Sub5 = 50;


            String categoria1 = "[1] Metralhadora";
            String categoria2 = "[2] Pistolas";
            String categoria3 = "[3] Rifles";
            String categoria4 = "[4] Facas";
            String categoria5 = "[5] Arcos";


            System.out.println(categoria1);
            System.out.println(categoria2);
            System.out.println(categoria3);
            System.out.println(categoria4);
            System.out.println(categoria5);

            Scanner entrada = new Scanner(System.in);
            System.out.println("Escolha uma categoria");
            escolhaCategoria = entrada.nextInt();

            switch (escolhaCategoria) {
                case 1:
                    System.out.println("[1] Sub 1 Preço :R$ " + valorCategoria1Sub1);
                    System.out.println("[2] Sub 2 Preço :R$ " + valorCategoria1Sub2);
                    System.out.println("[3] Sub 3 Preço :R$ " + valorCategoria1Sub3);
                    System.out.println("[4] Sub 4 Preço :R$ " + valorCategoria1Sub4);
                    System.out.println("[5] Sub 5 Preço :R$ " + valorCategoria1Sub5);
                    System.out.println("Qual Item deseja comprar: ");
                    escolhaSubCategoria = entrada.nextInt();

                    switch (escolhaSubCategoria) {
                        case 1:
                            if (saldo < valorCategoria1Sub1) {
                                System.out.println("Saldo insuficiente");
                            } else
                                saldo = saldo - valorCategoria1Sub1;

                            atualizaSaldo(saldo);
                            break;
                        case 2:
                            if (saldo < valorCategoria1Sub2) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria1Sub2;
                            atualizaSaldo(saldo);
                            break;
                        case 3:
                            if (saldo < valorCategoria1Sub3) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria1Sub3;
                            atualizaSaldo(saldo);
                            break;
                        case 4:
                            if (saldo < valorCategoria1Sub4) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria1Sub4;
                            atualizaSaldo(saldo);
                            break;
                        case 5:
                            if (saldo < valorCategoria1Sub5) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria1Sub5;
                            atualizaSaldo(saldo);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("[1] Sub 1 Preço :R$ " + valorCategoria2Sub1);
                    System.out.println("[2] Sub 2 Preço :R$ " + valorCategoria2Sub2);
                    System.out.println("[3] Sub 3 Preço :R$ " + valorCategoria2Sub3);
                    System.out.println("[4] Sub 4 Preço :R$ " + valorCategoria2Sub4);
                    System.out.println("[5] Sub 5 Preço :R$ " + valorCategoria2Sub5);
                    System.out.println("Qual Item deseja comprar: ");
                    escolhaSubCategoria = entrada.nextInt();
                    switch (escolhaSubCategoria) {
                        case 1:
                            if (saldo < valorCategoria2Sub1) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria2Sub1;
                            atualizaSaldo(saldo);
                            break;
                        case 2:
                            if (saldo < valorCategoria2Sub2) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria2Sub2;
                            atualizaSaldo(saldo);
                            break;
                        case 3:
                            if (saldo < valorCategoria2Sub3) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria2Sub3;
                            atualizaSaldo(saldo);
                            break;
                        case 4:
                            if (saldo < valorCategoria2Sub4) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria2Sub4;
                            atualizaSaldo(saldo);
                            break;
                        case 5:
                            if (saldo < valorCategoria2Sub5) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria2Sub5;
                            atualizaSaldo(saldo);
                            break;
                        default:
                            System.out.println("Valor invalido");
                    }
                    break;
                case 3:

                    System.out.println("[1] Sub 1 Preço :R$ " + valorCategoria3Sub1);
                    System.out.println("[2] Sub 2 Preço :R$ " + valorCategoria3Sub2);
                    System.out.println("[3] Sub 3 Preço :R$ " + valorCategoria3Sub3);
                    System.out.println("[4] Sub 4 Preço :R$ " + valorCategoria3Sub4);
                    System.out.println("[5] Sub 5 Preço :R$ " + valorCategoria3Sub5);
                    System.out.println("Qual Item deseja comprar: ");
                    escolhaSubCategoria = entrada.nextInt();
                    switch (escolhaSubCategoria) {
                        case 1:
                            if (saldo < valorCategoria3Sub1) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria3Sub1;
                            atualizaSaldo(saldo);
                            break;
                        case 2:
                            if (saldo < valorCategoria3Sub2) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria3Sub2;
                            atualizaSaldo(saldo);
                            break;
                        case 3:
                            if (saldo < valorCategoria3Sub3) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria3Sub3;
                            atualizaSaldo(saldo);
                            break;
                        case 4:
                            if (saldo < valorCategoria3Sub4) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria3Sub4;
                            atualizaSaldo(saldo);
                            break;
                        case 5:
                            if (saldo < valorCategoria3Sub5) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria3Sub5;
                            atualizaSaldo(saldo);
                        default:
                            System.out.println("Valor invalido");
                    }
                    break;
                case 4:
                    System.out.println("[1] Sub 1 Preço :R$ " + valorCategoria4Sub1);
                    System.out.println("[2] Sub 2 Preço :R$ " + valorCategoria4Sub2);
                    System.out.println("[3] Sub 3 Preço :R$ " + valorCategoria4Sub3);
                    System.out.println("[4] Sub 4 Preço :R$ " + valorCategoria4Sub4);
                    System.out.println("[5] Sub 5 Preço :R$ " + valorCategoria4Sub5);
                    System.out.println("Qual Item deseja comprar: ");
                    escolhaSubCategoria = entrada.nextInt();
                    switch (escolhaSubCategoria) {
                        case 1:
                            if (saldo < valorCategoria4Sub1) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria4Sub1;
                            atualizaSaldo(saldo);
                            break;
                        case 2:
                            if (saldo < valorCategoria4Sub2) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria4Sub2;
                            atualizaSaldo(saldo);
                            break;
                        case 3:
                            if (saldo < valorCategoria4Sub3) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria4Sub3;
                            atualizaSaldo(saldo);
                            break;
                        case 4:
                            if (saldo < valorCategoria4Sub4) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria4Sub4;
                            atualizaSaldo(saldo);
                            break;
                        case 5:
                            if (saldo < valorCategoria4Sub5) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria4Sub5;
                            atualizaSaldo(saldo);
                        default:
                            System.out.println("Valor invalido");
                    }
                    break;
                case 5:
                    System.out.println("[1] Sub 1 Preço :R$ " + valorCategoria5Sub1);
                    System.out.println("[2] Sub 2 Preço :R$ " + valorCategoria5Sub2);
                    System.out.println("[3] Sub 3 Preço :R$ " + valorCategoria5Sub3);
                    System.out.println("[4] Sub 4 Preço :R$ " + valorCategoria5Sub4);
                    System.out.println("[5] Sub 5 Preço :R$ " + valorCategoria5Sub5);
                    System.out.println("Qual Item deseja comprar: ");
                    escolhaSubCategoria = entrada.nextInt();
                    switch (escolhaSubCategoria) {
                        case 1:
                            if (saldo < valorCategoria5Sub1) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria5Sub1;
                            atualizaSaldo(saldo);
                            break;
                        case 2:
                            if (saldo < valorCategoria5Sub2) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria5Sub2;
                            atualizaSaldo(saldo);
                            break;
                        case 3:
                            if (saldo < valorCategoria5Sub3) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria5Sub3;
                            atualizaSaldo(saldo);
                            break;
                        case 4:
                            if (saldo < valorCategoria5Sub4) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria5Sub4;
                            atualizaSaldo(saldo);
                            break;
                        case 5:
                            if (saldo < valorCategoria5Sub5) {
                                System.out.println("Saldo insuficiente");
                            } else
                            saldo = saldo - valorCategoria5Sub5;
                            atualizaSaldo(saldo);
                            break;
                        default:
                            System.out.println("Valor invalido");
                    }
                    break;
                default:
                    System.out.println("valor Invalido");
            }

        }
    }
    public static void atualizaSaldo(double saldo){
        System.out.println("Seu Saldo Atual é de: " + saldo);
    }

}
