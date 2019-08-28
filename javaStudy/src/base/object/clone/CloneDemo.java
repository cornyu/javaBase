package base.object.clone;

public class CloneDemo implements Cloneable
{
   int x;

   public static void main(String[] args) throws CloneNotSupportedException
   {
      CloneDemo cd = new CloneDemo();
      cd.x = 5;
      System.out.printf("cd.x = %d%n", cd.x);
      CloneDemo cd2 = (CloneDemo) cd.clone();      
      System.out.printf("cd2.x = %d%n", cd2.x);
   }
}