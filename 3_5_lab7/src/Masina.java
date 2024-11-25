public class Masina implements Cloneable{
    private String culoare;
    private String marca;

    public Masina(){
        culoare = "Negru";
        marca = "Audi";
    }

    public Masina(String culoare, String marca){
        this.culoare = culoare;
        this.marca = marca;
    }

    public void doRevopsire(String culoare){
        this.culoare = culoare;
    }

    public String toString(){
        return "Marca: " + marca + '\n' +
                "Culoare: " + culoare + '\n';
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
