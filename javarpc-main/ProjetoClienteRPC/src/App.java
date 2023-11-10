//import java.nio.channels.AlreadyBoundException;
import java.util.Scanner; //importa a biblioteca de scanner que lê as entradas do teclado

public class App {
    
    public static void main(String[] args) throws Exception {
    	//DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ); //instancia a classe ClienteRPC para que ela possa ser usada aqui

        int sair = 0;
        int opcao = 1;

        Scanner leitor = new Scanner(System.in);
        do { //estrutura do while para que ele execute pelo menos uma vez e fique repetindo até que o usuário digite 0
            System.out.println("1- Area do Quadrado");
            System.out.println("2- Area do Triangulo Retangulo");
            System.out.println("3- Area da Circunferencia");
            System.out.println("4- Area da Esfera");
            System.out.println("5- Volume da Esfera");
            System.out.println("6- Area do Cilindro");
            System.out.println("7- Volume do Cilindro");
            System.out.println("8- Area da Superficie do Cubo");
            System.out.println("9- Volume do Cubo");
            System.out.println("0- sair ");
            System.out.printf("Digite uma opção: ");
            opcao = leitor.nextInt(); //ler dados do teclado

            switch (opcao) {
                case 0:
                    sair = 1; //vai tornar o valor de sair para 1 e encerrar o programa
                    break;
                case 1:
                    System.out.printf("Informe o lado do quadrado: ");
                    int lado = leitor.nextInt(); //le os dados do teclado
                    int areaQ = rpc.AreaQuadrado(lado); //vai puxar o método de ClienteRPC e pegar os cálculos do servidor
                    System.out.println("Area = " + areaQ); //fornece o valor ao usuário
                    break;
                case 2:
                    System.out.printf("Informe a base do triângulo retângulo: ");
                    int base = leitor.nextInt();
                    System.out.printf("Informe a altura do triângulo retângulo: ");
                    int altura = leitor.nextInt();
                    int areaTR = rpc.AreaTrianguloRetangulo(base, altura); 
                    System.out.println("Area = " + areaTR);
                    break;
                case 3:
                    System.out.printf("Informe o raio da circunferência: ");
                    int raioC = leitor.nextInt();
                    double areaC = rpc.AreaCircunferencia(raioC);
                    System.out.println("Area = " + areaC);
                    break;
                case 4:
                    System.out.printf("Informe o raio da esfera: ");
                    int raioE = leitor.nextInt();
                    double areaE = rpc.AreaEsfera(raioE);
                    System.out.println("Area = " + areaE);
                    break;
                case 5:
                    System.out.printf("Informe o raio da esfera: ");
                    int raio = leitor.nextInt();
                    double volumeE = rpc.AreaEsfera(raio);
                    System.out.println("Volume = " + volumeE);
                    break;
                case 6:
                    System.out.printf("Informe o raio do cilindro: ");
                    int raioCL = leitor.nextInt();
                    System.out.printf("Informe a altura do cilindro: ");
                    int alturaCL = leitor.nextInt();
                    double areaCL = rpc.AreaCilindro(raioCL, alturaCL);     
                    System.out.println("Area = " + areaCL);         
                    break; //erro
                case 7:
                    System.out.printf("Informe o raio do cilindro: ");
                    int raioCL1 = leitor.nextInt();
                    System.out.printf("Informe a altura do cilindro: ");
                    int alturaCL1 = leitor.nextInt();
                    double volumeCL = rpc.AreaCilindro(raioCL1, alturaCL1);     
                    System.out.println("Volume = " + volumeCL);
                    break; //erro
                case 8:
                    System.out.printf("Informe o lado do quadrado: ");
                    int ladoCB = leitor.nextInt(); //le os dados do teclado
                    int areaCB = rpc.AreaCubo(ladoCB); //vai puxar o método de ClienteRPC e pegar os cálculos do servidor
                    System.out.println("Area = " + areaCB); //fornece o valor ao usuário
                    break; //erro
                case 9:
                    System.out.printf("Informe o lado do quadrado: ");
                    int ladoCB1 = leitor.nextInt(); //le os dados do teclado
                    int volumeCB = rpc.AreaCubo(ladoCB1); //vai puxar o método de ClienteRPC e pegar os cálculos do servidor
                    System.out.println("Volume = " + volumeCB); //fornece o valor ao usuário
                    break; //erro
                default:
                    System.out.println("Opção inválida"); //caso o usuário digite um número que não está nas opções
                    break;
            }
        }

        while(sair == 0);
        
    }
}
