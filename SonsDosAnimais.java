import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SonsDosAnimais {

    public static void main(String[] args) {

        Map<String, String> hinosDosTimes = new HashMap<>();
        

        hinosDosTimes.put("São Paulo", "Salve o tricolor paulista...");
        hinosDosTimes.put("Flamengo", "Uma vez Flamengo, sempre Flamengo...");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do time: ");
        String nomeDoTime = scanner.nextLine();
        
        String hino = hinosDosTimes.get(nomeDoTime);
        
        if (hino != null) {
            System.out.println("Hino do time " + nomeDoTime + ":");
            System.out.println(hino);
        } else {
            System.out.println("Time não encontrado. Verifique o nome.");
        }
    }
}
