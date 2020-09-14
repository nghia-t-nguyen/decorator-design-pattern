package decoratordesignpattern;

/**
 * Represents a player in a fantasy video game
 * 
 * @author Nghia Nguyen
 *
 */
public class Player {
  /**
   * Name of the Player
   */
  protected String name;
  /**
   * Intellect stats of the Player
   */
  protected int intellect;
  /**
   * Defense stats of the Player
   */
  protected int defense;
  /**
   * Attack stats of the Player
   */
  protected int attack;
  /**
   * The weapon the Player is using
   */
  protected String weapon;
  /**
   * The armor the Player is wearing
   */
  protected String armor;


  /**
   * @return a String with the Player's name, weapon, and armor
   */
  public String toString() {
    return name + "\nCarries a " + weapon + ", and wears a " + armor;
  }

  /**
   * @return a double with the power of the Player
   */
  public double getPower() {
    return attack * 3 + defense + intellect / 2;
  }
}
