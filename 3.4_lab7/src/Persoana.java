public class Persoana implements Comparable{
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenumae, int varsta){
        this.nume = nume;
        this.prenume = prenumae;
        this.varsta = varsta;
    }

    public int compareTo(Object o){
        Persoana p = (Persoana) o;
       return nume.compareTo(p.nume);  //in clasa String e implementata metoda comapreTo
       // return varsta - p.varsta;
    }

    public String toString(){
        return nume + " " + prenume + " " + varsta;
    }

}
