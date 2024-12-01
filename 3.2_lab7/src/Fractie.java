public class Fractie implements Numeric{
    double fractie;

    public Fractie(double fractie){
        this.fractie = fractie;
    }

    public double getFractie(){
        return fractie;
    }

    public Numeric add(Numeric num){
        if(num instanceof Fractie){
            Fractie f = (Fractie) num;
            Fractie res = new Fractie(0);
            res.fractie = this.fractie + f.fractie;
            return res;
        }else{
            Complex c = (Complex) num;
            Complex res1 = new Complex(0,0);
            res1.setParteReala(this.fractie + c.getParteReala());
            res1.setParteImaginara(c.getParteImaginara());
            return res1;
        }
    }
    public Numeric substract(Numeric num){
        if(num instanceof Fractie){
            Fractie f = (Fractie) num;
            Fractie res = new Fractie(0);
            res.fractie = this.fractie - f.fractie;
            return res;
        }else{
            Complex c = (Complex) num;
            Complex res1 = new Complex(0,0);
            res1.setParteReala(c.getParteReala() - this.fractie);
            res1.setParteImaginara(c.getParteImaginara());
            return res1;
        }
    }
    public Numeric multiply(Numeric num){
        if(num instanceof Fractie){
            Fractie f = (Fractie) num;
            Fractie res = new Fractie(0);
            res.fractie = this.fractie * f.fractie;
            return res;
        }else{
            Complex c = (Complex) num;
            Complex res1 = new Complex(0,0);
            res1.setParteReala(this.fractie * c.getParteReala());
            res1.setParteImaginara(this.fractie * c.getParteImaginara());
            return res1;
        }
    }

    public String toString() {
        return "Fractia este: " + this.fractie;
    }
}
