package datosPersonales;

public class Main {
    public static void main(String[] args) {
        Datospersonales datos = new Datospersonales();
        datos.age = 17;
        datos.height= 65;
        datos.name= "Juan Manuel Rodriguez";
        System.out.println("mi nombre es " + datos.name + " tengo " + datos.age + " y peso " + datos.height);
    }
}
