package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }
    
    public String whileLoop() {
        String result = "";

        int count = 0;

        while(count<personArray.length){
            Person currentPerson = personArray[count];
            String person = currentPerson.toString();
            result += person;
            count++;
        }

        return result;
    }



    public String forLoop() {

        String result = "";

        for(int i = 0; i<personArray.length; i++){
            Person currentPerson = personArray[i];
            String person = currentPerson.toString();
            result += person;
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";

        for(Person person : personArray){
            String currentPerson = person.toString();
            result += currentPerson;

        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
