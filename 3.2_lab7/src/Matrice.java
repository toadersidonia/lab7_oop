import java.util.Random;
public class Matrice {
    //prin clasa asta aratam ca putema aduna o matrice de tip complex cu o matrice de tip fractie
    private Numeric[][] a;

    public Matrice(){
        a = new Numeric[4][4];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(i % 2 == 0){
                    a[i][j] = new Complex((double)Math.random() * 10, (double)Math.random() * 10);
                }else{
                    a[i][j] = new Fractie((double)Math.random() * 10); //sa avem si numere de tip fractie
                }
            }
        }
    }

    public void addition(Numeric[][] b){
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ; j < a[i].length; j++){
                a[i][j].add(b[i][j]);
            }
        }
    }

    public void sub(Numeric[][] b){
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ; j < a[i].length; j++){
                a[i][j].substract(b[i][j]);
            }
        }
    }

    public Numeric[][] mult(Numeric[][] b){
        //PP CA AU ACEEASI DIMENSIUNE MATRICILE, n * n
        Numeric[][] aux = new Numeric[a.length][a.length];
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ; j < a.length; j++){
                aux[i][j] = new Complex(0,0);
            }
        }
        Numeric suma = new Complex(0,0);
        for(int i = 0; i < a.length; i++){
            for(int j = 0 ; j < a.length; j++) {
                suma = new Complex(0,0);
                for (int k = 0; k < a.length; k++) {
                    suma = (Numeric)suma.add((Numeric)a[i][k].multiply(b[k][j]));
                }
                aux[i][j] = suma;
            }
        }
        return aux;
    }

    public Numeric[][] getA(){
        return a;
    }

}
