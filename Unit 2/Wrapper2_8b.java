public class Wrapper2_8b {

   public static void main(String[] args) {
      Double score1 = new Double(89.45);
      System.out.println("Score1: " + score1);
      Double score2 = new Double(92.38);
      Double score3 = new Double(101.0);
      Double meanScore = (score1 + score2 + score3) / 3;
      System.out.println("Double meanScore: " + meanScore);
      
      double mean2 = meanScore.doubleValue();
      System.out.println("double mean2: " + mean2);
      
      System.out.println("Can do arithmetic between Double and a double " + (mean2 * score1));
   }

}