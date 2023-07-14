package semaforo;

public class Semaforo {
    public boolean state;
    public String color;

    public boolean showStatus(){
        return state;
    }
    public String showtraffic(){
        if(color.equals("verde")){
            return "Avance..";
        }else if(color.equals("rojo")){
            return "detenga su vehiculo..";
        }else if(color.equals("amarillo")){
            return "encienda motores..";
        }else{
            return "semaforo dañado";
        }
    }
}

