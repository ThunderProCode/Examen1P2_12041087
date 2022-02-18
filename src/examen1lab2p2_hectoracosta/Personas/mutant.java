package examen1lab2p2_hectoracosta.Personas;

import examen1lab2p2_hectoracosta.Persona;
import java.util.ArrayList;


public class mutant extends Persona {
    
    private ArrayList<String> mutantFactors;
    
    public mutant(String name, String power, String weakness, boolean Type, int Strength, int mentalStrength, int physicalStrength, boolean hasSquad) {
        super(name, power, weakness, Type, Strength, mentalStrength, physicalStrength, hasSquad);
    }

    public ArrayList<String> getMutantFactors() {
        return mutantFactors;
    }

    public void setMutantFactors(ArrayList<String> mutantFactors) {
        this.mutantFactors = mutantFactors;
    }
    
}
