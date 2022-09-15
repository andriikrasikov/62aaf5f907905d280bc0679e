package ua.Ithillel.Java.Lesson9.Homework8.Phonebook;

public class Application {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Record Contact1 = new Record("Andrii Kyivstar", "0670000000");
        Record Contact2 = new Record("Andrii MTS","0950000000");
        Record Contact3 = new Record("Tolik", "0500002010");
        Record Contact4 = new Record("Alex", "0631231223");
        phonebook.add(Contact1);
        phonebook.add(Contact2);
        phonebook.add(Contact3);
        phonebook.add(Contact4);
        System.out.println(phonebook.find("Andrii Kyivstar"));
        System.out.println(phonebook.findAll("Tolik"));
    }
}
