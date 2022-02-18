
package examen1lab2p2_hectoracosta.Personas;

import examen1lab2p2_hectoracosta.Persona;

public class superHuman extends Persona {
    
        private String superPower;

    /**
     * Get the value of superPower
     *
     * @return the value of superPower
     */
    public String getSuperPower() {
        return superPower;
    }

    /**
     * Set the value of superPower
     *
     * @param superPower new value of superPower
     */
    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public superHuman(String superPower, String name, String power, String weakness, boolean Type, int Strength, int mentalStrength, int physicalStrength, boolean hasSquad) {
        super(name, power, weakness, Type, Strength, mentalStrength, physicalStrength, hasSquad);
        this.superPower = superPower;
    }
    
}
