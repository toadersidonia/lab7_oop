public class Student implements Cloneable{
    private String firstname;
    private String lastname;
    Masina m;

    public Student(){
        firstname = "";
        lastname = "";
        m = new Masina();
    }

    public Student(String firstname, String lastname, Masina m) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.m = m;
    }

    public String toString(){
        return "Prenumele: " + firstname + '\n' +
                "Numele: " + lastname + '\n' +
                "Masina: " + m;
    }

    public Masina getMasina(){
        return m;
    }
    protected Object clone() throws CloneNotSupportedException //DEFAULT VERSION
    {
        //return super.clone(); //Pentru shallow copy
        Student s = (Student)super.clone();
        s.m = (Masina)m.clone();
        return s;
    }

}
