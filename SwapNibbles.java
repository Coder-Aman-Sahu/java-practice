
class SwapNibbles {
  public static void main(String[] args){
      int n= Integer.valueOf(System.console().readLine());
      int t= ((n&240)>>4) | ((n&15)<<4);
      System.out.println(t);
  }
}
