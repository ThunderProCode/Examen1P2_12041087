package examen1lab2p2_hectoracosta;

import examen1lab2p2_hectoracosta.EditScreens.EditAlien;
import examen1lab2p2_hectoracosta.EditScreens.EditDeidad;
import examen1lab2p2_hectoracosta.EditScreens.EditMutant;
import examen1lab2p2_hectoracosta.EditScreens.EditNormal;
import examen1lab2p2_hectoracosta.EditScreens.EditRadioactive;
import examen1lab2p2_hectoracosta.EditScreens.EditSuperHuman;
import examen1lab2p2_hectoracosta.Personas.alien;
import examen1lab2p2_hectoracosta.Personas.deidad;
import examen1lab2p2_hectoracosta.Personas.mutant;
import examen1lab2p2_hectoracosta.Personas.normal;
import examen1lab2p2_hectoracosta.Personas.radioactive;
import examen1lab2p2_hectoracosta.Personas.superHuman;
import java.util.ArrayList;


public class Main {
    
    public static MainScreen MainScreen = new MainScreen();
    public static ArrayList<Squad> squads = new ArrayList();
    public static ArrayList<Persona> allPeople = new ArrayList();
    
    public static ArrayList<mutant> mutants =  new ArrayList();
    public static ArrayList<normal> normals =  new ArrayList();
    public static ArrayList<radioactive> radioactives =  new ArrayList();
    public static ArrayList<alien> aliens =  new ArrayList();
    public static ArrayList<deidad> deidades =  new ArrayList();
    public static ArrayList<superHuman> superHumans =  new ArrayList();
    
    public static ArrayList<Persona> heroes = new ArrayList();
    public static ArrayList<Persona> villains = new ArrayList();
    public static ArrayList<Squad> availableSquads = new ArrayList();
    public static ArrayList<Universe> universes = new ArrayList();
    
    public static EditNormal EditNormal= new EditNormal();
    public static EditRadioactive EditRadioactive= new EditRadioactive();
    public static EditDeidad EditDeidad= new EditDeidad();
    public static EditAlien EditAlien= new EditAlien();
    public static EditSuperHuman EditSuperHuman= new EditSuperHuman();
    public static EditMutant EditMutant = new EditMutant();
    
    
    public static void main(String[] args) {
      
       
        initMainScreen();
    }
    
    public static void initMainScreen(){
        MainScreen.visibleMutantProperties(false);
        MainScreen.visibleRadioactiveProperties(false);
        MainScreen.visibleAlienProperties(false);
        MainScreen.visibleDeidadProperties(false);
        MainScreen.visibleExtraterrestreProperties(false);
        MainScreen.visibleSuperhumanProperties(false);
        
        normal newDefaultNormal1 = new normal("Yo","Amarla","Ella",true,150,150,200,false);
        normal newDefaultNormal2 = new normal("Ella","Odiarme","Los fuckboys",false,150,150,200,false);
        normals.add(newDefaultNormal2);
        normals.add(newDefaultNormal1);
        
        Squad newDefaultSquad1 = new Squad("Squad1","TGU",newDefaultNormal1,true);
        Squad newDefaultSquad2 = new Squad("Squad2","SPS",newDefaultNormal2,false);
        
        newDefaultSquad2.setHasUniverse(false);
        
        ArrayList<Squad> defaultUniverse1Squds = new ArrayList();
        defaultUniverse1Squds.add(newDefaultSquad1);
        newDefaultSquad1.setHasUniverse(true);
        Universe newDefaultUniverse1 = new Universe("MCU",defaultUniverse1Squds);
        MainScreen.addUniverse(newDefaultUniverse1);
        
        MainScreen.addSquad(newDefaultSquad1);
        MainScreen.addSquad(newDefaultSquad2);
        
        MainScreen.addHero(newDefaultNormal1);
        MainScreen.addVillain(newDefaultNormal2);
        
        
        MainScreen.setVisible(true);
    }
 
    public static void updateAvailableSquads(){
        ArrayList available = new ArrayList();
        for (Squad squad : squads) {
            if(!squad.isHasUniverse()){
                available.add(squad);
            }
        }
        availableSquads = available;
    }
    
}
