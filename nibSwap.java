import java.util.*;
class nibSwap{
  public static void main(String args[]){
      int n =7;
      int x = ((n&0xF)<<4) | ((n&0xF0)>>4);
      System.out.println(x);
  }
}
