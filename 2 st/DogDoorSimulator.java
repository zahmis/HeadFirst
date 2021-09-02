public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    door.addAllowedBark(new Bark("ouououou"));
    door.addAllowedBark(new Bark("hurutinnosuke"));
    door.addAllowedBark(new Bark("wanwan"));

    BarkRecognizer recognizer = new BarkRecognizer(door);
    // Remote remote = new Remote(door);

    // ブルースが吠え始める
    System.out.println("Bruce starts barking.");
    recognizer.recognize(new Bark("ouououou"));
    System.out.println("\nBruce has gone outside...");


    try {
      Thread.currentThread();
      Thread.sleep(10000);
    } catch (InterruptedException e) { }

    System.out.println("\nBruce all done...");
    System.out.println("...but he's stuck outside!");

     // 偽物が来る
     Bark smallDogBark = new Bark("yip");
     System.out.println("A small dog starts barking.");
     recognizer.recognize(smallDogBark); 

     try {
      Thread.currentThread();
      Thread.sleep(5000);
    } catch (InterruptedException e) { }

    // ブルース戻ってきて吠える
    System.out.println("\nBruce starts barking.");
    recognizer.recognize(new Bark("wanwan"));

    System.out.println("\nBruce's back inside...");


  }
}
