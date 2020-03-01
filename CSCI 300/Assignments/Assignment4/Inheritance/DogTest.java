// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
   	Yorkshire yorkie = new Yorkshire("Buttercup");
   	System.out.println(yorkie.getName() + " says " + yorkie.speak());
   
   	Labrador lab = new Labrador("Cramer", "black");
   	System.out.println(lab.getName() + " says " + lab.speak());
   
   	System.out.println("The average breed weight for a labrador is " + lab.avgBreedWeight());
   	System.out.println("The average breed weight for a yorkshire is " + yorkie.avgBreedWeight());
    }
}
