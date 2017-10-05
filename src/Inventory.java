import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * Adds Guitar to the Inventory class and is used to search guitar
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1  
 * @Version 1.0 
 * Student: Divya Kasu
 * @since 09-25-2017
 * @param args
 */
public class Inventory {

    private List<Guitar> guitars;

    /**
     *Constructor inventory initializes guitars
     */
    public Inventory() {
    guitars = new LinkedList<>();
  }

    /**
     *
     * @param serialNumber the Guitar serial number
     * @param price the Guitar price
     * @param builder the Guitar builder
     * @param model the Guitar model
     * @param type the Guitar type
     * @param backWood the wood used to cover back part of the Guitar
     * @param topWood the wood used to cover front part of the Guitar
     */
 /**
  * Adds a guitar to the inventory
  */
    public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }

    /**
     * Finds and returns guitar with provided serial number
     * @param serialNumber the Guitar serial number
     * @return the guitar with the given serial number, or null if guitar not found
     */
    public Guitar getGuitar(String serialNumber) {
      for (Guitar guitar : guitars) {
          if (guitar.getSerialNumber().equals(serialNumber)) {
              return guitar;
          }
      }
    return null;
  }

    /**
     * Finds and returns the guitar that matches with the given searchGuitar specifications
     * @param searchGuitar the Guitar with given specifications
     * @return guitar if searchGuitar matches existing guitar or return null if guitar not found
     */
    public Guitar search(Guitar searchGuitar) {
      for (Guitar guitar : guitars) {
          // Ignore serial number since that's unique
          // Ignore price since that's unique
          String builder = searchGuitar.getBuilder();
          if ((builder != null) && (!builder.equals("")) &&
                  (!builder.equals(guitar.getBuilder())))
              continue;
          String model = searchGuitar.getModel();
          if ((model != null) && (!model.equals("")) &&
                  (!model.equals(guitar.getModel())))
              continue;
          String type = searchGuitar.getType();
          if ((type != null) && (!searchGuitar.equals("")) &&
                  (!type.equals(guitar.getType())))
              continue;
          String backWood = searchGuitar.getBackWood();
          if ((backWood != null) && (!backWood.equals("")) &&
                  (!backWood.equals(guitar.getBackWood())))
              continue;
          String topWood = searchGuitar.getTopWood();
          if ((topWood != null) && (!topWood.equals("")) &&
                  (!topWood.equals(guitar.getTopWood())))
              continue;
          return guitar;
      }
    return null;
  }
}
