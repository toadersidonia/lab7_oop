public class Complex implements Numeric{
    private double parteReala;
    private double parteImaginara;

    public Complex(double parteReala, double parteImaginara) {
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }
    public void setParteReala(double parteReala) {
        this.parteReala = parteReala;
    }
    public double getParteReala(){
        return this.parteReala;
    }
    public double getParteImaginara(){
        return this.parteImaginara;
    }
    public void setParteImaginara(double parteImaginara) {
        this.parteImaginara = parteImaginara;
    }
    public Numeric add(Numeric num){
        if(num instanceof Complex){
            Complex c = (Complex)num;
            Complex res = new Complex(0, 0);
            res.parteReala = this.parteReala + c.parteReala;
            res.parteImaginara = this.parteImaginara + c.parteImaginara;
            return res;
        }else{ //daca e fractie
            Fractie f = (Fractie) num;
            Complex res1 = new Complex(0, 0);
            res1.parteReala = f.getFractie() + this.parteReala;
            res1.parteImaginara = this.parteImaginara;
            return res1;
        }

    }
    public Numeric substract(Numeric num){
        if(num instanceof Complex){
            Complex c = (Complex)num;
            Complex res = new Complex(0, 0);
            res.parteReala = this.parteReala - c.parteReala;
            res.parteImaginara = this.parteReala - c.parteImaginara;
            return res;
        }else{ //daca e fractie
            Fractie f = (Fractie) num;
            Complex res1 = new Complex(0, 0);
            res1.parteReala = f.getFractie() - this.parteReala;
            res1.parteImaginara = this.parteImaginara;
            return res1;
        }

    }
    public Numeric multiply(Numeric num){
        if(num instanceof Complex){
            Complex c = (Complex)num;
            Complex res = new Complex(0, 0);
            res.parteReala = this.parteReala * c.parteReala + this.parteImaginara * c.parteImaginara;
            res.parteImaginara = this.parteReala * c.parteImaginara + this.parteImaginara * c.parteReala;
            return res;
        }else{ //daca e fractie
            Fractie f = (Fractie) num;
            Complex res1 = new Complex(0, 0);
            res1.parteReala = f.getFractie() * this.parteReala;
            res1.parteImaginara = f.getFractie() * this.parteImaginara;
            return res1;
        }

    }
    public String toString(){ ////de completat
        if(this.parteImaginara < 0){
            return "Numarul complex este: " + this.parteReala + "" + this.parteImaginara + "i";
        }else{
            return "Numarul complex este: " + this.parteReala + " + " + this.parteImaginara + "i";
        }
    }

}
