package examen1lab2p2_hectoracosta;

public class Persona {
    
    private String name;
    private String power;
    private String weakness;
    private boolean Type;
    private int Strength;
    private int mentalStrength;
    private int physicalStrength;
    private boolean hasSquad;

    public Persona(String name, String power, String weakness, boolean Type, int Strength, int mentalStrength, int physicalStrength, boolean hasSquad) {
        this.name = name;
        this.power = power;
        this.weakness = weakness;
        this.Type = Type;
        this.Strength = Strength;
        this.mentalStrength = mentalStrength;
        this.physicalStrength = physicalStrength;
        this.hasSquad = hasSquad;
    }
    
    /**
     * Get the value of hasSquad
     *
     * @return the value of hasSquad
     */
    public boolean isHasSquad() {
        return hasSquad;
    }

    /**
     * Set the value of hasSquad
     *
     * @param hasSquad new value of hasSquad
     */
    public void setHasSquad(boolean hasSquad) {
        this.hasSquad = hasSquad;
    }

    
    /**
     * Get the value of physicalStrength
     *
     * @return the value of physicalStrength
     */
    public int getPhysicalStrength() {
        return physicalStrength;
    }

    /**
     * Set the value of physicalStrength
     *
     * @param physicalStrength new value of physicalStrength
     */
    public void setPhysicalStrength(int physicalStrength) {
        this.physicalStrength = physicalStrength;
    }

    /**
     * Get the value of mentalStrength
     *
     * @return the value of mentalStrength
     */
    public int getMentalStrength() {
        return mentalStrength;
    }

    /**
     * Set the value of mentalStrength
     *
     * @param mentalStrength new value of mentalStrength
     */
    public void setMentalStrength(int mentalStrength) {
        this.mentalStrength = mentalStrength;
    }

    
    /**
     * Get the value of Strength
     *
     * @return the value of Strength
     */
    public int getStrength() {
        return Strength;
    }

    /**
     * Set the value of Strength
     *
     * @param Strength new value of Strength
     */
    public void setStrength(int Strength) {
        this.Strength = Strength;
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
     * Get the value of weakness
     *
     * @return the value of weakness
     */
    public String getWeakness() {
        return weakness;
    }

    /**
     * Set the value of weakness
     *
     * @param weakness new value of weakness
     */
    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    
    /**
     * Get the value of power
     *
     * @return the value of power
     */
    public String getPower() {
        return power;
    }

    /**
     * Set the value of power
     *
     * @param power new value of power
     */
    public void setPower(String power) {
        this.power = power;
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

    @Override
    public String toString() {
        return "Persona: " + "name=" + name + ", power=" + power + ", weakness=" + weakness + ", Type=" + Type + ", Strength=" + Strength + ", mentalStrength=" + mentalStrength + ", physicalStrength=" + physicalStrength + ", hasSquad=" + hasSquad + '}';
    }
    
    
    
}
