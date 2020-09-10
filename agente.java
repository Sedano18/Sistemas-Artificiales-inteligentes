package agentes;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class agente extends Agent {
    
    protected void setup(){
        this.addBehaviour(new Behaviour(){
            int x=0;
            public void action(){
                System.out.println("x = " + x);
                x+= 1;
            }
            public boolean done(){
                if(x == 100)return true;
                else return false;
            }
        });
        
    }
}
