package decoratordesignpattern;

/**
 * Represents a Healer
 * 
 * @author Nghia Nguyen
 */
public class Healer extends Player {

  /**
   * Creates a healer
   * 
   * @param name - name of the Healer
   */
  public Healer(String name) {
    this.name = name;
    this.intellect = 8;
    this.attack = 2;
    this.defense = 3;
    this.weapon = "Staf";
    this.armor = "Robe";
  }

  /**
   * @return a String with the description of the Healer with name, weapon, and armor
   */
  public String toString() {
    return "Healer: " + super.toString();
  }
}
