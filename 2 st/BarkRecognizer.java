import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {

    private DogDoor door;
  
    public BarkRecognizer(DogDoor door) {
      this.door = door;
    }
  
    public void recognize(Bark bark) {
      System.out.println("   BarkRecognizer: Heard a '" +
          bark + "'");
      
      // 認可された鳴き声を取得    
      List<Bark> allowedBarks = door.getAllowedBarks();

      // 鳴き声と比較 ループ処理
      for (Iterator<Bark> i = allowedBarks.iterator(); i.hasNext(); ) {
        Bark allowedBark = (Bark)i.next();

        if (allowedBark.equals(bark)) {
          door.open();
          return;
        }
      } 

      System.out.println("This dog is not allowed.");



      door.open();
    }
  }
  