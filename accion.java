package Agentes;
import jade.core.behaviours.Behaviour;

public class accion extends Behaviour {
    public void action(){
        System.out.println("Hola Mundo");
    }
    public boolean done(){
        return true;
    }
}
