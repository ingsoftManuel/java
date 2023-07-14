package ciclos;

public class Mainciclos {
    public static void main(String[] args) {
        Ciclos c1 = new Ciclos();
        c1.start = 2;
        c1.end = 6;
        c1.showFor();

        Ciclos c2 = new Ciclos();
        c2.start = 1;
        c2.end = 5;
        c2.showWhile();

        Ciclos c3 = new Ciclos();
        c3.start = 2;
        c3.end = 10;
        c3.showDoWhile();

    }
}

