package examen1lab2p2_hectoracosta;

import examen1lab2p2_hectoracosta.Personas.normal;
import java.util.ArrayList;


public class Main {
    
    public static MainScreen MainScreen = new MainScreen();
    public static ArrayList<Persona> heroes = new ArrayList();
    public static ArrayList<Persona> villains = new ArrayList();
    
    public static void main(String[] args) {
      
        MainScreen.visibleMutantProperties(false);
        MainScreen.visibleRadioactiveProperties(false);
        MainScreen.visibleAlienProperties(false);
        MainScreen.visibleDeidadProperties(false);
        MainScreen.visibleExtraterrestreProperties(false);
        MainScreen.visibleSuperhumanProperties(false);
        
//        MainScreen.setSize(303,545);
        MainScreen.setVisible(true);
    }
    
}
