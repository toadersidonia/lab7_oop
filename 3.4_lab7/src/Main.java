//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Ana" ,"Maria", 30);
        Persoana p2 = new Persoana("Malina" ,"Maria", 14);
        Persoana p3 = new Persoana("Popa" ,"Ana", 25);

        System.out.println(p1.compareTo(p2));

        Persoana[] p = {p1, p2, p3};
        Arrays.sort(p);
        for(int i = 0 ; i < p.length; i++){
            System.out.println(p[i]);
        }
    }
}