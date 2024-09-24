import java.util.ArrayList;
import java.util.Collections;

/**
 * Author: Lucas Jardim
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> Pessoa = new ArrayList<String>();
        Pessoa.add("Roberto");
        Pessoa.add("Rodrigo");
        Pessoa.add("Antonio");
        Pessoa.add("Lucas");
        Pessoa.add("Matheus");
        Pessoa.add("Thiago");

        Collections.sort(Pessoa);

        System.out.println("Lista ordenada por ordem alfabetica: \n"+Pessoa);
    }
}