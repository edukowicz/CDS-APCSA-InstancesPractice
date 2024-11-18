//This class contains no constructor 

public class MissingCon
{
   private int x;
   private double d;
   private boolean b;
   private String s;
   private Attributes a;
   
   public String toString()
   {
      String output = "Integer Default: " + x + "\n";
      output += "Double Default: " + d + "\n";
      output += "boolean Default: " + b + "\n";
      output += "String Default: " + s + "\n";
      output += "Atributes Default: " + a + "\n";
      return output;
   }
   
   
}