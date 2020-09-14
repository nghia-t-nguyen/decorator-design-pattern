package decoratordesignpattern;

/**
 * Represents a Warrior player
 * 
 * @author Nghia Nguyen
 */
public class Warrior extends Player {
 
  /**
   * Creates a Warrior
   * 
   * @param name - name of the Warrior
   */
  public Warrior(String name) {
    this.name = name;
    this.intellect = 2;
    this.attack = 8;
    this.defense = 5;
    this.weapon = "Sword";
    this.armor = "Breast Plate";
  }

  /**
   * @return a String with the description of the Warrior with name, weapon, and armor
   */
  public String toString() {
    return "Warrior: " + super.toString();
  }
}
