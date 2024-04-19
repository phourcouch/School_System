//School class=======================


package school;

public class School {

    public static void main(String[] args) {

        Person ptr = Person.Create("Joe",new Date("4/7/2002"),Person.Gender.MALE); 
        ptr.displayInfo();
        System.out.println(ptr.getAge());
        ptr = Person.Create("Judy",new Date("4/7/2012"),Person.Gender.FEMALE);
        ptr.setTransp(Person.Transp.BIKE);
   
        Person fred = Person.Create("Fred",new Date("11/24/2005"),Person.Gender.MALE); 
        Person ann = Person.Create("Ann",new Date("10/15/2010"),Person.Gender.FEMALE);
       ann.setTransp(Person.Transp.BIKE);
        
        ptr = fred;
        if (ptr.legalTransp())
            System.out.println(ptr.getName() + " is legal transp");
        else
            System.out.println(ptr.getName() + " is not legal transp");
        
        
      Person.displayPeopleOlderThan(10);
     System.out.println(Person.numPeopleThatTravelBy(Person.Transp.BIKE));

        Person oldestFemale = Person.oldestFemale();
        if (oldestFemale != null)
            System.out.println("The oldest female is " + oldestFemale.getName());
        else
            System.out.println("There is no oldest female");

    }
    
}

 