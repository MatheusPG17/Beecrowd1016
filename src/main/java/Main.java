
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int dist, minutos;
        
        //entrada de dados
        dist = leia.nextInt();
        
        //processamento
        minutos = dist*2;
        
        //saida de dados
        System.out.println(minutos + " minutos");
    }
}
