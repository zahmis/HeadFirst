public class Guitar extends Instrument{

    // private String serialNumber;
    private int numString;
    // private double price;
    GuitarSpec spec;
  
    public Guitar(String serialNumber, double price, GuitarSpec spec) {
      super(serialNumber, price, spec);
    }

    public int getNumString(){
      return numString;
    }
}
  