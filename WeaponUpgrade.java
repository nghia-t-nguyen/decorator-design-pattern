package decoratordesignpattern;

/**
 * Represents an upgrade to the Player's weapon
 * 
 * @author Nghia Nguyen
 */
public class WeaponUpgrade extends PlayerDecorator {
  /**
   * The Player who will receive the weapon upgrade
   */
  private Player player;

  /**
   * @param player - passed in to receive a weapon upgrade
   */
  public WeaponUpgrade(Player player) {
    this.player = player;
  }

  /**
   * @return a String with the Player's description with an added message of the Player's upgraded
   *         weapon
   */
  public String toString() {
    return player.toString() + "\nUpgraded armor";
  }

  /**
   * Increases the player's power level by 5
   * 
   * @return a double with the player's power level
   */
  public double getPower() {
    return player.getPower() + 5;
  }
}
