package examen1lab2p2_hectoracosta.Personas;

public class deidad extends extraterrestre {
    
    private boolean hasBelievers;
    private String mythology;

    public deidad(boolean hasBelievers, String mythology, String name, String power, String weakness, boolean Type, int Strength, int mentalStrength, int physicalStrength, boolean hasSquad) {
        super(name, power, weakness, Type, Strength, mentalStrength, physicalStrength, hasSquad);
        this.hasBelievers = hasBelievers;
        this.mythology = mythology;
    }
    
    /**
     * Get the value of mythology
     *
     * @return the value of mythology
     */
    public String getMythology() {
        return mythology;
    }

    /**
     * Set the value of mythology
     *
     * @param mythology new value of mythology
     */
    public void setMythology(String mythology) {
        this.mythology = mythology;
    }

    
    /**
     * Get the value of hasBelievers
     *
     * @return the value of hasBelievers
     */
    public boolean isHasBelievers() {
        return hasBelievers;
    }

    /**
     * Set the value of hasBelievers
     *
     * @param hasBelievers new value of hasBelievers
     */
    public void setHasBelievers(boolean hasBelievers) {
        this.hasBelievers = hasBelievers;
    }

}
