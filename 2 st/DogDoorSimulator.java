public class DogDoorSimulator {

  public static void main(String[] args) {
    //準備---------------------------------------------

    // ドア作成
    DogDoor door = new DogDoor();

    // ドアが鳴き声を記憶
    door.addAllowedBark(new Bark("ouououou"));
    door.addAllowedBark(new Bark("hurutinnosuke"));
    door.addAllowedBark(new Bark("wanwan"));

    // 鳴き声認識装置作成
    BarkRecognizer recognizer = new BarkRecognizer(door);
    // Remote remote = new Remote(door);

    //ここまで準備--------------------------------------


    // ここからテスト
    System.out.println("Bruce 吠え始め 1回目");

    // 検証 1
    recognizer.recognize(new Bark("ouououou"));
    System.out.println("\nBruce 外に出る...");


    try {
      Thread.currentThread();
      Thread.sleep(10000);
    } catch (InterruptedException e) { }

    System.out.println("\nBruce 全て用事済ます...");
    System.out.println("...でもまだ外におる!");

     // 偽物が来る
     Bark smallDogBark = new Bark("yip");
     System.out.println("偽物襲来.");

     //検証 2
     recognizer.recognize(smallDogBark); 

     try {
      Thread.currentThread();
      Thread.sleep(5000);
    } catch (InterruptedException e) { }

    // ブルース戻ってきて吠える
    System.out.println("\nBruce 吠え始める 2 回目");

    // 検証 3
    recognizer.recognize(new Bark("wanwan"));
    System.out.println("\nBruce's 中に入る");


  }
}
