package school;

public class Student extends Person{
     
    public static Student Create(String _name,Date _birthdate,Gender _gender)
    {
        Student student = new Student(_name,_birthdate,_gender);
        people.add(student); 
        return (student);
    }    
     Student(String _name,Date _birthdate,Gender _gender) {
        super( _name, _birthdate,  _gender);
    }
    
}
