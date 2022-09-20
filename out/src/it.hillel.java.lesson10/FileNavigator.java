package it.hillel.java.lesson10;

import java.util.*;

//task1
public class FileNavigator {
    private final Map<String, List<FileData>> files = new HashMap<>();

    //task2 //7
    public void add(String path, FileData file) throws IllegalAccessException {
        if (!file.path().equals(path)) {
            throw new IllegalAccessException("Wrong path to adding new file, paths are not equal");
        }
        if (files.containsKey(path)) {
            files.get(path).add(file);
        } else {
            List<FileData> newList = new ArrayList<>();
            newList.add(file);
            files.put(path, newList);
        }
    }

    //task3
    public List<FileData> find(String path) {
        return this.files.get(path);
    }

    //task4
    public List<FileData> filterBySize(byte maxSize) {
        List<FileData> allFiles = new ArrayList<>();
        for (List<FileData> value : files.values()) {
            allFiles.addAll(value);
        }
        List<FileData> notHigherThanMaxSize = new ArrayList<>();
        for (FileData file : allFiles) {
            if (file.size() <= maxSize) {
                notHigherThanMaxSize.add(file);
            }
        }
        return notHigherThanMaxSize;
    }

    //task5
    public void remove(String path) {
        files.remove(path);
    }

    //task6
    public List<FileData> sortBySize() {
        List<FileData> sortedBySize = new ArrayList<>();
        for (List<FileData> value : files.values()) {
            sortedBySize.addAll(value);
        }
        sortedBySize.sort(Comparator.comparingInt(FileData::size));
        return sortedBySize;
    }

    //7

}

//task7






















