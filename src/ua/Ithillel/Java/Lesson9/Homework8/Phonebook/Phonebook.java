package ua.Ithillel.Java.Lesson9.Homework8.Phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phonebook {
    private static List<Record> contact;


    public Phonebook() {
        this.contact = new ArrayList<>();
    }

    public static void add(Record record) {
        contact.add(record);
    }


    public Record find(String name) {
        for (Record record : contact) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        return contact.stream().filter(element -> element.getName().equals(name)).collect(Collectors.toList());
    }

}