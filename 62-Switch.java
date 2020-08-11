
class Main {
  public static void main(String[] args) {
    char charOut = 'A';
    switchTest(charOut);
  }
  public static void switchTest(char charIn){
    switch(charIn){
      case 'A':
        System.out.println("it's an A");
        break;
      case 'B':
        System.out.println("it's a B");
        break;
      default:
        System.out.println("wow it's nothing");
        break;
    }
  }
}
