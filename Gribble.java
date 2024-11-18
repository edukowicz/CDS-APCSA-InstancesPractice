//Complete Class for students to test

public class Gribble
{
   private String name;
   private double gribdibble;
   private Attributes abby;
   
   public Gribble()
   {
      name = "Default";
      gribdibble = 3.14;
      abby = new Attributes();
   }
   
   public Gribble(String s)
   {
      name = s;
      gribdibble = 3.14;
      abby = new Attributes();
   }
   
   public Gribble(String s, double gd, Attributes attr)
   {
      name = s;
      gribdibble = gd;
      abby = new Attributes(attr.getSize(), attr.getPow(), attr.getDef());
   }
   
   public Gribble(String s, double gd, int x, int y, int z)
   {
      name = s;
      gribdibble = gd;
      abby = new Attributes(x,y,z);
   }

//New Constructor to be written here
   
     
   public String toString()
   {
      String output = "Name: " + name + "\n";
      output += "Gribscore: " + gribdibble + "\n";
      output += "Size: " + abby.getSize();
      output += "\tPower: " + abby.getPow();
      output += "\tDefence: " + abby.getDef() + "\n";
      return output;   
   }
}
