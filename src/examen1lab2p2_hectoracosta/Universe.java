package examen1lab2p2_hectoracosta;

import java.util.ArrayList;

public class Universe {

    
    private String name;
    private ArrayList<Squad> squads;

    public Universe(String name) {
        this.name = name;
    }

    public Universe(String name, ArrayList<Squad> squads) {
        this.name = name;
        this.squads = squads;
    }

    
    
    public ArrayList<Squad> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<Squad> squads) {
        this.squads = squads;
    }
    
    
    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
