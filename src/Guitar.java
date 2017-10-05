
/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1  
 * @Version 1.0 
 * Student: Divya Kasu
 * @since 09-25-2017
 * Holds all the characteristics of guitar
 */
public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;

  private double price;

    /**
     * Constructor guitar creates new guitar
     * @param serialNumber the Guitar serial number
     * @param price the Guitar price
     * @param builder the Guitar builder
     * @param model the Guitar model
     * @param type the Guitar type
     * @param backWood the wood used to cover back part of the Guitar
     * @param topWood the wood used to cover front part of the Guitar
     */
    public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

    /**
     * Gets the Guitar serial number
     * 
     */
    public String getSerialNumber() {
    return serialNumber;
  }

    /**
     *
     * Gets the Guitar price
     */
    public double getPrice() {
    return price;
  }

    /**
     * Sets new price to the Guitar
     * @param newPrice for the Guitar
     */
    public void setPrice(float newPrice) {
    this.price = newPrice;
  }

    /**
     *
     * Gets the Guitar builder
     */
    public String getBuilder() {
    return builder;
  }

    /**
     *
     * Gets the Guitar model
     */
    public String getModel() {
    return model;
  }

    /**
     *
     * Gets the Guitar type
     */
    public String getType() {
    return type;
  }

    /**
     *
     * Gets the Guitar backWood
     */
    public String getBackWood() {
    return backWood;
  }

    /**
     *
     * Gets the Guitar topWood
     */
    public String getTopWood() {
    return topWood;
  }
}
