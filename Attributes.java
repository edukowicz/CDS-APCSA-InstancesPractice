//Attribute class used in the Gribble

public class Attributes
{
   private int size;
   private int power;
   private int defense;
   
   public Attributes()
   {
      size = 0;
      power = 0;
      defense = 0;
   }
   
   public Attributes(int x, int y, int z)
   {
      size = x;
      power = y;
      defense =z;
   }
   
   public int getSize()
   {
      return size;
   }
   
   public int getPow()
   {
      return power;
   }
   
   public int getDef()
   {
      return defense;
   }
   
   public String toString()
   {
      return "" + size + " - " + power + " - " + defense; 
   }
}