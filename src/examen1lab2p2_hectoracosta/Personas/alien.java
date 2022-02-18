
package examen1lab2p2_hectoracosta.Personas;


public class alien extends extraterrestre {
    
    private String planet;

    public alien(String name, String power, String weakness, boolean Type, int Strength, int mentalStrength, int physicalStrength, boolean hasSquad, String planet) {
        super(name, power, weakness, Type, Strength, mentalStrength, physicalStrength, hasSquad);
        this.planet = planet;
    }
    
    /**
     * Get the value of planet
     *
     * @return the value of planet
     */
    public String getPlanet() {
        return planet;
    }

    /**
     * Set the value of planet
     *
     * @param planet new value of planet
     */
    public void setPlanet(String planet) {
        this.planet = planet;
    }
    
}
