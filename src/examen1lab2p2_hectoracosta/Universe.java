package examen1lab2p2_hectoracosta;

import java.util.ArrayList;

public class Universe {

    
    private String name;
    private ArrayList<Squad> squads;

    public Universe(String name) {
        this.name = name;
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
