package ciclos;

public class Ciclos {
    public int start;
    public int end;

    public void showFor(){
        System.out.println("mostrando ciclo for");
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
    }

    public void showWhile(){
        System.out.println("mostrando ciclo while");
        while (start < end){
            System.out.println(start);
            start++;
        }
    }
    public void showDoWhile(){
        System.out.println("mostrando ciclo do while");
        do{
            System.out.println(start);
            start+=2;
        }while (start <= end);
    }
}

