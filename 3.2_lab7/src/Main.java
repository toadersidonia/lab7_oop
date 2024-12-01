//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Numeric n1 = new Complex(2.3, 4.5);
        Numeric n2 = new Complex(2, 4);
        System.out.println(n1);

        Numeric n3 = new Fractie(10.55);
        Numeric n4 = new Fractie(4.1);

        Numeric s1 = n1.add(n2);
        System.out.println(s1);

        Numeric s2 = n3.add(n4);
        System.out.println(s2);

        Numeric s3 = n1.add(n3);
        System.out.println(s3);

        Matrice mat = new Matrice();
        Matrice mat1 = new Matrice();
        Numeric[][] rez = mat.mult(mat1.getA());

        for(int i = 0 ; i < rez.length ; i++){
            for(int j = 0 ; j < rez[i].length ; j++){
                System.out.print(rez[i][j] + " ");
            }
            System.out.println();
        }

    }
}