package semaforo;

public class Main {
    public static void main(String[] args) {
        Semaforo trafficLight = new Semaforo();
        trafficLight.color = "verde";
        trafficLight.state = true;
        if(trafficLight.showStatus()){
            System.out.println("mensaje "+ trafficLight.showtraffic());
        }
    }
}
