public class Numbers {
  static int nextAvailableNumber = 6;
  int id = 0; // instance variable
  private Numbers() {
    try {
      Thread.sleep(1000);
    } catch (Exception e) {

    }
    this.id = Numbers.nextAvailableNumber++;
  }
  public static Numbers singleton = null;
  public synchronized static Numbers makeInstance() { // al
    if (Numbers.singleton == null)
      Numbers.singleton = new Numbers();
    return Numbers.singleton;
  }
  public String toString() {
    return "I am number " + this.id;
  }
  public static void main(String[] args) {
    One a = new One();
    a.start();
    (new Two()).start();
    (new Three()).start();
  }
}
