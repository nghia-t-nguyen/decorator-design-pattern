package decoratordesignpattern;

/**
 * Represents a Player decorator that wraps around a Player to add additional traits to the Player
 * 
 * @author Nghia Nguyen
 *
 */
public abstract class PlayerDecorator extends Player {
  /**
   * @return a String with the Player's description
   */
  public abstract String toString();

  /**
   * @return a double with the Power of the Player
   */
  public abstract double getPower();
}
