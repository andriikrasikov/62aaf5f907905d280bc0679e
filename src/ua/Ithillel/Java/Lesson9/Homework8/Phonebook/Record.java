package ua.Ithillel.Java.Lesson9.Homework8.Phonebook;

public final class Record {
    private final String name;
    private final String numbers;

    public Record(String name, String numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name= " + name + ", phone=" + numbers;
    }
}
