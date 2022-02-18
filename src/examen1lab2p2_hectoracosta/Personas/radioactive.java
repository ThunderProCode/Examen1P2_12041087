package examen1lab2p2_hectoracosta.Personas;

import examen1lab2p2_hectoracosta.Persona;


public class radioactive extends Persona {
    
    private int age;
    private String accidentType;

    /**
     * Get the value of accidentType
     *
     * @return the value of accidentType
     */
    public String getAccidentType() {
        return accidentType;
    }

    /**
     * Set the value of accidentType
     *
     * @param accidentType new value of accidentType
     */
    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType;
    }

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public radioactive(int age, String accidentType, String name, String power, String weakness, boolean Type, int Strength, int mentalStrength, int physicalStrength, boolean hasSquad) {
        super(name, power, weakness, Type, Strength, mentalStrength, physicalStrength, hasSquad);
        this.age = age;
        this.accidentType = accidentType;
    }
    
    
}
