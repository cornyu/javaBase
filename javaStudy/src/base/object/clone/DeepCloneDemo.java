package base.object.clone;

class Employee2 implements Cloneable
{
   private String name;
   private int age;
   private Address2 address2;

   Employee2(String name, int age, Address2 address2)
   {
      this.name = name;
      this.age = age;
      this.address2 = address2;
   }

   @Override
   public Employee2 clone() throws CloneNotSupportedException
   {
      Employee2 e = (Employee2) super.clone();
      ///
      e.address2 = address2.clone();
      return e;
   }

   Address2 getAddress()
   {
      return address2;
   }

   String getName()
   {
      return name;
   }

   int getAge()
   {
      return age;
   }
}

class Address2
{
   private String city;

   Address2(String city)
   {
      this.city = city;
   }

   @Override
   public Address2 clone()
   {
      return new Address2(new String(city));
   }

   String getCity()
   {
      return city;
   }

   void setCity(String city)
   {
      this.city = city;
   }
}

public class DeepCloneDemo
{
   public static void main(String[] args) throws CloneNotSupportedException
   {
      Employee2 e = new Employee2("John Doe", 49, new Address2("Denver"));
      System.out.printf("%s: %d: %s%n", e.getName(), e.getAge(), 
                        e.getAddress().getCity());
     
      Employee2 e2 = (Employee2) e.clone();
      
      System.out.printf("%s: %d: %s%n", e2.getName(), e2.getAge(), 
                        e2.getAddress().getCity());
     
      e.getAddress().setCity("Chicago");
      System.out.printf("%s: %d: %s%n", e.getName(), e.getAge(), 
                        e.getAddress().getCity());
      System.out.printf("%s: %d: %s%n", e2.getName(), e2.getAge(), 
                        e2.getAddress().getCity());
   }
}