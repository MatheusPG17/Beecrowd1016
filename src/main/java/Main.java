
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int dist, minutos;
        
        dist = leia.nextInt();
        
        minutos = dist*2;
        
        System.out.println(minutos + " minutos");
    }
}
