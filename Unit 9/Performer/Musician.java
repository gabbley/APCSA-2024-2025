public class Musician extends Performer {
   private String instrument;
   
   public Musician() {
      instrument = "Piano";
   }
   
   public Musician(String inst) {
      instrument = inst;
   }
   
   public String getInstrument() {
      return instrument;
   }
   
   public void playInstrument() {
      System.out.println("Making music with my " + instrument);
   }
   

}