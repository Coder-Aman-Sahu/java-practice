public class FortuneTeller{
    public static void main(String[] args) {
      int fortune = (int)(10 * Math.random());
      String fortuneString;
      switch(fortune) {
        case 0:
          fortuneString = "You will have a great day today!";
          break;
        case 1:
          fortuneString = "You will meet someone special today!";
          break;
        case 2:
          fortuneString = "You will find success in your career!";
          break;
        case 3:
          fortuneString = "You will receive good news soon!";
          break;
        case 4:
          fortuneString = "You will travel to an exotic place soon!";
          break;
        case 5:
          fortuneString = "You will make new friends soon!";
          break;
        case 6:
          fortuneString = "You will receive a gift soon!";
          break;
        case 7:
          fortuneString = "You will learn something new today!";
          break;
        case 8:
          fortuneString = "You will overcome a challenge soon!";
          break;
        default:
          fortuneString = "You will have a peaceful day today!";
      }
      System.out.println(fortuneString);
    }
  }