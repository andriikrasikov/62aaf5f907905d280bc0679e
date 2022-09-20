package it.hillel.java.lesson10;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {
        FileData fileData1 = new FileData("file1", 50, "1\\2\\3\\4\\5");
        FileData fileData2 = new FileData("file2", 100, "1\\2\\3\\4\\5");
        FileData fileData3 = new FileData("file3", 150, "s1\\2\\3\\4\\5");


        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("1\\2\\3\\4\\5", fileData1);
        fileNavigator.add("1\\2\\3\\4\\5", fileData2);
        fileNavigator.add("1\\2\\3\\4\\5", fileData3);


        System.out.println(fileNavigator.filterBySize((byte) 210));
        System.out.println(fileNavigator.sortBySize());
        System.out.println(fileNavigator.find("1\\2\\3\\4\\5"));

        fileNavigator.remove("1\\2\\3\\4\\5");
    }
}