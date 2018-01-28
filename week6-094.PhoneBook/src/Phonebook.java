/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Sami
 */
public class Phonebook {
    private ArrayList<Person> phonebook;
    
    public Phonebook(){
        phonebook = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        phonebook.add(new Person(name, number));
    }
    
    public void printAll(){
        for (Person person : phonebook){
            System.out.println(person.toString());
        }
    }
    
    public String searchNumber(String name){
        for(Person person : phonebook){
            if(person.getName().equals(name))
                return person.getNumber();
        }
        return "number not known";
    }
}
