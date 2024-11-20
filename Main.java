// Gribble Starter program      A+CR
class Main {
    public static void main(String[] args) {
      Attributes att = new Attributes();
      System.out.println(att);
      Attributes att2 = new Attributes(3, 6, 9);
      System.out.println(att2);
      Gribble grib = new Gribble();
      System.out.println(grib);
      Gribble grib2 = new Gribble("Ellie");
      System.out.println(grib2);
      Gribble grib3 = new Gribble("hello!", 3.14, new Attributes(1,2,3));
      System.out.println(grib3);
      Gribble grib4 = new Gribble("bye!", 4.13, 6, 5, 4);
      System.out.println(grib4);
      MissingCon con = new MissingCon();
      System.out.println(con);
    }
  }