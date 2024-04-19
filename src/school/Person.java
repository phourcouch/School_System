//Person class=======================


package school;
//import java.util.Calendar;
import java.util.ArrayList;
public class Person {
    public static enum Gender {
        MALE,FEMALE
    }; 
    public static enum Transp {
        WALK,BIKE,CAR,BUS
    };           
    
    public static ArrayList<Person> people = new ArrayList<Person>();     
    
    private String name;
    private Date birthdate;
    private Gender gender;
    private Transp transp = Transp.CAR;
    
    public static Person Create(String _name,Date _birthdate,Gender _gender)
    {
        Person person = new Person(_name,_birthdate,_gender);
        people.add(person); 
        return (person);
    }    
    

    Person() {
        name = "";
        birthdate = new Date(1,1,2000);
        gender = Gender.FEMALE;
    }
    Person(String _name,Date _birthdate,Gender _gender) {
        name = _name;
        birthdate = _birthdate;
        gender = _gender;
    }
    public void setTransp(Transp _transp) {
        transp = _transp;
    }
    public void displayInfo() {
        System.out.println("name = " + name + " birthdate = " + 
        birthdate.getMonth() + "/" + birthdate.getDay() + "/" +
        birthdate.getYear() + 
        " gender = " + gender  + " transp = " + transp);
    }
    public int getAge() {       
        return(birthdate.getYearsOld());
    }
    public String getName() {       
        return(name);
    }    
    public boolean legalTransp() {
        if (transp != Transp.CAR)
            return (true);
        if (birthdate.getYearsOld() < 16)
            return (false);
        return (true);
    }
    public static void displayPeopleOlderThan(int _age){
          System.out.println("====displayPeopleOlderThan " + _age + "======");
        for (Person person: people){
            if (person.getAge() > _age)
                   System.out.println(person.getName());
        }
    }
    public static int numPeopleThatTravelBy(Transp _transp){
        System.out.println("====numPeopleThatTravelBy " + _transp + "======");
        int total = 0;
        for (Person person: people){
             if (person.transp == _transp)
                  total++;
        }
        return (total);
    }
      public static Person oldestFemale(){
          Person retPtr = null;
        for  (Person person: people){
            if (person.gender == Gender.FEMALE ){
                if (retPtr == null)
                    retPtr = person;
                else if (person.birthdate.isOlder(retPtr.birthdate)){
                   retPtr = person;
                }
            }
                
        }
       return (retPtr);
    }
}

 