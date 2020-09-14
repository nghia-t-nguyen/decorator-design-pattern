package decoratordesignpattern;

/**
 * Represents a Mage player
 * 
 * @author Nghia Nguyen
 */
public class Mage extends Player {

  /**
   * Creates a Mage
   * 
   * @param name - name of the Mage
   */
  public Mage(String name) {
    this.name = name;
    this.intellect = 7;
    this.attack = 3;
    this.defense = 4;
    this.weapon = "Staf";
    this.armor = "Robe";
  }
  
  /**
   * @return a String with the description of the Mage with name, weapon, and armor
   */
  public String toString() {
    return "Mage: " + super.toString();
  }
}
