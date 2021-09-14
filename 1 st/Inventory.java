import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List inventory;

  public Inventory() {
    inventory = new LinkedList();
  }

  public void addInstrument(String serialNumber, double price, GuitarSpec spec) {
    Instrument instrument = null;

    if(spec instanceof GuitarSpec){
      instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
    }
    else if (spec instanceof MandolinSpec){
      instrument = new Mandlin(serialNumber, price, (MandolinSpec)spec);
    }
    inventory.add(instrument);
  }

  public Instrument get(String serialNumber) {
    for (Iterator i = inventory.iterator(); i.hasNext(); ) {
      Instrument instrument = (Instrument)i.next();
      if (instrument.getSerialNumber().equals(serialNumber)) {
        return instrument;
      }
    }
    return null;
  }

  public List search(GuitarSpec searchSpec) {
    List matchingGuitars = new LinkedList();
    for (Iterator i = Inventory.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSpec().matches(searchSpec))
        matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }

  public List search(MandlinSpec searchSpec) {
    List matchingMandlins = new LinkedList();
    for (Iterator i = Inventory.iterator(); i.hasNext(); ) {
      Mandlin mandlin = (Mandlin)i.next();
      if (mandlin.getSpec().matches(searchSpec))
        matchingMandlins.add(mandlin);
    }
    return matchingGuitars;
  }
}
