//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Clasa care implementează Cloneable trebuie să suprascrie metoda clone() din Object
        //Numai obiectele care implementeaza Cloneable se pot "clona"
        //Shallow copy: metoda implicita clone() face o o copie superficială a obiectului
        // Referințele din interiorul obiectului sunt copiate, dar obiectele referite rămân aceleași !!!!!!!!
        //Tipurile primitive sunt copiate independent
        //Daca obicetul are referinta catre un alt obiect, se copiaza doar referinta, nu si obiectul in sine
        //FIECARE SCHIMBARE FACUTA PE COPIE PRODUCE SCHIMBARI SI PE OBIECTUL ORIGINAL

        //Pentru a realiza deep copy, trebuie sa suprascriem metoda clone()
        //La deep copy, elementul si clona sunt 100% separate unul de celalalt
        //Tpate campurile sunt copiate independent la fel ca si la shallow copy
        //IN PLUS!!! DACA OBIECTUL ARE CA SI CAMP, O REFERINTA CATRE UN ALT OBIECT, SE FAC COPII SI ACELOR OBIECTE
        //PRIN APELAREA METODEI clone()
        //Orice schimbare facuta pe clona nu se produce si asupra obiectului initial

        Masina m1 = new Masina("alb", "bmw");
        Student s1 = new Student("Ana", "Popa", m1);

        //SHALLOW COPY
        /*try
        {
            Student s2 = (Student) s1.clone();
            System.out.println("Inainte de shallow copy");
            System.out.println(s1);

            s2.getMasina().doRevopsire("Roz");

            System.out.println("Dupa shallow copy");
            System.out.println(s1); //culoarea masinii va fi roz
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }*/
        //DEEP COPY
        try
        {
            Student s2 = (Student) s1.clone();
            System.out.println("Inainte de deep copy");
            System.out.println(s1);

            s2.getMasina().doRevopsire("Roz");

            System.out.println("Dupa deep copy");
            System.out.println(s1); //culoarea masinii va ramane alb
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

    }
}