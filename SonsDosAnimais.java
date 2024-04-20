import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SonsDosAnimais {

    public static void main(String[] args) {
        Map<String, String> sonsDosAnimais = new HashMap<>();
        sonsDosAnimais.put("cachorro", "auau");
        sonsDosAnimais.put("gato", "miau");
        sonsDosAnimais.put("vaca", "muuu");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do animal: ");
        String nomeAnimal = scanner.nextLine().toLowerCase();

        if (sonsDosAnimais.containsKey(nomeAnimal)) {
            String som = sonsDosAnimais.get(nomeAnimal);
            System.out.println("O som do(a) " + nomeAnimal + " é: " + som);
        } else {
            System.out.println("Animal não cadastrado.");
        }
    }
}
