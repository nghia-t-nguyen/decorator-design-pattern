package decoratordesignpattern;

/**
 * Represents an upgrade to the Player's armor
 * 
 * @author Nghia Nguyen
 *
 */
public class ArmorUpgrade extends PlayerDecorator {
  /**
   * The Player that will receive the armor upgrade
   */
  private Player player;

  /**
   * @param player - passed in to receive an armor upgrade
   */
  public ArmorUpgrade(Player player) {
    this.player = player;
  }

  /**
   * @return a String with the Player's description with an added message of the Player's upgraded
   *         armor
   */
  public String toString() {
    return player.toString() + "\nUpgraded armor";
  }

  /**
   * Increases the player's power level by 3
   * 
   * @return a double with the player's power level
   */
  public double getPower() {
    return player.getPower() + 3;
  }
}
