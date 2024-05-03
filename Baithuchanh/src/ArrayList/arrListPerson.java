package ArrayList;

import java.util.ArrayList;

import Person.Person;

public class arrListPerson {
    public static void main(String[] args) {
        ArrayList<person> arrayListPersons = new ArrayList<>();
        for (int i = 0 ; i < 3 ; i++){
            person ps = new person();
            ps.EnterData();
            arrayListPersons.add(ps);          
        }
        for (person i : arrayListPersons){
            i.Display();
        }
        
    }
}
   
