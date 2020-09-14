package decoratordesignpattern;

/**
 * Represents a Player's added skill
 * 
 * @author Nghia Nguyen
 *
 */
public class Skill extends PlayerDecorator {
  /**
   * The Player who will gain skill
   */
  private Player player;

  /**
   * @param player - passed in to gain skill
   */
  public Skill(Player player) {
    this.player = player;
  }

  /**
   * @return a String with the Player's description with an added message of that the player has
   *         gain a skill
   */
  public String toString() {
    return player.toString() + "\nGained a skill";
  }

  /**
   * Increases the Player's power level by 2
   * 
   * @return a double with the Player's power level
   */
  public double getPower() {
    return player.getPower() + 2;
  }
}
