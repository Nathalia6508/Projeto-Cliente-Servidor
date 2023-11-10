import java.util.Scanner; //importação de um scanner para ler dados do teclado

public class Calculadora {

    Scanner input = new Scanner(System.in); //utilizando o scanner, criei essa variável para ser uma "leitora" de entradas
    public int AreaQuadrado(int lado) {
        int area = lado * lado;

        return area; //retorna a área do quadrado
    }

    public int AreaTrianguloRetangulo(int base, int altura) {
        int area = base * altura / 2;

        return area;
    }
	
    public double AreaCircunferencia(int raio) {
        double area = 0;

        area = Math.PI * raio * raio; //Math.PI importa a constante PI da classe Math, nativa do Java

        return area;
    }
	
    public double AreaEsfera(int raio) {
        double area = 0;

        area = 4 * Math.PI * raio * raio; //Math.PI importa a constante PI da classe Math, nativa do Java

        return area;
    }

    public double VolumeEsfera(int raio){
        double volume = 0;
        //double raio = 0; 

        volume = 4 / 3 * Math.PI * Math.pow(raio, 3); //utilizei o Math.pow para potenciação, ele pega o primeiro valor e eleva à potência do segundo

        return volume;
    }

    public double AreaCilindro(int raio, int altura){
        double area = 0;
        double soma = 0; //como são dois cálculos, essa variável é para separar e organizar o trabalho

        soma = raio + altura;
        area = 2 * Math.PI * raio * soma;

        return area;
    }

    public double VolumeCilindro(int raio, int altura){
        double volume = 0;

        volume = Math.PI * raio * raio * altura;

        return volume;
    }

    public int AreaCubo(int lado){
        int areaQ = 0;
        int areaC = 0;
        
        areaQ = lado * lado;
        areaC = 6 * areaQ;

        return areaC;
    }

    public double VolumeCubo(int lado){
        double volume = 0;
        double areaQ = 0;
        double areaC = 0;

        areaQ = lado * lado;
        areaC = 6 * areaQ;
        volume = Math.pow(areaC, 3);

        return volume;
    }

    
}