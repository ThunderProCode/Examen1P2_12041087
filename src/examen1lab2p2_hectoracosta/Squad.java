package examen1lab2p2_hectoracosta;

import java.util.ArrayList;


public class Squad {
    
    private String name;    
    private String base;
    private Persona leader;
    private boolean Type;
    private ArrayList<Persona> members;

    public Squad(String name, String base, Persona leader, boolean Type) {
        this.name = name;
        this.base = base;
        this.leader = leader;
        this.Type = Type;
    }
    
    /**
     * Get the value of Type
     *
     * @return the value of Type
     */
    public boolean isType() {
        return Type;
    }

    /**
     * Set the value of Type
     *
     * @param Type new value of Type
     */
    public void setType(boolean Type) {
        this.Type = Type;
    }

    
    /**
     * Get the value of base
     *
     * @return the value of base
     */
    public String getBase() {
        return base;
    }

    /**
     * Set the value of base
     *
     * @param base new value of base
     */
    public void setBase(String base) {
        this.base = base;
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
